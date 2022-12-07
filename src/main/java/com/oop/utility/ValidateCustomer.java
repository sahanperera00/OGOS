package com.oop.utility;

public class ValidateCustomer {
	public static boolean validate(String email, String password) {
		try {
			CommonConstant.con = ConnectDB.getConnection();
			CommonConstant.stmt = CommonConstant.con.createStatement();
			String sql = "SELECT * FROM customer WHERE email = '" + email + "' and password = '" + password + "'";
			CommonConstant.rs = CommonConstant.stmt.executeQuery(sql);
			
			if(CommonConstant.rs.next()) {
				CommonConstant.isSuccess = true;
				System.out.println("Data validation is Successful!");
			}else {
				CommonConstant.isSuccess = false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return CommonConstant.isSuccess;
	}
}

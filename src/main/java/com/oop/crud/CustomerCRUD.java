package com.oop.crud;

import java.util.ArrayList;
import java.util.List;

import com.oop.model.Customer;
import com.oop.utility.CommonConstant;
import com.oop.utility.ConnectDB;

public class CustomerCRUD {
	public static boolean createCustomer(String title,String fname,String lname,String houseno,String lanename,String streetname,String city,String email,String password, String phone) {
		try {
			CommonConstant.con = ConnectDB.getConnection();
			CommonConstant.stmt = CommonConstant.con.createStatement();
			String sql = "INSERT INTO customer VALUES ('0','"+title+"','"+fname+"','"+lname+"','"+houseno+"','"+lanename+"','"+streetname+"','"+city+"','"+email+"','"+password+"','"+phone+"')";
			int rs = CommonConstant.stmt.executeUpdate(sql);
			
			if(rs > 0) {
				CommonConstant.isSuccess = true;
				System.out.println("Data creation is Successful!");
			}else {
				CommonConstant.isSuccess = false;
				System.out.println("Data creation is Unuccessful!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return CommonConstant.isSuccess;
	}
	
	public static List<Customer> readCustomer(String email_i) {
		ArrayList<Customer> cus = new ArrayList<>();
		
		try {
			CommonConstant.con = ConnectDB.getConnection();
			CommonConstant.stmt = CommonConstant.con.createStatement();
			String sql = "SELECT * FROM customer WHERE email = '" + email_i + "'";
			CommonConstant.rs = CommonConstant.stmt.executeQuery(sql);
			
			while(CommonConstant.rs.next()) {
				int cus_id = CommonConstant.rs.getInt(1);
				String title = CommonConstant.rs.getString(2);
				String fname = CommonConstant.rs.getString(3);
				String lname = CommonConstant.rs.getString(4);
				String houseno = CommonConstant.rs.getString(5);
				String lanename = CommonConstant.rs.getString(6);
				String streetname = CommonConstant.rs.getString(7);
				String city = CommonConstant.rs.getString(8);
				String email = CommonConstant.rs.getString(9);
				String password = CommonConstant.rs.getString(10);
				String phone = CommonConstant.rs.getString(11);
				System.out.println("Data Retrieve is Successful!");
				
				Customer c = new Customer(cus_id,title,fname,lname,houseno,lanename,streetname,city,email,password,phone);
				cus.add(c);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cus;
	}

	public static Customer getCustomer(String email_i) {
		Customer cus = new Customer();
		
		try {
			CommonConstant.con = ConnectDB.getConnection();
			CommonConstant.stmt = CommonConstant.con.createStatement();
			String sql = "SELECT * FROM customer WHERE email = '" + email_i + "'";
			CommonConstant.rs = CommonConstant.stmt.executeQuery(sql);
			
			while(CommonConstant.rs.next()) {
				int cus_id = CommonConstant.rs.getInt(1);
				String title = CommonConstant.rs.getString(2);
				String fname = CommonConstant.rs.getString(3);
				String lname = CommonConstant.rs.getString(4);
				String houseno = CommonConstant.rs.getString(5);
				String lanename = CommonConstant.rs.getString(6);
				String streetname = CommonConstant.rs.getString(7);
				String city = CommonConstant.rs.getString(8);
				String email = CommonConstant.rs.getString(9);
				String password = CommonConstant.rs.getString(10);
				String phone = CommonConstant.rs.getString(11);
				System.out.println("Data Retrieve is Successful!");
				
				cus = new Customer(cus_id,title,fname,lname,houseno,lanename,streetname,city,email,password,phone);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cus;
	}
}

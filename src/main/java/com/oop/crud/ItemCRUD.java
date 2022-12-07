package com.oop.crud;

import java.util.ArrayList;
import java.util.List;

import com.oop.model.Item;
import com.oop.utility.CommonConstant;
import com.oop.utility.ConnectDB;

public class ItemCRUD {
	public static boolean createitem(String name, String price, String qty, String discount, String image) {
		try {
			CommonConstant.con = ConnectDB.getConnection();
			CommonConstant.stmt = CommonConstant.con.createStatement();
			String sql = "INSERT INTO item VALUES (0,'"+name+"','"+price+"','"+qty+"','"+discount+"','"+image+"')";
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
	
	public static List<Item> readitem(int id) {
		ArrayList<Item> itm = new ArrayList<>();
		
		try {
			CommonConstant.con = ConnectDB.getConnection();
			CommonConstant.stmt = CommonConstant.con.createStatement();
			String sql = "SELECT * FROM item WHERE item_id="+id+"";
			CommonConstant.rs = CommonConstant.stmt.executeQuery(sql);
			
			while(CommonConstant.rs.next()) {
				int item_id = CommonConstant.rs.getInt(1);
				String name = CommonConstant.rs.getString(2);
				Double price = CommonConstant.rs.getDouble(3);
				int quantity = CommonConstant.rs.getInt(4);
				Float discount = CommonConstant.rs.getFloat(5);
				String item_image = CommonConstant.rs.getString(6);
				
				Item i = new Item(item_id,name,price,quantity,discount,item_image);
				itm.add(i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return itm;
	}
	
	public static List<Item> readallitems() {
		ArrayList<Item> itm = new ArrayList<>();
		
		try {
			CommonConstant.con = ConnectDB.getConnection();
			CommonConstant.stmt = CommonConstant.con.createStatement();
			String sql = "SELECT * FROM item WHERE quantity > 0";
			CommonConstant.rs = CommonConstant.stmt.executeQuery(sql);
			
			while(CommonConstant.rs.next()) {
				int item_id = CommonConstant.rs.getInt(1);
				String name = CommonConstant.rs.getString(2);
				Double price = CommonConstant.rs.getDouble(3);
				int quantity = CommonConstant.rs.getInt(4);
				Float discount = CommonConstant.rs.getFloat(5);
				String item_image = CommonConstant.rs.getString(6);
				
				Item i = new Item(item_id,name,price,quantity,discount,item_image);
				itm.add(i);
//				System.out.println("Data retreive is Successful!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return itm;
	}
	
	public static boolean updatequantity(String id, String qty) {
		try {
			CommonConstant.con = ConnectDB.getConnection();
			CommonConstant.stmt = CommonConstant.con.createStatement();
			String sql = "UPDATE item SET quantity='"+qty+"' WHERE item_id='"+id+"'";
			int rs = CommonConstant.stmt.executeUpdate(sql);
			
			if(rs > 0) {
				CommonConstant.isSuccess = true;
				System.out.println("Data update is Successful!");
			}else {
				CommonConstant.isSuccess = false;
				System.out.println("Data update is Unuccessful!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return CommonConstant.isSuccess;
	}
}

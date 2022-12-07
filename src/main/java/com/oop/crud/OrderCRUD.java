package com.oop.crud;

import java.util.ArrayList;
import java.util.List;
import com.oop.model.Order;
import com.oop.utility.CommonConstant;
import com.oop.utility.ConnectDB;

public class OrderCRUD {
	public static boolean createOrder(int cus_id, int item_id, int quantity, String type, String address, String date, String time, String note, String ordertime) {
		try {
			CommonConstant.con = ConnectDB.getConnection();
			CommonConstant.stmt = CommonConstant.con.createStatement();
			String sql = "INSERT INTO orders VALUES ('0','"+cus_id+"','"+item_id+"','"+quantity+"','"+type+"','"+address+"','"+date+"','"+time+"','"+note+"','"+ordertime+"',0)";
			int rs = CommonConstant.stmt.executeUpdate(sql);
			
			if(rs > 0) {
				CommonConstant.isSuccess = true;
			}else {
				CommonConstant.isSuccess = false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return CommonConstant.isSuccess;
	}
	
	public static List<Order> readAllOrders(int orderid) {
		List<Order> odr = new ArrayList<>();
		try {
			CommonConstant.con = ConnectDB.getConnection();
			CommonConstant.stmt = CommonConstant.con.createStatement();
			String sql = "SELECT * FROM orders WHERE order_id = "+orderid;
			CommonConstant.rs = CommonConstant.stmt.executeQuery(sql);
			
			while(CommonConstant.rs.next()) {
				int order_id = CommonConstant.rs.getInt(1);
				int cus_id = CommonConstant.rs.getInt(2);
				int item_id = CommonConstant.rs.getInt(3);
				int quantity = CommonConstant.rs.getInt(4);
				String type = CommonConstant.rs.getString(5);
				String address = CommonConstant.rs.getString(6);
				String date = CommonConstant.rs.getString(7);
				String time = CommonConstant.rs.getString(8);
				String note = CommonConstant.rs.getString(9);
				String ordertime = CommonConstant.rs.getString(10);
				int payment = CommonConstant.rs.getInt(11);
				
				Order order = new Order(order_id,cus_id,item_id,quantity,type,address,date,time,note,ordertime,payment);
				odr.add(order);
			}
			System.out.println(odr.size());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return odr;
	}
	
	public static List<Order> readAllCusOrders(int cusid) {
		List<Order> odr = new ArrayList<>();
		try {
			CommonConstant.con = ConnectDB.getConnection();
			CommonConstant.stmt = CommonConstant.con.createStatement();
			String sql = "SELECT * FROM orders WHERE cus_id = "+cusid+" AND payment = 1";
			CommonConstant.rs = CommonConstant.stmt.executeQuery(sql);
			
			while(CommonConstant.rs.next()) {
				int order_id = CommonConstant.rs.getInt(1);
				int cus_id = CommonConstant.rs.getInt(2);
				int item_id = CommonConstant.rs.getInt(3);
				int quantity = CommonConstant.rs.getInt(4);
				String type = CommonConstant.rs.getString(5);
				String address = CommonConstant.rs.getString(6);
				String date = CommonConstant.rs.getString(7);
				String time = CommonConstant.rs.getString(8);
				String note = CommonConstant.rs.getString(9);
				String ordertime = CommonConstant.rs.getString(10);
				int payment = CommonConstant.rs.getInt(11);
				
				Order order = new Order(order_id,cus_id,item_id,quantity,type,address,date,time,note,ordertime,payment);
				odr.add(order);
			}
			System.out.println(odr.size());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return odr;
	}
	
	public static List<Order> readAllUnpayedOrders(int cusid) {
		List<Order> odr = new ArrayList<>();
		try {
			CommonConstant.con = ConnectDB.getConnection();
			CommonConstant.stmt = CommonConstant.con.createStatement();
			String sql = "SELECT * FROM orders WHERE payment = 0 AND cus_id = "+cusid;
			CommonConstant.rs = CommonConstant.stmt.executeQuery(sql);
			
			while(CommonConstant.rs.next()) {
				int order_id = CommonConstant.rs.getInt(1);
				int cus_id = CommonConstant.rs.getInt(2);
				int item_id = CommonConstant.rs.getInt(3);
				int quantity = CommonConstant.rs.getInt(4);
				String type = CommonConstant.rs.getString(5);
				String address = CommonConstant.rs.getString(6);
				String date = CommonConstant.rs.getString(7);
				String time = CommonConstant.rs.getString(8);
				String note = CommonConstant.rs.getString(9);
				String ordertime = CommonConstant.rs.getString(10);
				int payment = CommonConstant.rs.getInt(11);
				
				Order order = new Order(order_id,cus_id,item_id,quantity,type,address,date,time,note,ordertime,payment);
				odr.add(order);
			}
			System.out.println(odr.size());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return odr;
	}
	
	public static boolean updateOrder(int orderid, String address, String date, String time) {
		try {
			CommonConstant.con = ConnectDB.getConnection();
			CommonConstant.stmt = CommonConstant.con.createStatement();
			String sql = "UPDATE orders SET payment = 1, address = '"+address+"', date='"+date+"', time='"+time+"' WHERE order_id="+orderid;
			int rs = CommonConstant.stmt.executeUpdate(sql);
			
			if(rs > 0) {
				CommonConstant.isSuccess = true;
				System.out.println("order updated!");
			}else {
				CommonConstant.isSuccess = false;
				System.out.println("order not updated!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return CommonConstant.isSuccess;
	}
	
	public static boolean deleteOrder(int orderid) {
		try {
			CommonConstant.con = ConnectDB.getConnection();
			CommonConstant.stmt = CommonConstant.con.createStatement();
			String sql = "DELETE FROM orders WHERE order_id="+orderid;
			int rs = CommonConstant.stmt.executeUpdate(sql);
			
			if(rs > 0) {
				CommonConstant.isSuccess = true;
			}else {
				CommonConstant.isSuccess = false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return CommonConstant.isSuccess;
	}
}

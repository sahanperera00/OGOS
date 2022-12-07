package com.oop.crud;

import java.util.ArrayList;
import java.util.List;

import com.oop.model.Cart;
import com.oop.utility.CommonConstant;
import com.oop.utility.ConnectDB;

public class CartCRUD {
	public static List<Cart> getCart(ArrayList<Cart> cartList) {
		List<Cart> cartlist = new ArrayList<>();
		try {
			CommonConstant.con = ConnectDB.getConnection();
			CommonConstant.stmt = CommonConstant.con.createStatement();
			
			for(Cart item: cartList) {
				int id = item.getItem_id();
				
				String sql = "SELECT * FROM item WHERE item_id='"+id+"'";
				CommonConstant.rs = CommonConstant.stmt.executeQuery(sql);
				
				while(CommonConstant.rs.next()) {
					item.setItem_id(CommonConstant.rs.getInt("item_id"));
					item.setItem_name(CommonConstant.rs.getString("item_name"));
					item.setItem_image(CommonConstant.rs.getString("item_image"));
					item.setPrice(CommonConstant.rs.getDouble("price"));
					
					cartlist.add(item);
				}
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cartlist;
	}
}

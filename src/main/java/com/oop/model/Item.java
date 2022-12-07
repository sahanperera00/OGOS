package com.oop.model;

public class Item {
	protected int item_id;
	protected String item_name;
	protected double price;
	protected int quantity;
	protected float discount;
	protected String item_image;
	
	public Item() {}
	
	public Item(int item_id, String item_name, double price, int quantity, float discount, String item_image) {
		this.item_id = item_id;
		this.item_name = item_name;
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;
		this.item_image = item_image;
	}
	
	public int getItem_id() {
		return item_id;
	}
	
	public String getItem_name() {
		return item_name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public float getDiscount() {
		return discount;
	}
	
	public String getItem_image() {
		return item_image;
	}
	
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	public void setItem_image(String item_image) {
		this.item_image = item_image;
	}
}

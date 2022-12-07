package com.oop.model;

public class Order {
	private int order_id;
	private int cus_id;
	private int item_id;
	private int quantity;
	private String type;
	private String address;
	private String date;
	private String time;
	private String note;
	private String ordertime;
	private int payment;
	
	public Order() {}

	public Order(int order_id, int cus_id, int item_id, int quantity, String type, String address, String date, String time, String note, String ordertime, int payment) {
		this.order_id = order_id;
		this.cus_id = cus_id;
		this.item_id = item_id;
		this.quantity = quantity;
		this.type = type;
		this.address = address;
		this.date = date;
		this.time = time;
		this.note = note;
		this.ordertime = ordertime;
		this.payment = payment;
	}

	public int getOrder_id() {
		return order_id;
	}

	public int getCus_id() {
		return cus_id;
	}

	public int getItem_id() {
		return item_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getType() {
		return type;
	}

	public String getAddress() {
		return address;
	}

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}

	public String getNote() {
		return note;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	
}

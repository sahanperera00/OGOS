package com.oop.model;

public class Cart extends Item {
	private int qty;
	
	public Cart() {}
	
	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public void increaseQty(int qnt) {
		this.qty += qnt;
	}
	
/*	private int cart_id;
	private int cus_id;
	private String shippingmethod;
	private String shippingaddress;
	private String shippingdate;
	private String deliverydate;
	private String storename;
	private String pickupdate;
	private String pickuptime;
	private String note;

	public Cart(int cart_id, int cus_id, String shippingmethod, String shippingaddress, String shippingdate, String deliverydate, String storename, String pickupdate, String pickuptime, String note) {
		this.cart_id = cart_id;
		this.cus_id = cus_id;
		this.shippingmethod = shippingmethod;
		this.shippingaddress = shippingaddress;
		this.shippingdate = shippingdate;
		this.deliverydate = deliverydate;
		this.storename = storename;
		this.pickupdate = pickupdate;
		this.pickuptime = pickuptime;
		this.note = note;
	}

	public int getCart_id() {
		return cart_id;
	}

	public int getCus_id() {
		return cus_id;
	}

	public String getShippingmethod() {
		return shippingmethod;
	}

	public String getShippingaddress() {
		return shippingaddress;
	}

	public String getShippingdate() {
		return shippingdate;
	}

	public String getDeliverydate() {
		return deliverydate;
	}

	public String getStorename() {
		return storename;
	}

	public String getPickupdate() {
		return pickupdate;
	}

	public String getPickuptime() {
		return pickuptime;
	}

	public String getNote() {
		return note;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}

	public void setShippingmethod(String shippingmethod) {
		this.shippingmethod = shippingmethod;
	}

	public void setShippingaddress(String shippingaddress) {
		this.shippingaddress = shippingaddress;
	}

	public void setShippingdate(String shippingdate) {
		this.shippingdate = shippingdate;
	}

	public void setDeliverydate(String deliverydate) {
		this.deliverydate = deliverydate;
	}

	public void setStorename(String storename) {
		this.storename = storename;
	}

	public void setPickupdate(String pickupdate) {
		this.pickupdate = pickupdate;
	}

	public void setPickuptime(String pickuptime) {
		this.pickuptime = pickuptime;
	}

	public void setNote(String note) {
		this.note = note;
	}*/
	
	
}

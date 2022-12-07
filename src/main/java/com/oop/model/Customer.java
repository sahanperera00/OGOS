package com.oop.model;

public class Customer {
	private int cus_id;
	private String title;
	private String fname;
	private String lname;
	private String houseno;
	private String lanename;
	private String streetname;
	private String city;
	private String email;
	private String password;
	private String phone;

	public Customer() {}
	
	public Customer(int cus_id, String title, String fname, String lname, String houseno, String lanename,String streetname, String city, String email, String password, String phone) {
		this.cus_id = cus_id;
		this.title = title;
		this.fname = fname;
		this.lname = lname;
		this.houseno = houseno;
		this.lanename = lanename;
		this.streetname = streetname;
		this.city = city;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
	
	public int getCus_id() {
		return cus_id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getFname() {
		return fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public String getHouseno() {
		return houseno;
	}
	
	public String getLanename() {
		return lanename;
	}
	
	public String getStreetname() {
		return streetname;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public void setLanename(String lanename) {
		this.lanename = lanename;
	}
	
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
}

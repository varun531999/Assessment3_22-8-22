package com.example.demo.model;

public class Customer {
	
	 private int cid;

	 private String cname;

	 private String cloginid;

	 private String cloginpassword;

	 private String caddress;

	 private double cphone;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCloginid() {
		return cloginid;
	}

	public void setCloginid(String cloginid) {
		this.cloginid = cloginid;
	}

	public String getCloginpassword() {
		return cloginpassword;
	}

	public void setCloginpassword(String cloginpassword) {
		this.cloginpassword = cloginpassword;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public double getCphone() {
		return cphone;
	}

	public void setCphone(double cphone) {
		this.cphone = cphone;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cloginid=" + cloginid + ", cloginpassword="
				+ cloginpassword + ", caddress=" + caddress + ", cphone=" + cphone + "]";
	}
	

}
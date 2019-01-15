package com.haut.entity;

public class Admin {

	private int aid;
	private String aname;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Admin(int aid, String aname) {
		super();
		this.aid = aid;
		this.aname = aname;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

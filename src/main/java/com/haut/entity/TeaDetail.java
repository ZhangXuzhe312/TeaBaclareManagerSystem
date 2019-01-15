package com.haut.entity;

public class TeaDetail {

	private int tid; //教师号
	private String tname; //教师名
	private String tcollege; //教师所在学院
	private String tposition; //教师职位
	private double balance; //账户余额
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTcollege() {
		return tcollege;
	}
	public void setTcollege(String tcollege) {
		this.tcollege = tcollege;
	}
	public String getTposition() {
		return tposition;
	}
	public void setTposition(String tposition) {
		this.tposition = tposition;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public TeaDetail(int tid, String tname, String tcollege, String tposition, double balance) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tcollege = tcollege;
		this.tposition = tposition;
		this.balance = balance;
	}
	public TeaDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

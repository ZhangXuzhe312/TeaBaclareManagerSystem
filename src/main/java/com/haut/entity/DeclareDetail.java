package com.haut.entity;

import java.awt.Image;
import java.util.Date;

public class DeclareDetail {

	private int did;
	private String ddetails;
	private double daccount;
	private Image dprove;
	private Date dtime;
	private int dstate;
	private int tid;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDdetails() {
		return ddetails;
	}
	public void setDdetails(String ddetails) {
		this.ddetails = ddetails;
	}
	public double getDaccount() {
		return daccount;
	}
	public void setDaccount(double daccount) {
		this.daccount = daccount;
	}
	public Image getDprove() {
		return dprove;
	}
	public void setDprove(Image dprove) {
		this.dprove = dprove;
	}
	public Date getDtime() {
		return dtime;
	}
	public void setDtime(Date dtime) {
		this.dtime = dtime;
	}
	public int getDstate() {
		return dstate;
	}
	public void setDstate(int dstate) {
		this.dstate = dstate;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public DeclareDetail(int did, String ddetails, double daccount, Image dprove, Date dtime, int dstate, int tid) {
		super();
		this.did = did;
		this.ddetails = ddetails;
		this.daccount = daccount;
		this.dprove = dprove;
		this.dtime = dtime;
		this.dstate = dstate;
		this.tid = tid;
	}
	public DeclareDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

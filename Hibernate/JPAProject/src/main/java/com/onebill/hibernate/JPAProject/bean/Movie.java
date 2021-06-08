package com.onebill.hibernate.JPAProject.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	private int mid;
	private String mname;
	private double mrating;
	private String mreview;
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", mrating=" + mrating + ", mreview=" + mreview + "]";
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public double getMrating() {
		return mrating;
	}
	public void setMrating(double mrating) {
		this.mrating = mrating;
	}
	public String getMreview() {
		return mreview;
	}
	public void setMreview(String mreview) {
		this.mreview = mreview;
	}
	
}

package com.practice.webapp.entity;

import java.sql.Date;

public class Check {
	
	private long checkID;
	private String accoountID;
    private Date checkInTime;
    private Date checkOutTime;
    private int workTime;//當週時間
    private double salary;//薪水
    
    public long getCheckID() {
		return checkID;
	}
	public void setCheckID(long checkID) {
		this.checkID = checkID;
	}
	public String getAccoountID() {
		return accoountID;
	}
	public void setAccoountID(String accoountID) {
		this.accoountID = accoountID;
	}
	public Date getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(Date checkInTime) {
		this.checkInTime = checkInTime;
	}
	public Date getCheckOutTime() {
		return checkOutTime;
	}
	public void setCheckOutTime(Date checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	public int getWorkTime() {
		return workTime;
	}
	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
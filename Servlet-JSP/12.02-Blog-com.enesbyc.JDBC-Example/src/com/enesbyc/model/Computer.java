package com.enesbyc.model;

public class Computer {

	private int computerid;
	private String computername;
	private String computerprice;
	private int categoryid;
	
	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public Computer(String computername, String computerprice) {
		super();
		this.computername = computername;
		this.computerprice = computerprice;
	}

	public int getComputerid() {
		return computerid;
	}

	public void setComputerid(int computerid) {
		this.computerid = computerid;
	}

	public String getComputername() {
		return computername;
	}

	public void setComputername(String computername) {
		this.computername = computername;
	}

	public String getComputerprice() {
		return computerprice;
	}

	public void setComputerprice(String computerprice) {
		this.computerprice = computerprice;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	
	
	
}

package com.project.bean;

import java.io.Serializable;

import com.project.util.AccountList;
import com.project.util.Files;

public class Customer implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2306871156666997142L;
	
	private String fname;
	private String lname ;
	private String username;
	private String password;
	private Double balance;

	
	public Customer() {
		super();
		AccountList.customerList.add(this);
		Files.writeCustomerFile(AccountList.customerList);
		
		
	}

	public Customer(String fname, String lname, String username, String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.password = password;
		this.setbalance(0.0);
		AccountList.customerList.add(this);
		Files.writeCustomerFile(AccountList.customerList);
	}

	private void setbalance(double d) {
		// TODO Auto-generated method stub
		
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Customer [fname=" + fname + ", lname=" + lname + ", username=" + username + ", password=" + password + "]";
	}


	
}

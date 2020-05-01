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
	private double initialBalance;
	private int accountNumber;
//	private boolean

	
	public Customer() {
		super();
		AccountList.newcustomer.add(this);
		Files.writeNewCustomerFile(AccountList.newcustomer);
		AccountList.customerList.add(this);
		Files.writeCustomerFile(AccountList.customerList);
		
		
	}

	public Customer(String fname, String lname, String username, String password, int accountNumber) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.password = password;
		this.accountNumber = accountNumber;
		this.setInitialBalance(0.0);
		AccountList.newcustomer.add(this);
		Files.writeNewCustomerFile(AccountList.newcustomer);
		AccountList.customerList.add(this);
		Files.writeCustomerFile(AccountList.customerList);
	}

	

	public Customer(String fname, String lname, String username, int accountNumber) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.setInitialBalance(0.0);
		this.accountNumber = accountNumber;
		AccountList.newcustomer.add(this);
		Files.writeNewCustomerFile(AccountList.newcustomer);
		AccountList.customerList.add(this);
		Files.writeCustomerFile(AccountList.customerList);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
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

	public double getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}
	
	@Override
	public String toString() {
		return "Customer [fname=" + fname + ", lname=" + lname + ", username=" + username + ", password=" + password
				+ ", initialBalance=" + initialBalance + ", accountNumber=" + accountNumber + "]";
	}




	
}

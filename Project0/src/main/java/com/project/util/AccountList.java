package com.project.util;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

import com.project.bean.Customer;
import com.project.menu.AllMenus;

public class AccountList {

	public static List<Customer> customerList = new ArrayList<Customer>();
	public static List<Customer> newcustomer = new ArrayList<Customer>();

	// places new accounts in holding for employee review
	public Customer newCustomer(String firstname, String lastname, String username, String password) {

		Customer newCus = new Customer(firstname, lastname, username, password);

		newcustomer.add(newCus);
		return newCus;
	}
	
	  			//*******CUSTOMER CODES*******
	
	// code will check for username duplicates
	public static Customer exists(String userExist) {
		for (int i = 0; i < customerList.size(); i++) {
			String existingUser = customerList.get(i).getUsername();
			if (userExist.equals(existingUser)) {

				System.out.println("Sorry Username Already Exist. Please try again. ");
				AllMenus.signUp();
			}

		}
		return null;
	}
	
	//CODE WILL CHECK CUSTOMER LOGIN
	public static Object login(String username) {
		for (Customer log: customerList) {
			String user= log.getUsername();
			String pass = log.getPassword();
			if (username.equals(user) && password.equals(pass))
				System.out.println("Welcome Back"+ log.getFname() + " " + log.getLname());
		}
		return null;
		}
	
	public  static 
	
				//********EMPLOYEE CODES************
	
	// code will allow employee to approve or deny accounts

	public static Customer approvalOrDeny() {

		for (Customer nC : newcustomer) {
			System.out.println("NEW ACCOUNTS FOR APPROVALN/" + "ACCOUNT HOLDER FULLNAME: " + nC.getFname() + " "
					+ nC.getLname() + "\n" + "USERNAME: " + nC.getUsername());
		}
		return null;
		
	}
	
	//CODE WILL ALLOW EMPLOYEE TO SEE CUSTOMER INFO
	
		public static Customer employeeCheck(String userInfo) {
			
			for (int i = 0; i < customerList.size(); i++) {
				String customer = customerList.get(i).getUsername();
				if (userInfo.equals(customer)) {
					return customerList.get(i);
				}

			}
			return null;
		}
		
				
		
	
			//*************ADMIN CODE*******************
	
	
	
	
	






//CODE WILL ALLOW ADMIN TO MAKE CHANGES
	


	

	


	

//CODE WILL GIVE EMPLOYEE ACCESS TO CUSTOMER ACCOUNT

}



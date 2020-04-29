package com.project.util;


import java.util.ArrayList;
import java.util.List;

import com.project.bean.Customer;
import com.project.menu.AllMenus;

public class AccountList {
	
	public static List<Customer> customerList = new ArrayList<Customer>();
	
	// code will check for username duplicates 
	public static Customer exists(String userExist) {
		for (int i=0; i< customerList.size(); i++) {
			String existingUser = customerList.get(i).getUsername();
			if (userExist.equals(existingUser)) {
				
				System.out.println("Sorry Username Already Exist. Please try again. ");
				AllMenus.signUp();
			}

			}
		return null;
	}
	
	// code will allow employee to see customer account
	public static Customer employeeCheck(String userInfo) {
		for (int i=0; i< customerList.size(); i++) {
			String eAccess = customerList.get(i).getFname();
			if (userInfo.equals(eAccess)) {
				
				System.out.println("Customer Name: " + i.get);
			
			}

			}
		return null;
	}
	
	
	//code will allow admin to make changes
//	public static Customer adminPriv()
	
//	public static Customer findByUsername (String userInput) {
//		for (int i=0; 1< customerList.size(); i++) {
//			String user = customerList.get(i).getUsername();
//			if input
//		}
//	}
	
	
	
//	public static boolean logIn(ArrayList<Customer> customerList, String User, String Pword) {
//		// Checking the array for the username and password
//		for (Customer c : customerList) {
//			if (c.getUsername().equals(User) && c.getPassword().equals(Pword)) {
//				return true;
//			}
//		}
//		System.out.println("Please try again! Username or Password is incorrect");
//		AllMenus.startMenu();
//		return false;
//	}
	
//	public static List<Customer> customerList = new ArrayList<Customer>();
//	
//	public static Customer findCustomerByUname(String inputUname, String Pword ) {
//		for (int i=0; i< customerList.size(); i++) {
//			String user = customerList.get(i).getUsername();
//			String password = customerList.get(i).getPassword();
//			if (inputUname.equals(user) & Pword.equals(password)) {
//				
//				return customerList.get(i);
//			}
//			
//		}
//		System.out.println("Please try again! Username or Password is incorrect");
//		AllMenus.startMenu();
//		return null;
//	}

}

package com.project.util;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.project.bean.Customer;
import com.project.menu.AllMenus;
import com.project.transactions.BankTransactions;
import com.project.transactions.Options;

public class AccountList {

	static Scanner scan = new Scanner(System.in);
	public static List<Customer> customerList = new ArrayList<Customer>();
	public static List<Customer> newcustomer = new ArrayList<Customer>();

	// *******CUSTOMER CODES*******

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

	// CODE WILL CHECK CUSTOMER LOGIN

	public static Customer login(String user, String pass) {

		for (int i = 0; i < customerList.size(); i++) {
			String customer = customerList.get(i).getUsername();
			String password = customerList.get(i).getPassword();
			if (user.equals(customer) && pass.equals(password)) {
				return customerList.get(i);
			} else {
				System.out.println("Username and/or Password is incorrect.Please try again.");
				Options.signInToAccount();
			}
		}
		return null;
	}

	public static Customer adminCustlogin(String user) {

		for (int i = 0; i < customerList.size(); i++) {
			String customer = customerList.get(i).getUsername();
			if (user.equals(customer)) {
				return customerList.get(i);
			}

		}
		return null;
	}

	// ********EMPLOYEE CODES************

	// code will allow employee to approve or deny accounts

	public static void appDeny() {
		for (Customer nC : newcustomer) {

			System.out.println("NEW ACCOUNTS FOR APPROVAL \n" + "ACCOUNT HOLDER FULLNAME: " + nC.getFname() + " "
					+ nC.getLname() + "\n" + "USERNAME: " + nC.getUsername());

			System.out.println("[A]pproved \n" + "[D]eny");
			String select = scan.nextLine();
			switch (select.toLowerCase()) {
			case "a":
				customerList.add(nC);
				System.out.println("APPROVED!");

				break;
			case "D":
				System.out.println("Denied!");
				scan.nextLine();

				break;

			default:
				System.out.println("Please make another selection");
				break;
			}

		}
		newcustomer.removeAll(newcustomer);
		System.out.println("Empty");
		Files.writeNewCustomerFile(newcustomer);
		AllMenus.employeeOptions();
		return;

	}

	// CODE WILL ALLOW EMPLOYEE TO SEE CUSTOMER INFO

	public static Customer employeeCheck(String userInfo) {

		for (int i = 0; i < customerList.size(); i++) {
			String customer = customerList.get(i).getUsername();
			if (userInfo.equals(customer)) {
				return customerList.get(i);
			}
		}

		return null;
	}

	// *************ADMIN CODE*******************

	public static void cancelAccount() {
		System.out.println("Enter username of Client you will like to remove");
		String username = scan.nextLine();
		for (Customer c : customerList) {

			if (c.getUsername().equals(username)) {
				System.out.println(c.getFname());
				customerList.remove(c);
				System.out.println("Client Removed");
				Files.writeCustomerFile(customerList);
			} else {
				System.out.println();
				System.out.println("Client Account does not exist.");
				break;
			}
		}

	}
}

package com.project.menu;

import java.util.Scanner;

import com.project.bean.Customer;
import com.project.util.AccountList;

public class AllMenus {

	// customer start menu.
	// will contain login and signup options

	static Scanner scan = new Scanner(System.in);

	public static void startMenu() {
		System.out.println("**Welcome To Bank Project Zero**");
		System.out.println("Please Select One Of The Below Options: \n" + "1. Current Customer - Login \n"
				+ "2. New Customer - Create New Account \n" + "3. Quit");
		int selection = Integer.parseInt(scan.nextLine());

		switch(selection) {
		case 1:
//			signInToAccount();
			break;
		case 2:
			signUp();
			break;
		case 3:
			System.out.println("Come Back Soon!");
			break;
			default:
				System.out.println("Please Choose From Selection");
				startMenu();
				break;
		}

	}

	// code for customer login
//	public static void signInToAccount() {
//		System.out.println("Please Login");
//		System.out.println("Username:");
//		String username= scan.nextLine();
//		scan.nextLine();
//		System.out.println("Password:");
//		String password= scan.nextLine();
//		scan.nextLine();
//		scan.nextLine();
//		if (AccountList.logIn(customerList, User, Pword)) {
//			Boolean login = True;
//			bankOption();
//		}
		
//		String userinfo = scan.nextLine();
//		Customer a = AccountList.findCustomerByUname(userinfo, userinfo);
//		System.out.println(userinfo);

//		bankOption();
//	}

	// code for customer banking options
	// need to add create joint account
	public static void bankOption() {
		// try to add name if possible at end of welcome back
		System.out.println("Welcome Back...");
		System.out.println("Please Select One Of The Following:" + "1.Check Balance \n" + "2.Withdraw funds \n"
				+ "3.Deposit funds \n" + "4.Transfer funds \n" + "5.Apply For New Account \n" + "6.Quit \n");
		int options = scan.nextInt();
		switch (options) {
		case 1:

			break;

		case 2:

			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;
		case 6:
			System.out.println("See You Soon");
			startMenu();
			break;

		default:
			System.out.println("Please Try Again");
			bankOption();
			break;
		}
	}
	
	// NEED CODE FOR JOINT ACCOUNT (INSERT)
	
	
	// new customer signup form 
	public static void signUp() {
		System.out.println("Please Complete The Following:");
		System.out.println("FIRST NAME:");
		String customerFname= scan.nextLine();
//		scan.nextLine();
		System.out.println(customerFname);
		System.out.println("LAST NAME:");
		String customerLname=scan.nextLine();
		System.out.println("USERNAME:");
		String customerUsername=scan.nextLine();
		Customer a= AccountList.exists(customerUsername);
		System.out.println("PASSWORD:");
		String customerPassword=scan.nextLine();
		new Customer(customerFname, customerLname, customerUsername, customerPassword);
		System.out.println(AccountList.customerList.toString());
		System.out.println("Would you like to to make this a joint account? (y/n)");
		String jointAccount= scan.nextLine();
		System.out.println("Thanks For Applying! Application Has Been Sent For Approval");
		
		startMenu();
	}
	
	
	// CODE FOR EMPLOYEE LOGIN
	public static void employeeLogin() {
		
		String userEmploy = "JackJill";
		String passEmploy = "uphill";
		System.out.println("Welcome to Employee Portal");
		System.out.println("Please Enter Username and Password");
		System.out.println("Username:");
		String employUsername= scan.nextLine();
	    System.out.println("Password:");
	    String employPassword = scan.nextLine();
	    if (userEmploy.equals(employUsername) && passEmploy.equals(employPassword)) {
	    	System.out.println("Welcome " + userEmploy);
	    	
	    }
	}
	
	//code for admin Login
	public static void adminLogin() {
		
		String userAdmin = "JillJack";
		String passAdmin = "downhill";
		System.out.println("Welcome to Employee Portal");
		System.out.println("Please Enter Username and Password");
		System.out.println("Username:");
		String adminUsername= scan.nextLine();
	    System.out.println("Password:");
	    String adminPassword = scan.nextLine();
	    if (userAdmin.equals(adminUsername) && passAdmin.equals(adminPassword)) {
	    	System.out.println("Welcome " + userAdmin);	
	    	employeeOptions();
	    }
	}
	// employee options
	public static void employeeOptions() {
		System.out.println("1. Approve or Deny Account \n" 
	+ "2. Review Customer info \n"
				+ "3. Quit");
		
		int selection = Integer.parseInt(scan.nextLine());
		switch(selection) {
		case 1:
//			approveDenyAccount();
			break;
		case 2:
			signUp();
			break;
		case 3:
			System.out.println("Logged Out");
			break;
			default:
				System.out.println("Please Choose From Selection");
				startMenu();
				break;
		}
		
		
	}
}



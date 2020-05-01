package com.project.menu;

//USE TO RANDOMLY ASSIGN ACCOUNT NUMBER
import java.util.concurrent.ThreadLocalRandom;

import java.util.Scanner;

import com.project.bean.Customer;
import com.project.transactions.AdminOptions;
import com.project.transactions.BankTransactions;
import com.project.transactions.Options;
import com.project.util.AccountList;
import com.project.util.Files;

public class AllMenus {

	static Scanner scan = new Scanner(System.in);

	// MAIN MENU FOR CLIENT AND EMPLOYEE
	public static void mainStartMenu() {
		System.out.println("**Welcome To Bank Project Zero**");
		System.out.println("Are you a Customer or Employee \n" + "[C]ustomer \n" + "[E]mployee \n" + "[A]dmin");
		String mainSelect = scan.nextLine();

		switch (mainSelect.toLowerCase()) {
		case "c":
			startMenu();

			break;

		case "e":
			employeeLogin(); 

			break;
		case "a":
			adminLogin();
		default:
			break;
		}
	}

//--------------

	// MAIN CLIENT MENU
	public static void startMenu() {
		System.out.println("**Welcome To Bank Project Zero**");
		System.out.println("Please Select One Of The Below Options: \n" + "1. Current Customer - Login \n"
				+ "2. New Customer - Create New Account \n" + "3. Quit");
		int selection = Integer.parseInt(scan.nextLine());
		switch (selection) {
		case 1:
			// DIRECTS CLIENT TO BANKING OPTIONS MENU
			Options.signInToAccount();
			break;
		case 2:
			// DIRECTS CLIENT TO SIGNUP PAGE
			signUp();
			break;
		case 3:
			// WILL REDIRECT CLIENT TO MAIN MENU
			System.out.println("Come Back Soon!");
			mainStartMenu();
			break;
		default:
			System.out.println("Please Choose From Selection");
			startMenu();
			break;
		}
	}

//----------

	// NEW CLIENT SIGNUP FORM
	public static void signUp() {
		System.out.println("Please Complete The Following:");
		System.out.println("FIRST NAME:");
		String customerFname = scan.nextLine();
		System.out.println("LAST NAME:");
		String customerLname = scan.nextLine();
		System.out.println("USERNAME:");
		String customerUsername = scan.nextLine();
		Customer a = AccountList.exists(customerUsername);
		System.out.println("PASSWORD:");
		String customerPassword = scan.nextLine();
		// WILL ASSIGN RANDOM ACCOUNT # AT CREATION
		int acctNum = ThreadLocalRandom.current().nextInt();
		System.out.println();
		new Customer(customerFname, customerLname, customerUsername, customerPassword, acctNum);
		System.out.println(AccountList.newcustomer.toString());
//		System.out.println("Would you like to to make this a joint account? (y/n)");
//		String jointAccount= scan.nextLine();
		System.out.println("Thanks For Applying! Application Has Been Sent For Approval");

		startMenu();
	}

//------------

	// CODE FOR EMPLOYEE LOGIN
	public static void employeeLogin() {

		String userEmploy = "JackJill";
		String passEmploy = "uphill";
		System.out.println("Welcome to Employee Portal");
		System.out.println("Please Enter Username and Password");
		System.out.println("Username:");
		String employUsername = scan.nextLine();
		System.out.println("Password:");
		String employPassword = scan.nextLine();
		if (userEmploy.equals(employUsername) && passEmploy.equals(employPassword)) {
			System.out.println("Welcome " + userEmploy);
			// WILL DIRECT TO EMPLOYEE PORTAL
			employeeOptions();
		} else {
			System.out.println("Wrong Username/Password, Please try again");
			employeeLogin();
		}
	}


//-------------------

//CODE FOR EMPLOYEE TO GRAB CLIENT INFO

	public static void reviewCustomerInfo() {
		System.out.println("Review Customer Information");
		System.out.println("Input Customer Username");
		String checkUser = scan.nextLine();
		Customer check = AccountList.employeeCheck(checkUser);
		System.out.println(check);
		System.out.println("Customer First Name:" + check.getFname() + " \n" + "Customer Last Name: " + check.getLname()
				+ "\n" + "Username: " + check.getUsername() +"\n" + "Account Number(s): " + check.getAccountNumber() + "\n" + "Account Balance: $" + check.getInitialBalance());
		System.out.println("Would You Like To Lookup Another Customer? y/n \n"
				+ "No Will send you to the main employee menu. ");
		String select = scan.nextLine();
		switch (select.toLowerCase()) {
		case "y":
			reviewCustomerInfo();
			scan.nextLine();
			break;
		case "n":
			employeeOptions();
			break;
		default:
//			System.out.println("Please try again");
			break;
		}
	}

//------------------------------

//CODE FOR EMPLOYEE OPTIONS
	public static void employeeOptions() {
		System.out.println("[A]pprove or Deny Account \n" + "[R]eview Customer info \n" + "[Q]uit");
		String selection = scan.nextLine();
		switch (selection.toLowerCase()) {
		case "a":
			approveDenyAccount();
			break;

		case "r":
			reviewCustomerInfo();
			break;
		case "q":
			System.out.println("Logged Out");
			mainStartMenu();
			break;
		default:
			System.out.println("Please Choose From Selection");
			startMenu();
			break;
		}
	}

//-----------------------------
	
	//CALLING METHOD FOR EMPLOYEE TO APPROVE ACCOUNTS

	public static void approveDenyAccount() {
		AccountList.appDeny();
	}
	
	
	//------
		// CODE FOR ADMIN LOGIN
		public static void adminLogin() {

			String userAdmin = "JIllJack";
			String passAdmin = "downhill";
			System.out.println("Welcome to Admin Portal");
			System.out.println("Please Enter Username and Password");
			System.out.println("Username:");
			String adminUsername = scan.nextLine();
			System.out.println("Password:");
			String adminPassword = scan.nextLine();
			adminOptions();
			if (userAdmin.equals(adminUsername) && passAdmin.equals(adminPassword)) {
				System.out.println("Welcome " + userAdmin);
				adminOptions();
			}else {
				System.out.println("Wrong Username/Password, Please try again");
				adminLogin();
			}
		}

//------------------------------------
		//ADMIN CODE FOR ADMIN PORTAL
		public static void adminOptions() {
			System.out.println("[A]pprove or Deny Account \n" + "[R]eview Customer info \n" + "[M]ake Despoist, Withdraws, Transfers  or Cancel Account\n" + "[C]ancel Account \n"+  "[Q]uit");
			String selection = scan.nextLine();
			switch (selection.toLowerCase()) {
			case "a":
				approveDenyAccount();
				break;

			case "r":
				reviewCustomerInfo();
				break;
			
			case "m":
				AdminOptions.AdOptions();
				break;
			case "c":
				AdminOptions.cancelAccount();
				break;
				
			case "q":
				System.out.println("Logged Out");
				mainStartMenu();
				break;
			default:
				System.out.println("Please Choose From Selection");
				startMenu();
				break;
			}
		}
		
//	public static void cancelAccount() {
//			
//			System.out.println("CANCEL ACCOUNT");
//			System.out.println("Input Customer Username");
//			String checkUser = scan.nextLine();
//			Customer check = AccountList.employeeCheck(checkUser);
//			System.out.println("Customer First Name:" + check.getFname() + " \n" + "Customer Last Name: " + check.getLname()
//					+ "\n" + "Username: " + check.getUsername() +"\n" + "Account Number(s): " + check.getAccountNumber() + "\n" + "Account Balance: $" + check.getInitialBalance());
//			boolean 
//			scan.nextLine();
//			System.out.println("Would You Like To Lookup Another Customer? y/n \n"
//					+ "No Will send you to the main employee menu. ");
//			String select1 = scan.nextLine();
//			switch (select1.toLowerCase()) {
//			case "y":
//				AllMenus.reviewCustomerInfo();
//				scan.nextLine();
//				break;
//			case "n":
//				AllMenus.employeeOptions();
//				break;
//			default:
////				System.out.println("Please try again");
//				break;
//			}
//		}
}

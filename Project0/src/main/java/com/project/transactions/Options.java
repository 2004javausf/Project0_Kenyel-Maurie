package com.project.transactions;

import java.util.Arrays;
import java.util.Scanner;

import com.project.bean.Customer;
import com.project.menu.AllMenus;
import com.project.util.AccountList;

public class Options {
	static Scanner scan = new Scanner(System.in);

	// Will sign client into account
	public static  void signInToAccount() {
	System.out.println("Please SignIn");
	System.out.println("Username:");
	String checkUser = scan.nextLine();
	System.out.println("Password:");
	String pWord = scan.nextLine();
	Customer check = AccountList.login(checkUser, pWord);
	System.out.println("Welcome Back " + check.getFname());
	System.out.println("Select account to view");
 BankTransactions.mainMenu();
//	scan.nextLine(); 

int selection1 = 0;
do{
	 	 
	 int selection11 = scan.nextInt();
	 
		switch (selection11) {
		case 1:
			BankTransactions.obtainBalance(check);	
			BankTransactions.mainMenu();
			scan.nextLine(); 
					break;
			
		case 2:
			BankTransactions.withdrawal(check);
			System.out.println("*********************************");
			BankTransactions.mainMenu();
			scan.nextLine(); 
			
				break;
			
		case 3 :
			BankTransactions.deposit(check);
			System.out.println("*********************************");
			BankTransactions.mainMenu();
			scan.nextLine();
						break;
		//Transfer funds
		case 4: 
			BankTransactions.transfer();
			System.out.println("*********************************");
			BankTransactions.mainMenu();
			break;
		//Apply For New Account
		case 5:
			System.out.println("Please complete the below for new account.");
			BankTransactions.newAccountSignUp();
			break;
			//6.Quit	
		case 6: 
			AllMenus.mainStartMenu();
			break;
					
	}	 
	 
} while(selection1!=6);;
	}
}

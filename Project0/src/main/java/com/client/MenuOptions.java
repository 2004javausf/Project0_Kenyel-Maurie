package com.client;

import java.util.Scanner;

public class MenuOptions {

	public static Scanner menu = new Scanner (System.in);
	public static Scanner branch = new Scanner (System.in);
	
	static int account = 555555555;
	static int account2 = 555555655;
	
	public static void main(String[] args) {
		
//		System.out.println("Hi Welcome to Bank Project-0\n"
//				+ "Please Login\n"
//				+ "Please register" );
		
		System.out.println("Please select account: \n"
				+ "1."+ account + "\n"
				+ "2."+ account2 +"\n");

	    int accountselect = branch.nextInt();
	    int selection = menu.nextInt();
	    while(selection !=6) {	
	switch (accountselect) {
	case 1:
		System.out.println("What would you like to do to? Please make a selection below:\n"
				+ "1.Check Balance \n"
				+ "2.Withdraw funds \n"
				+ "3.Deposit funds \n"
				+ "4.Transfer funds \n"
				+ "5.Apply For New Account \n"
				+ "6.Quit \n"	
				);
		
		
		
		
		
		switch (selection) {
		case 1:
				System.out.println("Your Balance is ");			
			
			break;

		case 2:
			System.out.println("Withdraw funds");
			
			break;
			
		case 3:
			System.out.println("Deposit funds");
			
			break;
			
			
		case 4:
			System.out.println("Transfer funds");
			
			break;
			
			
		case 5:
			System.out.println("Apply For New Account");
			
			break;
			
		case 6:			
			break;
		}
		
		
		}
		
		
	}
	}
}


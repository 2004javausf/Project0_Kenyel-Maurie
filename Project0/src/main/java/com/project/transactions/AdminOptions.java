package com.project.transactions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.project.bean.Customer;
import com.project.util.AccountList;

public class AdminOptions {
	public static List<Customer> customerList = new ArrayList<Customer>();
	static Scanner scan = new Scanner(System.in);
	
	public static int adminMainOptions() {
		System.out.println("What would you like to do to? Please make a selection below:\n"
				+ "1.Check Balance \n"
				+ "2.Withdraw funds \n"
				+ "3.Deposit funds \n"
				+ "4.Transfer funds \n"
				+ "5.Cancel Account \n"
				+ "7.Quit \n"	
				);
		return 0;
	}
	
	public static void AdOptions(){
	System.out.println("Please enter client user name");
	String checkUser = scan.nextLine();
   Customer check= AccountList.adminCustlogin(checkUser);
   System.out.println("You are viewing " + check.getFname()+ " " + check.getLname() + " Bank Account.");
   adminMainOptions();
   int selection1 = 0;
   do{
   	 	 
   	 int selection11 = scan.nextInt();
   	 
   		switch (selection11) {
   		case 1:
   			BankTransactions.obtainBalance(check);	
   			adminMainOptions();
   			scan.nextLine(); 
   					break;
   			
   		case 2:
   			BankTransactions.withdrawal(check);
   			System.out.println("*********************************");
   			adminMainOptions();
   			scan.nextLine(); 
   			
   				break;
   			
   		case 3 :
   			BankTransactions.deposit(check);
   			System.out.println("*********************************");
   			adminMainOptions();
   			scan.nextLine();
   						break;
   		//Transfer funds
   		case 4: 
   			BankTransactions.adminTransfer();
   			System.out.println("*********************************");
   			adminMainOptions();
   			break;
   			
   		case 5: 
   			cancelAccount();
   			System.out.println("*********************************");
   			adminMainOptions();
   	   		break;	
   		case 6: 

   			break;
   					
   	}	 
   	 
   } while(selection1!=6);;
   	}
	
public static void cancelAccount() {
	for (Customer cancel: customerList) {
		System.out.println("Enter Username");
		String user = scan.nextLine();
		if(user.equals(cancel)) {
			System.out.println(user);
			
		}
	}
}

   }




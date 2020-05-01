package com.project.transactions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.project.bean.Customer;
import com.project.menu.AllMenus;
import com.project.util.AccountList;
import com.project.util.Files;

public class AdminOptions {
	public static List<Customer> customerList = new ArrayList<Customer>();
	static Scanner scan = new Scanner(System.in);
	
	public static int adminMainOptions() {
		System.out.println("What would you like to do to? Please make a selection below:\n"
				+ "1.Check Balance \n"
				+ "2.Withdraw funds \n"
				+ "3.Deposit funds \n"
				+ "4.Transfer funds \n"
				+ "5.Quit \n"	
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
          AllMenus.adminOptions();
   			break;
   					
   	}	 
   	 
   } while(selection1!=5);;
   	}
	

	
	//Why did this not work here
	
//	public static void cancelAccount() {
//
//for(Customer cus: customerList) {
//	System.out.println("Enter username of Client you will like to remove");
//	String username = scan.nextLine();
//	if (c.getUsername().equals(username)) {
//	System.out.println(c.getFname());
//	break;
////	customerList.remove(c);
////	System.out.println("Client Removed");
////	Files.writeCustomerFile(customerList);
//	}else {
//		System.out.println();
//		System.out.println("DONE");
//		break;
//	}
//}
//
//	}



}

   




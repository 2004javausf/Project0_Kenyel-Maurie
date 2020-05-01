package com.project.transactions;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import com.project.bean.Customer;
import com.project.util.AccountList;
import com.project.util.Files;

public class BankTransactions {
	static Scanner scan = new Scanner(System.in);

	//Client Banking Menu
	public static int mainMenu() {
		System.out.println("What would you like to do to? Please make a selection below:\n"
				+ "1.Check Balance \n"
				+ "2.Withdraw funds \n"
				+ "3.Deposit funds \n"
				+ "4.Transfer funds \n"
				+ "5.Apply For New Account \n"
				+ "6.Quit \n"	
				);
		return 0;
	}
	
	//Get Current Balance
	
	public static void obtainBalance(Customer check) {
		double bal = check.getInitialBalance();
		System.out.println("Your balance is: " + bal);
		System.out.println("*********************************");
if(bal<0) {
	System.out.println("Your account is negative. Please deposit funds soon");
}
		//		BankTransactions.mainMenu();
//		scan.nextLine();
	}

//Withdrawing funds

	public static double withdrawal(Customer check) {
		double withdraw = check.getInitialBalance();
		System.out.println("Enter an amount to withdraw");
		double c = scan.nextDouble();
		if (c>withdraw) {
			System.out.println("Sorry Withdraw Amount Exceeds Current Account Balance");
			}
		System.out.println("After withdrawing $" + c + "your new balance is $" + (withdraw - c));
		check.setInitialBalance(check.getInitialBalance() - c);
		Files.writeCustomerFile(AccountList.customerList);
		return (check.getInitialBalance() - c);
	}

	//deposit funds
	public static double deposit (Customer check)  {
		System.out.println("Enter an amount to deposit");
		double b = scan.nextDouble();
		if(b<1) {
			System.out.println("Deposit must be greater than $1.00");
		}else {
			System.out.println("After depositing $" + b + " your new balance is $" + (check.getInitialBalance() + b));
			check.setInitialBalance(check.getInitialBalance() + b);
			Files.writeCustomerFile(AccountList.customerList);			
		}
			return (check.getInitialBalance() + b);
	}
	
	
	public static void newAccountSignUp() {
		System.out.println("Please Complete The Following:");
		System.out.println("FIRST NAME:");
		String customerFname = scan.nextLine();
		System.out.println("LAST NAME:");
		String customerLname = scan.nextLine();
		System.out.println("USERNAME:");
		String customerUsername = scan.nextLine();
		System.out.println("PASSWORD:");
		String customerPassword = scan.nextLine();
		int acctNum = ThreadLocalRandom.current().nextInt();
		System.out.println();
		new Customer(customerFname, customerLname, customerUsername, customerPassword, acctNum);
		System.out.println(AccountList.newcustomer.toString());
		System.out.println();
		System.out.println("Thanks For Applying! Application Has Been Sent For Approval");

		mainMenu();
	}
	
	
	public static void transfer() {
		scan.nextLine();
		System.out.println("Which Account Would you like to Transfer From?");
		String sender = scan.nextLine();
		Customer a = AccountList.employeeCheck(sender);
		System.out.println("Who would you like to transfer money to");
		String receiver =scan.nextLine();
		Customer b = AccountList.employeeCheck(receiver);
		System.out.println("How Much would you like to send");
		double amount = scan.nextDouble();
		if(amount>a.getInitialBalance()) {
			System.out.println("Sorry you have insufficient funds!");
			System.out.println("Please deposit funds and try again");
		}else {
			
			b.setInitialBalance(b.getInitialBalance()+ amount);
			a.setInitialBalance(a.getInitialBalance() - amount);
			Files.writeCustomerFile(AccountList.customerList);
			System.out.println("You new balance is: $" + a.getInitialBalance());
		}
		
	}
	
	public static void adminTransfer() {
		scan.nextLine();
		System.out.println("Which Account Would you like to Transfer From?");
		String sender = scan.nextLine();
		Customer a = AccountList.employeeCheck(sender);
		System.out.println("Who would you like to transfer money to");
		String receiver =scan.nextLine();
		Customer b = AccountList.employeeCheck(receiver);
		System.out.println("How Much would you like to send");
		double amount = scan.nextDouble();
		b.setInitialBalance(b.getInitialBalance()+ amount);
		a.setInitialBalance(a.getInitialBalance() - amount);
		Files.writeCustomerFile(AccountList.customerList);
		System.out.println(a.getFname()+" " + a.getLname() + " New Balance is: $" + a.getInitialBalance());
		System.out.println(b.getFname()+" " + b.getLname() + " New Balance is: $" + b.getInitialBalance());
	}
	
}


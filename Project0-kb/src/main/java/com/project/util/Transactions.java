package com.project.util;

import java.util.Scanner;

import com.project.bean.Customer;

public class Transactions {
	static Scanner sc = new Scanner(System.in); 
	
	public static Customer a = new Customer("Michael", "Blessing", "papanez", "VideoRanch5"); //500.00
	public static Customer f = new Customer("Michael", "Blessing", "papanez", "VideoRanch5"); //300.00
	
	public static double b;
	
	public static void main(String[] args) {
		//deposit(a.getBalance());
		//withdrawal(a.getBalance());
		transfer(a.getBalance());
		
		a.setBalance((a.getBalance() + b));
		System.out.println("The new balance of your account is $" + a.getBalance());
	}
	
	//Depositing funds 
//	public static double deposit(double initialBalance) {
//		System.out.println("Enter an amount to deposit");
//		double b = sc.nextDouble();
//		System.out.println("After depositing $" + b + " your new balance is $" + (a.getInitialBalance() + b));
//		a.setInitialBalance(a.getInitialBalance()+b);
//		//System.out.println("The new balance of your account is $" + a.getInitialBalance());
//		return (a.getInitialBalance() + b);
//	}
	
//	//Withdrawing funds
//	static double withdrawal(double initialBalance) {
//		System.out.println("Enter an amount to withdraw");
//		double c = sc.nextDouble();
//		System.out.println("After withdrawing $" + c + " your new balance is $" + (a.getInitialBalance() - c));
//		a.setInitialBalance(a.getInitialBalance()-c);
//		return (a.getInitialBalance() - c);
//	}
//	
//	//Transferring funds
	static double transfer(double initialBalance) {
		System.out.println("Enter an amount to transfer between accounts");
		double d = sc.nextDouble();
		System.out.println("You've transferred $" + d + " between accounts. The new balance of account 1 is $" + (a.getBalance() - d) + ". The new balance of account 2 is $" + (f.getBalance() + d));
		a.setBalance(a.getBalance()-d);
		f.setBalance(f.getBalance()+d);
		double q = (a.getBalance()-d);
		return (q (f.getBalance()+d));
		//need to make sure this runs correctly in the finished program
	}

	private static double q(double d) {
		// TODO Auto-generated method stub
		return 0;
	}

}

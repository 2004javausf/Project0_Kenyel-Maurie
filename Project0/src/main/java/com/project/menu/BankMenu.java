package com.project.menu;

import java.util.Scanner;

public class BankMenu {
	
	static Scanner scan = new Scanner(System.in);	

	public static void customerBank() {
		System.out.println("What would you like to do to? Please make a selection below:\n"
				+ "1.Check Balance \n"
				+ "2.Withdraw funds \n"
				+ "3.Deposit funds \n"
				+ "4.Transfer funds \n"
				+ "5.Apply For New Account \n"
				+ "6.Quit \n"	
				);
		int selection = Integer.parseInt(scan.nextLine());
		switch (selection) {
		case 1:
			System.out.println("Your Balance is ");			
		
		break;

	case 2:
		
		withdrawal(0);
		break;
		
	case 3:
		deposit(0);
		
		break;
		
		
	case 4:
		transfer(0);
		
		break;
		
		
	case 5:
		System.out.println("Apply For New Account");
		
		break;
		
	case 6:			
		break;
	}

		
	}
	//Depositing funds
	public static double deposit(double initialBalance) {
		System.out.println("Enter an amount to deposit");
		double b = scan.nextDouble();
		Customer a =
		System.out.println("After depositing $" + b + " your new balance is $" + (a.getInitialBalance() + b));
		a.setInitialBalance(a.getInitialBalance()+b);
		//System.out.println("The new balance of your account is $" + a.getInitialBalance());
		return (a.getInitialBalance() + b);
	}
	
//	//Withdrawing funds
	static double withdrawal(double initialBalance) {
		System.out.println("Enter an amount to withdraw");
		double c = sc.nextDouble();
		System.out.println("After withdrawing $" + c + " your new balance is $" + (a.getInitialBalance() - c));
		a.setInitialBalance(a.getInitialBalance()-c);
		return (a.getInitialBalance() - c);
	}
	
//	//Transferring funds
	static double transfer(double initialBalance) {
		System.out.println("Enter an amount to transfer between accounts");
		double d = sc.nextDouble();
		System.out.println("You've transferred $" + d + " between accounts. The new balance of account 1 is $" + (a.getInitialBalance() - d) + ". The new balance of account 2 is $" + (f.getInitialBalance() + d));
		a.setInitialBalance(a.getInitialBalance()-d);
		f.setInitialBalance(f.getInitialBalance()+d);
		double q = (a.getInitialBalance()-d);
		return (q (f.getInitialBalance()+d));
		//need to make sure this runs correctly in the finished program
	}
}

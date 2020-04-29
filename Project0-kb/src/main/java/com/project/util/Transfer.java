package com.project.util;

import com.project.bean.Customer;

public class Transfer {
	public void transferFunds(Customer a, Customer b) {
		//a is going to transfer funds to b
		double transferFrom = a.getBalance(); //this really should be the amount to transfer
		double transferTo = b.getBalance();   //so should this
		b.setBalance(transferTo - transferFrom); //so then this would be b.getBalance() + transferAmount
		a.setBalance(transferFrom - transferTo); //and this would be a.getBalance() - transferAmount
		Files.writeCustomerFile(AccountList.customerList);
		//make sure this is correct
		//will this run better as a fully separate method like this than how I wrote it in the Transactions class?
		//as written it doesn't take in the amount from the user
		//**we may delete this class entirely** I'm just including it for it's possible use
	}

}

package com.project.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.project.bean.Customer;
import com.project.transactions.BankTransactions;
import com.project.util.Transactions;

class TransactionTests {
	
	Customer a = new Customer();
	Customer b = new Customer();
	
	BankTransactions tr = new BankTransactions();
	
//	@SuppressWarnings({ "static-access", "unlikely-arg-type" })
//	@Test
//	void testWithdrawal() {
//		tr.withdrawal(a);
//		equals(a.getInitialBalance());
//	}

//	@SuppressWarnings({ "static-access", "unlikely-arg-type" })
//	@Test
//	void testDeposit() {
//		tr.deposit(a);
//		equals(a.getInitialBalance());
//	}

	@SuppressWarnings("static-access")
	@Test
	void testTransfer() {
		tr.transfer();
		assertEquals((a.getInitialBalance()), (b.getInitialBalance()));
	}

}

package com.cg.inheritance;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;



//import org.apache.log4j.Logger;

import org.junit.Test;

public class MMBankTest {
	@Test(expected=InvalidInputException.class)
	public void currentAccountIfNegative() {
		BankFactory mmBankFactory=new MMBankFactory();
		MMCurrentAccount mmCurrentAccount= (MMCurrentAccount)mmBankFactory.getNewCurrentAccount("Jahnavi",0,1000);
		try {
			mmCurrentAccount.withdraw(-10);
		} catch (Exception e) {
			e.printStackTrace();
			RuntimeException invalidException=new InvalidInputException();
			invalidException.initCause(e);
			throw invalidException;
		}
	}
	@Test(expected=InvalidInputException.class)
	public void currentAccountIfZero() {
		BankFactory mmBankFactory=new MMBankFactory();
		MMCurrentAccount mmCurrentAccount= (MMCurrentAccount)mmBankFactory.getNewCurrentAccount("Jahnavi",0,1000);
		try {
			mmCurrentAccount.withdraw(0);
		} catch (Exception e) {
			e.printStackTrace();
			RuntimeException invalidException=new InvalidInputException();
			invalidException.initCause(e);
			throw invalidException;
		}
	}
	@Test
	public void currentAccountCheck() {
		BankFactory mmBankFactory=new MMBankFactory();
		MMCurrentAccount mmCurrentAccount= (MMCurrentAccount)mmBankFactory.getNewCurrentAccount("Jahnavi",0,1000);
		try {
			mmCurrentAccount.deposit(5000);
			mmCurrentAccount.withdraw(1000);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void savingsAccount() {
		BankFactory mmBankFactory=new MMBankFactory();
		MMSavingsAccount mmSavingsAccount = (MMSavingsAccount)mmBankFactory.getNewSavingsAccount("janu",0,true);
		try {
			mmSavingsAccount.deposit(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(expected =RuntimeException.class)
	public void savingsAccountIfZero() {
		BankFactory mmBankFactory=new MMBankFactory();
		MMSavingsAccount mmSavingsAccount = (MMSavingsAccount)mmBankFactory.getNewSavingsAccount("janu",0,true);
		try {
			mmSavingsAccount.withdraw(0);
		} catch (Exception e) {
			e.printStackTrace();
			RuntimeException invalidException=new InvalidInputException();
			invalidException.initCause(e);
			throw invalidException;
		}
	}
	@Test
	public void savingsAccountCheck() {
		BankFactory mmBankFactory=new MMBankFactory();
		MMSavingsAccount mmSavingsAccount = (MMSavingsAccount)mmBankFactory.getNewSavingsAccount("janu",0,true);
		try {
			mmSavingsAccount.deposit(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(expected =RuntimeException.class)
	public void savingsAccountExceeds() throws Exception {
		BankFactory mmBankFactory=new MMBankFactory();
		MMSavingsAccount mmSavingsAccount = (MMSavingsAccount)mmBankFactory.getNewSavingsAccount("janu",0,true);
		try {
			mmSavingsAccount.deposit(1000);
			mmSavingsAccount.withdraw(2000);
		} catch (Exception e) {
			e.printStackTrace();
			RuntimeException insufficientFunds=new InsufficientException();
			insufficientFunds.initCause(e);
			throw insufficientFunds;
		}
	}
}

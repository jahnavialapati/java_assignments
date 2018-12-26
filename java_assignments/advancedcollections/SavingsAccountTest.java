package com.cg.advancedcollection;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;

import java.util.ArrayList;

import java.util.List;

import java.util.Set;

import org.junit.Before;

import org.junit.Test;

public class SavingsAccountTest {
	private SavingsAccount savingsAccountOne,savingsAccountTwo,savingsAccountThree,savingsAccountFour,
							savingsAccountFive,savingsAccountSix,savingsAccountSeven;
	private BankAccountList bankAccountList;
	List<SavingsAccount> al = new ArrayList<SavingsAccount>();
	
	@Before
	public void setUp(){
		savingsAccountOne = new SavingsAccount(101,15000,"jahnavi",true);
		savingsAccountTwo = new SavingsAccount(103,50000,"janu",false);
		savingsAccountThree = new SavingsAccount(102,10000,"ram",true);
		savingsAccountFour = new SavingsAccount(106,30000,"siva",false);
		savingsAccountFive = new SavingsAccount(105,23000,"krishna",true);
		 
		al.add(savingsAccountOne);
		al.add(savingsAccountTwo);
		al.add(savingsAccountThree);
		al.add(savingsAccountFour);
		al.add(savingsAccountFive);
		
	}
	
	@Test
	public void testForPrintingObjectsThroughArrayList() throws FileNotFoundException, IOException, ClassNotFoundException {
			List<SavingsAccount> al = new ArrayList<SavingsAccount>();
			al.add(savingsAccountOne);
			al.add(savingsAccountTwo);
			al.add(savingsAccountThree);
			al.add(savingsAccountFour);
			al.add(savingsAccountFive);
			
			for (SavingsAccount savingAccount2 : al) {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\jalapati\\Documents\\SavingsList.txt"));
				oos.writeObject(savingAccount2);
				oos.close();
			}
			for (SavingsAccount savingAccount2 : al) {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\jalapati\\Documents\\SavingsList.txt"));
				SavingsAccount savingAccount=(SavingsAccount) ois.readObject();
				ois.close();
			}
	}

	@Test
	public void testObjectsThroughArrayList() throws FileNotFoundException, IOException, ClassNotFoundException {
		bankAccountList = new BankAccountList();
		Set<SavingsAccount> customerSet = bankAccountList.addAccountsList(al);
		String expected ="[SavingAccount [accountbalance=15000.0, accountid=101, accountholdername=jahnavi, issalariedaccount=true], SavingAccount [accountbalance=10000.0, accountid=102, accountholdername=ram, issalariedaccount=true], SavingAccount [accountbalance=50000.0, accountid=103, accountholdername=janu, issalariedaccount=false], SavingAccount [accountbalance=23000.0, accountid=105, accountholdername=krishna, issalariedaccount=true], SavingAccount [accountbalance=30000.0, accountid=106, accountholdername=siva, issalariedaccount=false]]";
		assertEquals(expected,customerSet.toString());
	}
}

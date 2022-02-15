package com.bridgeLabz.BankAccount;
import java.util.*;
public class BankAccount {
	
	 String accountName;
	 long accountNumber;
	 long balance;
	
	public void createAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Holder's Name= ");
		accountName = sc.nextLine();
		System.out.println("Enter Account Number= ");
		accountNumber = sc.nextInt();
		System.out.println("Enter Balance= ");
		balance= sc.nextLong();
		
	}
	public void creditAmount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount to be credit in Account=");
		int amount = sc.nextInt();
		sc.close();
		balance = balance + amount;
	}
	public void debitAmount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount To Be Debit From Account= ");
		int amount = sc.nextInt();
		if (amount <= balance) {
			balance = balance - amount;
		}
		else {
			System.out.println("Debit amount exceeded account balance..");
		}
	}

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		int option;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your option \n 1: create new Account \n 2: Credit Amount \n 3: Debit Amount \n 0: Exit");
			option = sc.nextInt();

			switch (option) {
			case 1:
				account1.createAccount();
				break;
			case 2:
				account1.creditAmount();
				break;
			case 3:
				account1.debitAmount();
				break;
			default:
				System.out.println("Exit");
				option = 4;
			}
		}
		while (option < 4);	
	}
}
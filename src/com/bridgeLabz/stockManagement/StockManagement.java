package com.stockManagement;

import java.util.Scanner;

public class StockManagement {
	static StockPortfolio acc = new StockPortfolio();
	public static void main(String[] args) {

		int choice;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice \n1: Add Stock \n2: Add Multiple of Stocks "
					           + "\n3: Display Total value of Stocks \n0: Exit ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				acc.addStock();
				break;
			case 2:
			    acc.addNoOfStocks();
				break;
			case 3:
				System.out.println("Total value of your stocks is : ");
				acc.totalValue();
				break;
			default:
				System.out.println("Exit");
				choice = 3;
			}
		}
		while (choice < 4);
	}
}

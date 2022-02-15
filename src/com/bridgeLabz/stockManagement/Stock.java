package com.stockManagement;
import java.util.Scanner;
import java.util.ArrayList;
public class Stock {
	String stockName;
	int noOfShares;
	int stockPrice;

	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		stockName = stockName;
	}
	public int getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}
	public int getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}
}
class StockPortfolio {
	ArrayList<Stock> portfolio = new ArrayList<>();
	double totalValue = 0;
	int counter = 0;

	public void addStock() {
		Stock stockInfo = new Stock();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details of Which Stock You Want to Purchase : ");
		System.out.println("Enter STOCK Name : ");
		stockInfo.setStockName(sc.next());
		System.out.println("Enter Number of Shares : ");
		stockInfo.setNoOfShares(sc.nextInt());
		System.out.println("Enter STOCK Price : ");
		stockInfo.setStockPrice(sc.nextInt());	

		portfolio.add(stockInfo);
		System.out.println();
		System.out.println("Stock Added Successfully");
		counter++;
	}

	public void addNoOfStocks() {
		System.out.println("Enter the number of Shares you want to Purshase");
		Scanner sc = new Scanner(System.in);
		int noOfShares = sc.nextInt();
		for (int i=1;i<=noOfShares;i++) {
			addStock();
		}
	}

	public void totalValue() {
		for (Stock stock : portfolio) {
			totalValue += stock.stockPrice * stock.noOfShares;
		}
		System.out.println(totalValue);
	}
}

package chapter2;

/*
 * Author: ahbae
 * 
 * 5.  Sales Prediction
 * The East Coast sales division of a company generates 62 percent of total sales.  
 * Based on that percentage, write a program that will predict how much the East Coast division 
 * will generate if the company has $4.6 million in sales this year.
 */

import java.text.DecimalFormat;

public class Chapter2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.text.DecimalFormat currency = new DecimalFormat("#,###,##0.00");
		
		//Total sales from the company
		double totalSales = 4600000;
		
		double eastCoastSales = totalSales * .62;
		
		System.out.println("The East Coast sales division generated $" 
				+ currency.format(eastCoastSales) + " this year.");
	}

}

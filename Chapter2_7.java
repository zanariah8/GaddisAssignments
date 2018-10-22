package chapter2;

/*
 *  Author: ahbae
 * 
 *  7.  Sales Tax
 * 	Write a program that will ask the user to enter the amount of a purchase.  The program 
 *  should then compute the state and county sales tax.  Assume the state sales tax is 4 percent 
 *  and the county sales tax is 2 percent.
 *  
 *  The program should display the amount of the purchase, the state sales tax, the county sales 
 *  tax, the total sales tax, and the total of the sales (which is the sum of the amount of purchase 
 *  plus the total sales tax).
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Chapter2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// initialize and declare an instance of DecimalFormat to format currency
		DecimalFormat currency = new DecimalFormat("#,###,##0.00");
		
		// initialize an instance of the Scanner class to capture input
		Scanner in = new Scanner(System.in);
		
		final float STATE_TAX = 0.04f;
		final float COUNTY_TAX = 0.02f;
		float purchaseTotal, grandTotal, taxTotal;
		
		System.out.print("How much is the total of your purchase?: ");
		purchaseTotal = in.nextFloat();
		
		// individual taxes are additive, not multiplicative
		taxTotal = (purchaseTotal * STATE_TAX) + (purchaseTotal * COUNTY_TAX);
		grandTotal = purchaseTotal + taxTotal;
		
		System.out.println("Purchase total: $" + currency.format(purchaseTotal));
		System.out.println("Total tax: $" + currency.format(taxTotal));
		System.out.println("Grand total: $" + currency.format(grandTotal));
		
		// close the scanner object to prevent resource leak warning message
		in.close();
	}

}

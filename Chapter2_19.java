package chapter2;

/*
 * Author: ahbae
 * 19.  Stock Transaction Program
 * Last month Joe purchased some stock in Acme Software, Inc.  Here are the details of the 
 * purchase:
 * - The number of shares that Joe purchased was 1,000
 * - When Joe purchased the stock, he paid $32.87 per share
 * - Joe paid his broker a commission that amounted to 2% of the amount he paid for the stock
 * 
 * Two weeks later, Joe sold the stock.  Here are the details of the sale: 
 * - The number of shares that Joe sold was 1,000
 * - He sold the stock for $33.92 per share
 * - He paid his broker another commission that amounted to 2% of the amount he received for the 
 * stock
 * 
 * Write a program that displays the following:
 * - The amount of money Joe paid for the stock
 * - The amount of commission Joe paid his broker when he bought the stock
 * - The amount that Joe sold the stock for
 * - The amount of commission Joe paid his broker when he sold the stock
 * - Display the amount of profit that Joe made after selling his stock and paying both commissions
 */

import java.text.DecimalFormat;

public class Chapter2_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat currency = new DecimalFormat("$#,###,##0.00");
		
		final float COMMISSION_RATE = 0.02f;
		final int SHARES = 1000;
		final float BOUGHT_PRICE = 32.87f;
		float total_bought = SHARES * BOUGHT_PRICE;
		
		final float SOLD_PRICE = 33.92f;
		float total_sold = SHARES * SOLD_PRICE;
		
		float bought_commission = total_bought * COMMISSION_RATE;
		float sold_commission = total_sold * COMMISSION_RATE;
		
		float investment = total_bought + bought_commission + sold_commission;
		float earnings = total_sold - investment;
		
		System.out.println("Joe paid " + currency.format(total_bought) + " for the shares.");
		System.out.println("Joe paid his broker " + currency.format(bought_commission) + ".");
		
		System.out.println("Joe earned " + currency.format(total_sold) + " for the shares.");
		System.out.println("Joe paid his broker " + currency.format(sold_commission) + ".");
		
		// use an if statement to determine whether or not Joe earned a profit or lost money
		if(earnings > 0) {
			System.out.println("Joe made a profit of " + currency.format(earnings) + ".");
		}
		else {
			System.out.println("Joe lost " + currency.format(earnings) + ".");
		}
	}

}

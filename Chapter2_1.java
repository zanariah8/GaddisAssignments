package chapter2;

/*
 * 1.  Name, Age and Annual Income
 * Write a program that declares the following:
 * 	- a String variable named name
 * 	- an int variable named age
 * 	- a double variable named annualPay
 * 
 * 	Story your age, name, and desired annual income as literals in these variables.  
 * 	The program should display these values on the output
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Chapter2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Utilize the DecimalFormat class to format text
		DecimalFormat currency = new DecimalFormat("###,##0.00"); 
		//placeholder variable to store input for later conversion
		String str; 
		
		String name = JOptionPane.showInputDialog("What is your name?");
		
		str = JOptionPane.showInputDialog("What is your age?");
		int age = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("How much do you make per year?");
		double annualPay = Double.parseDouble(str); 
		
		System.out.println("My name is " + name + ", my age is " + age + ", and I hope "
				+ "to earn $" + currency.format(annualPay) + " per year");
		
		// Update: added System.exit(0) method to properly close in the JVM, as is proper use 
		// under JOptionPane syntax
		System.exit(0);
	}

}

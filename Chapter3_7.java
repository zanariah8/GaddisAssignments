package chapter3;

/*
 * @author ahbae
 * Write a program that asks the user to enter three names, and then displays the names 
 * sorted in ascending order.  For example, if the user entered "Charlie", "Leslie", and 
 * "Andy", the program would display:
 * 
 * Andy
 * Charlie
 * Leslie
 */

import java.util.Scanner;

public class Chapter3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String temp;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many names will you be entering?: ");
		n = in.nextInt();
		
		in.nextLine();
		
		String[] names = new String[n];
		
		for(int i = 0; i < names.length; i++) {
			System.out.print("Enter name #" + (i + 1) + ": ");
			names[i] = in.nextLine();
		}
		
		
		// The chapter requires compareTo method and if statements
		// However, we will be using a sort to speed it up
		
		// start outer loop from index 0 of the array
		for(int i = 0; i < names.length; i++) {
			// start inner loop from index 1 in the array
			for(int j = i + 1; j < names.length; j++) {
				if(names[i].compareTo(names[j]) > 0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		in.close();
	}

}

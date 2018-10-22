package chapter2;

/*
 * Author: ahbae
 * 
 * 18. Word Game
 * Write a program that plays a word game with the user.  The program should ask the user to 
 * enter the following:
 * -His or her name
 * -His or her age
 * -The name of a city
 * -The name of a college
 * -A profession
 * -A type of animal
 * -A pet's name
 * 
 * After the user has entered these items, the program should display the following story, 
 * inserting the user's input into the appropriate locations
 */

import javax.swing.JOptionPane;

public class Chapter2_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name, age, city, college, profession, animal, petName;
		
		name = JOptionPane.showInputDialog("Enter your name");
		age = JOptionPane.showInputDialog("Enter your age");
		city = JOptionPane.showInputDialog("Enter a city");
		college = JOptionPane.showInputDialog("Enter the name of a college");
		profession = JOptionPane.showInputDialog("Enter a profession");
		animal = JOptionPane.showInputDialog("Enter a type of animal");
		petName = JOptionPane.showInputDialog("Enter a name for a pet");
		
		
		JOptionPane.showMessageDialog(null, "There once was a person named " + name + " who lived in " + city +".");
		JOptionPane.showMessageDialog(null, "At the age of " + age + ", " + name + " went to college at " + college + ".");
		JOptionPane.showMessageDialog(null, name + " graduated and went to work as a " + profession + ".");
		JOptionPane.showMessageDialog(null, "Then, " + name + " adopted a(n) " + animal + " named " + petName);
		JOptionPane.showMessageDialog(null, "They both lived happily ever after!");
		
		System.exit(0);
	}
}

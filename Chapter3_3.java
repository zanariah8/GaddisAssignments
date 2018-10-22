package chapter3;

/*
 * 3. Body Mass Index
 * Write a program that calculates and displays a person's body mass index (BMI).  The BMI 
 * is often used to determine whether a person with a sedentary lifestyle is overweight or 
 * underweight for his or her height.  A person's BMI is calculated with the following 
 * formula:
 * BMI = weight * 703 / height^2
 * 
 * where weight is measured in pounds and height is measured in inches.  The program should 
 * display a message indicating whether the person has optimal weight, is underweight, or is 
 * overweight.  A sedentary person's weight is considered optimal if his or her BMI is between 
 * 18.5 and 25.  If the BMI is less than 18.5, the person is underweight.  If the BMI value is 
 * greater than 25, the person is considered overweight.
 */

import javax.swing.JOptionPane;

public class Chapter3_3 {
	public static void main(String[] args) {
		//placeholder
		String str;
		float height, weight;
		
		str = JOptionPane.showInputDialog("Enter your weight in pounds below");
		weight = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Enter your height in inches below");
		height = Float.parseFloat(str);
		
		float result = bmi_calc(weight, height);
		String resultStr = String.format("%.2f", result);
		
		if(result < 18.5) {
			JOptionPane.showMessageDialog(null, "Your BMI is: " + resultStr);
			JOptionPane.showMessageDialog(null, "You are underweight.");
		}
		else if(result >= 18.5 && result < 25) {
			JOptionPane.showMessageDialog(null, "Your BMI is: " + resultStr);
			JOptionPane.showMessageDialog(null, "You are at a normal weight.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Your BMI is: " + resultStr);
			JOptionPane.showMessageDialog(null, "You are overweight.");
		}
			
		System.exit(0);
	}
	
	public static float bmi_calc(float weight, float height) {
		float bmi = (float) (weight * 703 / Math.pow(height, 2));
		
		return bmi;
	}
}

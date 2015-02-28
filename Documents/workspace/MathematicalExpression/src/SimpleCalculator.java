/**
 * Author: Tri Nguyen
 * Date: 1/29/2015
 * Email: thn2447@email.vccs.edu
 */
import java.util.Scanner;

import javax.swing.JOptionPane;


public class SimpleCalculator {
	public static void main(String [] args) {
		final double PI = 22/7;
		
		
		byte x=100;
		short y=30000;
		int z= 2000000;
		long u;
		u = 3000000000000l;
		
		float v=8.5f;
		double w=950.55;
		double num1, num2, sum, diff, product;
		int quotient, remainder;
		
		char letter ='A';
		
		boolean status = false;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter first number");
		num1 = keyboard.nextDouble();
		System.out.println("Enter second number");
		num2 = keyboard.nextDouble();
		sum = num1 + num2;
		diff = num1 - num2; 
		product = num1 * num2;
		quotient = (int) (num1 / num2);
		remainder = (int) (num1%num2);
		
			
		
		JOptionPane.showMessageDialog(null, "The sum is \"" + sum + "\"" 
											+ "\n" + "The differnt is \"" + diff +"\""
											+ "\n" + "The product is \"" + product + "\""
											+ "\n" + "The quotient is \"" + quotient + "\""
											+ "\n" + "The remainder is \"" + remainder + "\"");
			
		
		
		
	}

}

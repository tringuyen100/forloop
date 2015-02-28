/**
 * @author Tri Nguyen
 * Date: 02/03/15
 * Contact: thn2447@email.vccs.edu
 */
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class assignment {
	public static void main(String[] args) {
		String monthly = "";
		String owned = "";
		double dblmonthly, dblowned, dblinterest, dblintpay, dblpay, dblbal;
		int dblintpay1, dblpay1, dblbal1;
		DecimalFormat formattingObject = new DecimalFormat("0.00");
		
		Scanner keyboard1 = new Scanner(System.in);
		Scanner keyboard2 = new Scanner(System.in);
		
		System.out.println("Enter the monthly mortgage");
		monthly = keyboard1.next();
		System.out.println("Enter the outstanding balance");
		owned = keyboard2.next();
		
		dblmonthly = Double.parseDouble(monthly);
		dblowned = Double.parseDouble(owned);
		dblinterest = 0.0749/12;
		dblintpay = dblmonthly*dblinterest;
		dblpay = dblmonthly-dblintpay;
		dblbal = dblowned-dblpay;

		System.out.println("The amount go to interest is $" + formattingObject.format(dblintpay) + "." 
				+ " \n The amount go to principle is $" + formattingObject.format(dblpay) + "."
				+ " \n The balance is $" + formattingObject.format(dblbal) +".");
		
	}
}


/**
 * @author Tri Nguyen
 * Date: 02/03/15
 * Contact: thn2447@email.vccs.edu
 */
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class assignment1 {
	public static void main(String[] args) {
		String monthly = "";
		String owned = "";
		double dblmonthly, dblowned, dblinterest, dblintpay, dblpay, dblbal;
		int dblintpay1, dblpay1, dblbal1;
		DecimalFormat formattingObject = new DecimalFormat("0.00");
		
		monthly = JOptionPane.showInputDialog("Enter the monthly mortgage");
		owned = JOptionPane.showInputDialog("Enter the outstanding balance");
		
		dblmonthly = Double.parseDouble(monthly);
		dblowned = Double.parseDouble(owned);
		dblinterest = 0.0749/12;
		dblintpay = dblmonthly*dblinterest;
		dblintpay1 = (int) dblintpay;
		dblpay = dblmonthly-dblintpay;
		dblpay1 = (int) dblpay;
		dblbal = dblowned-dblpay;
		dblbal1 = (int) dblbal;
				
		
		//JOptionPane.showMessageDialog(null, "The amount go to interest is $" + dblintpay1 + "." 
				//+ " \n The amount go to payment is $" + dblpay1 + "."
				//+ " \n The balance is $" + dblbal1 +".");
		JOptionPane.showMessageDialog(null, "The amount go to interest is $" + formattingObject.format(dblintpay) + "." 
				+ " \n The amount go to principle is $" + formattingObject.format(dblpay) + "."
				+ " \n The balance is $" + formattingObject.format(dblbal1) +".");
		
		
	}

}

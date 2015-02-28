/**
 * Author: Tri Nguyen
 * Date: 1/29/2015
 * Email: thn2447@email.vccs.edu
 */
import java.util.Scanner;

import javax.swing.JOptionPane;

public class EchoProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final double PI = 22/7;
		
		
		byte x=100;
		byte byt;
		short y=30000;
		short shor;
		int z= 2000000;
		int in;
		long u;
		u = 3000000000000l;
		
		float v=8.5f;
		float floa;
		double w=950.55;
		double pro;
		int quotient, remainder;
		
		char letter ='A';
		char cha;
		
		boolean status = false;
		boolean boo;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number from 0 to 100");
		byt = keyboard.nextByte();
		System.out.println("Please enter a number from 0 to 30000");
		shor = keyboard.nextShort();
		System.out.println("Please enter a any interger number");
		in = keyboard.nextInt();
		System.out.println("Please enter a long number");
		u = keyboard.nextLong();
		System.out.println("Please enter a decimal number");
		floa = keyboard.nextFloat();
		System.out.println("Please enter a long decimal number");
		pro = keyboard.nextDouble();
		System.out.println("Please enter the first digit of your name");
		cha = keyboard.next().charAt(0);
		System.out.println("Please enter True or False");
		boo = keyboard.nextBoolean();
		
		JOptionPane c = new JOptionPane();
		c.setLocation(1100,200);
		c.setVisible(true);
		JOptionPane.showMessageDialog(null, "Your byte is \"" + byt + "\""
											+ "\n" + "Your short is \"" + shor +"\""
											+ "\n" + "Your interger is \"" + in +"\""
											+ "\n" + "Your long number is \"" + u +"\""
											+ "\n" + "Your decimal number is \"" + floa +"\""
											+ "\n" + "Your long decimal number is \"" + pro +"\""
											+ "\n" + "The first digit of your name is \"" + cha +"\""
											+ "\n" + "Your answer \"" + boo +"\"" );
	

	}

}

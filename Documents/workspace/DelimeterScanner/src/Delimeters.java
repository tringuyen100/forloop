/*
 * Author: Tri Nguyen
 * Date: Jan 27, 2015
 * 
 */
import java.util.Scanner;


public class Delimeters {
	public static void main(String [] args) {
		String s1,s2;
		Scanner keyboard1 = new Scanner(System.in);
		Scanner keyboard2 = new Scanner(System.in);
		keyboard2.useDelimiter("$$");
		
		System.out.println("Enter a line of text with two words:");
		s1 = keyboard1.next();
		s2 = keyboard2.next();
		System.out.println("The words are " + s1 + "\t"  + s2);	
		
		System.out.println("Enter a line of text with two words (deoimited by $$):");
		s1 = keyboard1.next();
		s2 = keyboard2.next();
		System.out.println("The words are " + s1 + "\"\""  + s2 + "\"");	
	}

}

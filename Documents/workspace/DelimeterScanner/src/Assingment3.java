/*
 * Name: Tri Nguyen
 * Date: Jan 27, 2015
 * Email: tri_nguyenhien@yahoo.com
 * The Program will find the average of 10 numbers that the user input
 */
import java.util.Scanner;

public class Assingment3 {
	public static void main(String [] args) {
		
		int s1,s2,s3,s4,s5,s6,s7,s8,s9,s10; //declare the 10 number
		double average;
		Scanner keyboard2 = new Scanner(System.in); //setup scanner input as keyboard2
		keyboard2.useDelimiter("[ , \r\n]"); //declare the delimiter
		// \r\n create a new line therefore no comma needed for the last input
		
		System.out.println("Enter a line with ten numbers:"); //description to user
		s1 = keyboard2.nextInt(); //Setup keyboard to match with Int on line 12
		s2 = keyboard2.nextInt(); //name the 1st number
		s3 = keyboard2.nextInt(); //name the 2nd number
		s4 = keyboard2.nextInt();
		s5 = keyboard2.nextInt();
		s6 = keyboard2.nextInt(); 
		s7 = keyboard2.nextInt();
		s8 = keyboard2.nextInt();
		s9 = keyboard2.nextInt();
		s10 = keyboard2.nextInt();
		System.out.println("The numbers are \t" + s1 + "\t" + s2 + "\t" + s3 + "\t" + s4 + "\t" + s5 + "\t" + s6 + "\t" + s7 + "\t" + s8 + "\t" + s9 + "\t" + s10);
		//ask the system to print the numbers that were inputed by user
		average = (s1+s2+s3+s4+s5+s6+s7+s8+s9+s10); //find average
		average = average/10; //find average
		System.out.println("The average number is " +"\n" + "\"" + average + "\""); //system to print the average
		
		
		//System.out.println("Enter a line with ten numbers:");
				//s1 = keyboard1.next();
				//s2 = keyboard1.next(); 
				//s3 = keyboard1.next();
				//s4 = keyboard1.next();
				//s5 = keyboard1.next();
				//s6 = keyboard1.next(); 
				//s7 = keyboard1.next();
				//s8 = keyboard1.next();
				//s9 = keyboard1.next();
				//s10 = keyboard1.next(); 
				//System.out.println("The words are \n" + s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 + "\n" + s5 + "\n" + s6 + "\n" + s7 + "\n" + s8 + "\n" + s9 + "\n" + s10);
				
				//System.out.println("Enter a line with ten numbers:"); //description to user
				//s1 = keyboard2.next(); //Setup keyboard to match with string on line 11
				//s2 = keyboard2.next(); 
				//s3 = keyboard2.next();
				//s4 = keyboard2.next();
				//s5 = keyboard2.next();
				//s6 = keyboard2.next(); 
				//s7 = keyboard2.next();
				//s8 = keyboard2.next();
				//s9 = keyboard2.next();
				//s10 = keyboard2.next(); 
				//System.out.println("The words are \n" + s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 + "\n" + s5 + "\n" + s6 + "\n" + s7 + "\n" + s8 + "\n" + s9 + "\n" + s10);
		
	}
	

}

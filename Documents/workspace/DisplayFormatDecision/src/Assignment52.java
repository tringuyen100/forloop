import javax.swing.JOptionPane;
/**
 * @author Tri Nguyen
 * Copy without right 2015 by Whoever
 * This program was written on Feb 12, 2015 for class. If there is any question please contact me at thn2447@email.vccs.edu
 */
public class Assignment52 {
	/**
	 * This is confusing 
	 * @param args argument 
	 */
	public static void main(String[] args) {
		/*
		 * The program will combine the two statement "Hello" and "Bye" as one
		 * It also find the average for 2,4,6
		 * It also combine the author name together
		 * It also display Exponential floating point
		 * It also display Floating point
		 */
		int numb1, numb2, numb3, avr;
		String str1, str2, str3;
		char a, b, c, d;
		double dbla, dbla1;
		//string
		str1 = "Hello";
		str2 = "Bye";
		str3 = str1+str2;
		//interger
		numb1 = 2;
		numb2 = 4;
		numb3 = 6;
		avr = (numb1+numb2+numb3)/3;
		//char
		a = 'T';
		b = 'r';
		c = 'i';
		//double
		dbla = 2000000000;
		dbla1 = 300000000;
		//System printf 
		System.out.printf("The statement is %4s", str3);
		System.out.printf("\nThe average of 2,4,6 is %1d", avr);
		System.out.printf("\nThe combination of the three words T,r,i is %2c", a);
		System.out.printf("%1c", b);
		System.out.printf("%1c", c);
		System.out.printf("\n%1e", dbla);
		System.out.printf("\n%1f", dbla);
				
	}

}

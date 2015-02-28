import java.util.Scanner;


public class assignment2 {
	public static void main(String[] args) {
		String numb1, numb2, numb3, numb4,numb5, max;
		double dblnumb1, dblnumb2, dblnumb3, dblnumb4, dblnumb5, dblsum, dblavr, dblmax, dblmin, dblmed, dblmed2;
		
		System.out.println("Welcome!");
		System.out.println("Please input five numbers ");
		Scanner keyboard = new Scanner(System.in);
		numb1 = keyboard.next();
		numb2 = keyboard.next();
		numb3 = keyboard.next();
		numb4 = keyboard.next();
		numb5 = keyboard.next();
		System.out.println(numb1 + numb2 + numb3+ numb4 + numb5);
		
		dblnumb1 = Double.parseDouble(numb1);
		dblnumb2 = Double.parseDouble(numb2);
		dblnumb3 = Double.parseDouble(numb3);
		dblnumb4 = Double.parseDouble(numb4);
		dblnumb5 = Double.parseDouble(numb5);
		dblsum = dblnumb1+dblnumb2+dblnumb3+dblnumb4+dblnumb5;
		System.out.println("The sum of the five numbers is " + dblsum);
		dblavr = (dblnumb1+dblnumb2+dblnumb3+dblnumb4+dblnumb5)/5;
		System.out.println("The average of the five number is " + dblavr);
		dblmax = Math.max(Math.max(dblnumb3, Math.max(dblnumb1, dblnumb4)), Math.max(dblnumb2, dblnumb5));
		System.out.println("The maximum of the five number is " + dblmax);
		dblmin = Math.min(Math.min(dblnumb1, Math.min(dblnumb2, dblnumb3)), Math.min(dblnumb3, dblnumb5));
		System.out.println("The minimum of the five number is " + dblmin);
		//dblmed = calculateMedian(dblnumb1, dblnumb2);
	
	
	}

}


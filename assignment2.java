import java.util.Arrays;
import java.util.Scanner;


public class assignment2 {
	public static void main(String[] args) {
		String numb1, numb2, numb3, numb4,numb5, max;
		int med, middle;
		Double dblnumb1, dblnumb2, dblnumb3, dblnumb4, dblnumb5, dblsum, dblavr, dblmax, dblmin, dblmed, dblmed2;
		int int1, int2, int3, int4, int5;
		
		
		System.out.println("Welcome!");
		System.out.println("Please input five numbers "); //promt user to input number
		Scanner keyboard = new Scanner(System.in);
		numb1 = keyboard.next();//input1
		numb2 = keyboard.next();//input2
		numb3 = keyboard.next();//input3
		numb4 = keyboard.next();//input4
		numb5 = keyboard.next();//input5
		
		
		dblnumb1 = Double.parseDouble(numb1); //double value
		int1 = dblnumb1.intValue(); //change from double to interger for sorting
		dblnumb2 = Double.parseDouble(numb2);
		int2 = dblnumb2.intValue();
		dblnumb3 = Double.parseDouble(numb3);
		int3 = dblnumb3.intValue();
		dblnumb4 = Double.parseDouble(numb4);
		int4 = dblnumb4.intValue();
		dblnumb5 = Double.parseDouble(numb5);
		int5 = dblnumb5.intValue(); //
		
		dblsum = dblnumb1+dblnumb2+dblnumb3+dblnumb4+dblnumb5; //find the sum
		System.out.println("The sum of the five numbers is " + dblsum); //display the sum
		
		dblavr = (dblnumb1+dblnumb2+dblnumb3+dblnumb4+dblnumb5)/5; //find the average
		System.out.println("The average of the five number is " + dblavr); // display the avarage
		
		dblmax = Math.max(Math.max(dblnumb3, Math.max(dblnumb1, dblnumb4)), Math.max(dblnumb2, dblnumb5)); //find the max
		System.out.println("The maximum of the five number is " + dblmax); //display the max
		
		dblmin = Math.min(Math.min(dblnumb1, Math.min(dblnumb2, dblnumb3)), Math.min(dblnumb3, dblnumb5)); //find the min
		System.out.println("The minimum of the five number is " + dblmin); //Display the min
		
		int set[] = {int1, int2, int3, int4, int5};//setup the set
		Arrays.sort(set); //reorder it
		middle = set.length/2;//find the middle number
		med = set[middle + 0];//find the median
		System.out.println("The median of the five number is " + med); //diplay the median
		
		
	
	
	}

}



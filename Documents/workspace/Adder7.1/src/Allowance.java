import java.util.Scanner;


public class Allowance {
	public static void main(String[] args) {
		System.out.println("Enter age");
		Scanner keyboard1 = new Scanner(System.in);
		int age =  keyboard1.nextInt();
		double allowance;
		if(age<10) {
			allowance = age*0.75;
		} else { 
			allowance = age*1.00;
		}
		System.out.println(allowance);
		
	}

}

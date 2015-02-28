import java.util.Scanner;


public class average {
	public static void main(String[] args) {
		double sum = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		for(int i=0; i<10; i++) {
			sum += keyboard.nextDouble();
		}
		
		double average = sum/10;
		System.out.println(average);
	}
	

}

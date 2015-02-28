import java.util.Scanner;


public class averagedo {
	public static void main(String[] args) {
		double sum = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 10 numbers (while)");
		int i=0;
		do {
			sum += keyboard.nextDouble();
			i++;
		} while (i<10);
		
		double average = sum/10;
		System.out.println(average);
	}
	

}




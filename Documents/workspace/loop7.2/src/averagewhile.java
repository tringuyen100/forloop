import java.util.Scanner;


public class averagewhile {
	public static void main(String[] args) {
		double sum = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 10 numbers (while)");
		int i=0;
		while (i<10){
			sum += keyboard.nextDouble();
			i++;
		}
		
		double average = sum/10;
		System.out.println(average);
	}
	

}





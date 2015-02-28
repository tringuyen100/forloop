
public class Assignment5 {
	public static void main(String[] args) {
		double number1, number2, number3, average;
		number1 = 12.0;
		number2 = 18.0;
		number3 = 11.0;
		average = (number1+number2+number3)/3;
		
		if(true) {
			System.out.printf("The average with format is %7.2f", average);
		} else {
			System.out.println("The average is " + average);
		}
	}

}

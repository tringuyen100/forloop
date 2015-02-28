import java.util.Scanner;

/**
 * @author Tri Nguyen
 * @date Feb 19 2015
 * 
 */
public class Rectangle {
	public static void main(String[] args) {
		String width = "";
		String height = "";
		double w, h, p, a;
		
		Scanner keyboard1 = new Scanner(System.in);
		Scanner keyboard2 = new Scanner(System.in);
		
		System.out.println("Enter the Width of Rectangle");
		width = keyboard1.next();
		System.out.println("Enter the Height of Rectangle");
		height = keyboard2.next();
		
		w = Double.parseDouble(width);
		h = Double.parseDouble(height);
		p = (w+h)*2;
		a = w*h;
		System.out.println("The Perimeter of Rectangle is " + p + 
							"\nThe Area of Rectangle is " + a);
	}

}

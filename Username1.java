import java.util.Scanner;


public class Username1 {
	public static void main(String[] args) {
		String Username2 = "Admin";
		String Password = "Pass";
		
		System.out.println("Please enter your Username");
		Scanner keyboard = new Scanner(System.in);
		Username2 = keyboard.next();
		
		
		if(Username2.compareTo("Admin") == 0) {
			System.out.println("Please enter your Password");
			Scanner keyboard1 = new Scanner(System.in);
			Password = keyboard.next();
			if(Password.compareTo("Pass") == 0) {
				System.out.println("Welcome User!");
				
			} else {
				System.out.println("Your password is incorrect");
			}
		} else {
			System.out.println("Your username is incorrect");
		}
	}

}


import java.util.Scanner;


public class Username {
	public static void main(String[] args) {
		String Username = "Admin";
		String Password = "Pass";
		int i=0;
		System.out.println("Please enter your username");
		Scanner keyboard = new Scanner(System.in);
		Username = keyboard.next();
		
		
		if(Username.compareTo("Admin") == 0) {
			System.out.println("Please enter your password");
			Scanner keyboard1 = new Scanner(System.in);
			Password = keyboard.next();
			if(Password.compareTo("Pass") == 0) {
				System.out.println("Welcome User!");
				
			} else {
				System.out.println("Your password is incorrect" + "\nEnter your password"); 
				while (i<10) {
					Password = keyboard.next();
					if(Password.compareTo("Pass") == 0) {
						System.out.println("Welcome User!");
					i++;
					
				}
				
				}	
			}
		} else {
			System.out.println("Your username is incorrect" + "\n Enter your username");
			while (i<10) {
				Username = keyboard.next();
				if(Username.compareTo("Admin") == 0)
					System.out.println("Please enter your password");
				Scanner keyboard1 = new Scanner(System.in);
				Password = keyboard.next();
				if(Password.compareTo("Pass") == 0) {
					System.out.println("Welcome User!");
					
				} else {
					System.out.println("Your password is incorrect" + "\nEnter your password"); 
					Password = keyboard.next();
					if(Password.compareTo("Pass") == 0) {
						System.out.println("Welcome User!");
				i++;
			}

		}
}
}
}}
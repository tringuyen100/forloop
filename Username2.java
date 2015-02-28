import java.util.Scanner;


public class Username2{

	public static void main(String[] args) {
		String username = "";
		String password = "";
		String tempuser = "";
		String temppass = "";
		
		System.out.println("Create your username");
		Scanner keyboard1 = new Scanner(System.in);
		username = keyboard1.next();
		System.out.println("Create your password");
		password = keyboard1.next();
		while (true) { 
			System.out.println("Enter the username");
			Scanner keyboard = new Scanner(System.in);
			tempuser = keyboard.next(); 
			if(tempuser.equalsIgnoreCase(username)) {
			System.out.println( "Enter the password");
			temppass = keyboard.next();
			if(temppass.equals(password)) {
				System.out.println("Welcome " + username + "!");
				return;
			} else { System.out.println("Enter the password again");
			
			}
			
		} else { System.out.println("The previous input in incorrect");
		
		} 
		
		} 
	}
}

		


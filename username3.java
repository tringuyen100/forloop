import java.util.Scanner;


public class Username3 {

	public static void main(String[] args) {
		String username = "admin";
		String password = "pass";
		String tempuser = "";
		String temppass = "";
		System.out.println("Enter the username");
		Scanner keyboard = new Scanner(System.in);
		tempuser = keyboard.next();

		
		while (true) { if(tempuser.compareTo("admin") == 0) {
			System.out.println( "Enter the password");
			temppass = keyboard.next();
			if(temppass.compareTo("pass") == 0) {
				System.out.println("Welcome user!");
			} else { System.out.println("Enter the password again");
			
			}
			
		} else { System.out.println("Enter the username again");
		
		 } 
		}
	}
}


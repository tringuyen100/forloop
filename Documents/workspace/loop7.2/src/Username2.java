import java.util.Scanner;

public class Username2{
	public static void main(String []args){
		String user = "User";
		String pass = "User123";
		String tempuser = " ";
		String temppass = " ";
		
		
		System.out.println("Enter your username: ");
		Scanner keyboard = new Scanner(System.in);
		user = keyboard.next();
	
		
		for(int x=1; x<=3;x++){
			if(user.compareTo("User") == 0) {
				System.out.println("Enter your password: ");
				Scanner keyboard1 = new Scanner(System.in);
				pass = keyboard.next();
					if(pass.compareTo("User123") == 0) {
						System.out.println("Welcome User!");}
					
				} 
			 if(!user.equalsIgnoreCase(tempuser)) {
				System.out.println("Your username is incorrect");
				System.out.println("Please enter your username");
				user = keyboard.next(); 
					}
				}
		for (int x=1; x<=3; x++) {
			if(!pass.equalsIgnoreCase(temppass)){
				System.out.println("Your password is incorrect");
				System.out.println("Please enter your password: ");
				pass = keyboard.next();} 
		}
		System.out.println("Too many failed attempts, your account is now locked");
		System.out.println("Please contact your adminstrator to unlock your account!");
	} 


}
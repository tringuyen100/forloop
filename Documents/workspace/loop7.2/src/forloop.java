import java.util.Scanner;


public class forloop {
	public static void main(String[] args) {
		String username = "";
		String password = "";
		String tempuser = "";
		String temppass = "";
		Boolean buser;
		int i=0;
		
		System.out.println("Create a username");
		Scanner keyboard = new Scanner(System.in);
		username = keyboard.next();
		System.out.println("Create a password");
		password = keyboard.next();
		System.out.println("Enter your username");
		tempuser = keyboard.next();
		
		for(int x=1; x<=3;x++){
			if(!tempuser.equalsIgnoreCase(username)) {
				System.out.println("Enter your username again");
				tempuser = keyboard.next();
					}}
			for (int x=1; x<=1; x++) {
				if(!tempuser.equalsIgnoreCase(username)){
					System.out.println("Too many failed attempts, your account is now locked");
					System.out.println("Please contact your adminstrator to unlock your account!"); 
					return;
					}}
	
		System.out.println("Enter your password");
		temppass = keyboard.next();
		
		for(int x=1; x<=3;x++){
			if(!temppass.equalsIgnoreCase(password)) {
				System.out.println("Enter your password again");
				temppass = keyboard.next();}}
			
			
		for (int x=1; x<=1; x++) {
				if(!temppass.equalsIgnoreCase(password)){
					System.out.println("Too many failed attempts, your account is now locked");
					System.out.println("Please contact your adminstrator to unlock your account!"); 
					return;
		
		
			
		
			
				}
		}
			
			
		System.out.println("Welcome " + username);
		
	

}
}
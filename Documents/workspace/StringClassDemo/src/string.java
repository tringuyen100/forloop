
public class string {
	public static void main(String [] args) {
		char ball;
		int ball1, ball4, ball5, ball6, ball7, ball8;
		boolean ball2, ball3;
		String word = "Hello";
		String word1 = "Bye";
		String word2 = "";
		String word3 = "hello";
		String word4 = "    Bye   ";
		ball = word.charAt(2);
		System.out.println(ball);
		ball1 = word.compareTo(word1);
		System.out.println(ball1);
		word2 = word.concat(word1);
		System.out.println("Combine the name: " + word2);		
		ball2 = word.equals(word1);
		System.out.println(ball2);
		ball3 = word.equalsIgnoreCase(word3);
		System.out.println(ball3);
		ball4 = word.indexOf("H");
		ball5 = ball4 + 1;
		System.out.println("H is the " + ball5 + "st letter");
		ball6 = word.lastIndexOf("e");
		System.out.println(ball6);
		ball7 = word.length();
		System.out.println(ball7);
		word2 = word.toLowerCase();
		System.out.println(word2);
		word2 = word.toUpperCase();
		System.out.println(word2);
		word3 = word.replace(word, word1);
		System.out.println(word3);
		word3 = word.substring(2);
		System.out.println(word3);	
		word3 = word.substring(1,3);
		System.out.println(word3);
		word3 = word4.trim();
		System.out.println(word3);
		
		
	}
	

}

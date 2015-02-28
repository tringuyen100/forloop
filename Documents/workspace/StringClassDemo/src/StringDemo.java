
public class StringDemo {
	public static void main(String [] args) {
		int lastNamesize, compareResult;
		char letter ;
		String firstName = "Tri";
		
		
		String lastName1 = new String("Nguyen");
		String lastName2 = new String("Nguyen");
		String lastName3 = new String("Nguyenhien");
		String lastName4 = new String("Ngoyen");
		
		lastNamesize = lastName1.length();
		letter = lastName1.charAt(2);
		compareResult = lastName1.compareTo(lastName2);
		System.out.println(compareResult);
		compareResult = lastName1.compareTo(lastName3);
		System.out.println(compareResult);
		compareResult = lastName1.compareTo(lastName4);
		System.out.println(compareResult);

		System.out.println(lastNamesize);
		System.out.println(letter);
		
	}

}

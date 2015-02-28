/**
 * Name Tri Nguyen
 * Date 02/03/15
 * Email thn2447@email.vccs.edu
 */
import javax.swing.JOptionPane;


public class assignment4 {
	public static void main(String[] args) {
		String userheight = "";
		double dblcmtoin ;
		double dbluserheight, dblin; 
		double ft, ftin; 
		int ft2,ft3, dblin1;
		int in2;
		
		userheight = JOptionPane.showInputDialog("PLease enter your height in centimeter" );
		
		dbluserheight = Double.parseDouble(userheight) ;
		dblcmtoin = 0.39;
		dblin = dbluserheight * dblcmtoin;
		dblin1 = (int) Math.round(dblin);
		ft2 = dblin1/12;
		in2 = dblin1%12;
		//ftin = ft%dblin;
		
	
		
		JOptionPane.showMessageDialog(null, " Your height in centimeter is " + userheight + " cm." + " \n Your height is " + ft2 + " ft " + in2 + " inch.");
	}
	
}
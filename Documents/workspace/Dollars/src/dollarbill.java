import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class dollarbill {
	public static void main(String[] args) {
		String dollars;
		double quarters, quarters1, dimes, dimes1, nickles, nickles1 ,pennies, pennies1, pennies2, dbldollars;
		//DecimalFormat formattingObject = new DecimalFormat("#0.0#");
		
		dollars = JOptionPane.showInputDialog("Please Input the Dollar Amount");
		
		dbldollars = Double.parseDouble(dollars);
		pennies1 = 1*100;
		pennies2 =  pennies1*dbldollars;
		nickles = 1*20;
		nickles1 = nickles*dbldollars;
		dimes = 1*10;
		dimes1 = dimes*dbldollars;
		quarters = 1*4;
		quarters1 = quarters*dbldollars;
		
		//JOptionPane.showMessageDialog(null, formattingObject.format(dollars) + "$ equal" + 
										//" \n" + formattingObject.format(pennies2) + " pennies" +
										//" \n" + formattingObject.format(nickles1) + " nickles" +
										//" \n" + formattingObject.format(dimes1) + " dimes" +
										//" \n" + formattingObject.format(quarters1) + " quarters");
		
		JOptionPane.showMessageDialog(null, dollars + "$ equal" + 
				" \n" + pennies2 + " pennies" +
				" \n" + nickles1 + " nickles" +
				" \n" + dimes1 + " dimes" +
				" \n" + quarters1 + " quarters");
	}

}

import javax.swing.JOptionPane;

/**
 * 
 * @author Tri Nguyen
 * Date: 02/03/15
 * Contact: thn2447@email.vccs.edu
 *
 */
public class UserInput {
	public static void main(String[] args) {
		String strLaborHours = "";
		String strHourRates = "";
		String strTaxRates = "";
		double dblLaborHours, dblHourRates, dblPayAmount, dblTaxRates, dblTaxAmount, dblNetPay;
		
		strLaborHours = JOptionPane.showInputDialog("Enter the labor hours");
		strHourRates = JOptionPane.showInputDialog("Enter the hour rates");
		strTaxRates = JOptionPane.showInputDialog("Enter the tax rates");
		
		dblLaborHours = Double.parseDouble(strLaborHours);
		dblHourRates = Double.parseDouble(strHourRates);
		dblPayAmount = dblLaborHours * dblHourRates;
		dblTaxRates = Double.parseDouble(strTaxRates);
		dblTaxAmount = dblTaxRates * dblPayAmount;
		dblNetPay = dblPayAmount - dblTaxAmount;
		
		
		JOptionPane.showMessageDialog(null, "The labor hour(s) is " + strLaborHours + ". \n and the hour rates is $" + strHourRates + "/ hour. \n" 
				+ "The pay amount is $" + dblPayAmount + ". \n Tax amount is $" + dblTaxAmount + ". \n The net payment is $ " + dblNetPay + ".");
	}

}

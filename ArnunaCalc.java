import javax.swing.*;

public class ArnunaCalc {
	public static void main(String[] args) {
		
	double AreaOfProperty;
	double PricePerMeter;

	// setting up a frame for user dialog
	JFrame frame = new JFrame("User Dialog");

	// get user data input in a Dialog 
	String strAreaOfProperty = JOptionPane.showInputDialog(frame, "The Property Area:");
	String strPricePerMeter = JOptionPane.showInputDialog(frame, "Cost Per Meter:");
	
	// converting input strings to numbers
	PricePerMeter = Double.parseDouble(strPricePerMeter);
	AreaOfProperty = Double.parseDouble(strAreaOfProperty);
	
	//calculating
	double calc = (AreaOfProperty * PricePerMeter);

	//Show The result in the Dialog box
	JOptionPane.showMessageDialog(null,"You'r Payment is: " + String.format("%.2f", calc) + "$");
	
	}
}
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Difficult_Maristela {
	 
	
public static void main(String args[]) {
	DecimalFormat three; // instantiation of object named "three"    
	 three = new DecimalFormat("#,##0.000");
	 double m, cm, in;
	String output;
	 
	 m = Double.parseDouble(JOptionPane.showInputDialog("Enter any number to convert to inches and centimeters", "In Meters"));
	 cm = 100 * m;
	 in = 39.3701 * m;
	 
	 output = "You input " + three.format(m) + "\nThe answer in centimeters is " + three.format(cm) + "\nThe answer in inches is " + three.format(in);
	 
	 
	 JOptionPane.showMessageDialog(null, output);
     System.exit(0);

	
			}	
}


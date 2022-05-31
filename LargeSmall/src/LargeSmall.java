import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

    

public class LargeSmall extends JApplet {
	double num1, num2, num3, num4, num5, large, small;
	
	
	public void init () {
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Input First Integer"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Input Second Integer"));
		num3 = Double.parseDouble(JOptionPane.showInputDialog("Input Third Integer"));
		num4 = Double.parseDouble(JOptionPane.showInputDialog("Input Fouth Integer"));
		num5 = Double.parseDouble(JOptionPane.showInputDialog("Input Fifth Integer"));
		
		large = num1;
		
		
		if( num2 > large)
			large = num2;
		
		if ( num3 > large)
			large = num3;
		
		if ( num4 > large)
			large = num4;
		
		if ( num5 > large)
			large = num5;
		
		
		
		small = num1;
		
		if( num2 < small)
			small = num2;
		
		if ( num3 < small)
			small = num3;
		
		if ( num4 < small)
			small = num4;
		
		if ( num5 < small)
			small = num5;
		
		
		
		
		
		
		
		}
	
	public void paint (Graphics g) {
		g.drawString("Input: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " ,25,25); 
		g.drawString("The Largest is: " + large, 25, 40);
		g.drawString("The Smallest is: " + small, 25, 55);

	}
}


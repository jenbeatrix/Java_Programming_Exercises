
import java.awt.*;

import javax.swing.JOptionPane;

public class Exponent {
	
	public Exponent() {
		// TODO Auto-generated constructor stub
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long base, exponent;
		long answer;
		String input1;
		String input2;
	
		
		input1 =  JOptionPane.showInputDialog("Enter the base you would like raised to a power: ");
	    input2 = JOptionPane.showInputDialog("Enter the power you would like it raised to: ");
		 
	     base = Long.parseLong(input1);
		 exponent = Long.parseLong(input2);
		 
		 answer = power(base, exponent);
		 JOptionPane.showMessageDialog(null, base + " raised to the " + exponent + " is " + answer);

	}
	public static long power (long base, long exponent) {
		long result = 0;
		
		
		if ( exponent == 0 ) {
	        return 1;
		}if ( exponent ==1){
			return base;
	    }
	    return ( base * power(base,exponent-1));
	}
}
	

		
	
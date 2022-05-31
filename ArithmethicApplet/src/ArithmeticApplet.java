import java.awt.Graphics;
import java.text.DecimalFormat;

import javax.swing.JApplet;
import java.awt.Graphics;
import javax.swing.JOptionPane;


public class ArithmeticApplet extends JApplet {
             DecimalFormat three; // instantiation of object named "three"    
                 
                
                double a, b, sum, dif, pro, quo, mod;
            
      public void init () {
            three = new DecimalFormat("#,##0.000");
    	  a = Double.parseDouble(JOptionPane.showInputDialog("Input First Number"));
  		  b = Double.parseDouble(JOptionPane.showInputDialog("Input Second Integer"));
            
         
            
            sum = a + b;
            dif = a - b;
            pro = a * b;
            quo = a / b;
            mod = a % b;
            
            
            
    }
      public void paint (Graphics g) {
  		g.drawString("The sum is: " + three.format(sum) ,25,25); 
  		g.drawString("The difference is: " + three.format(dif), 25, 40);
  		g.drawString("The product is: " + three.format(pro), 25, 55);
  		g.drawString("The quotient is: " + three.format(quo), 25, 70);
  		g.drawString("The remainder is: " + three.format(mod), 25, 85);
  		

      }
}

            

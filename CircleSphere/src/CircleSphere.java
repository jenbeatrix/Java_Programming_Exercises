import javax.swing.*;
import java.text.DecimalFormat;

public class CircleSphere {
        DecimalFormat three; // instantiation of object named "three"
    
        public static void main(String args[]) {
            DecimalFormat three; // instantiation of object named "three"    
            three = new DecimalFormat("#,##0.000"); 
            String output;
            
            double r, diameter, circumference, area, volume;
            
            r = Double.parseDouble(JOptionPane.showInputDialog("Input radius"));
            
            diameter = 2 * r;
            circumference = Math.PI * 2 * r;
            area = Math.PI * Math.pow(r, 2);
            volume = (4 * Math.PI * Math.pow(r, 3))/3;
            output = "The diameter is " + three.format(diameter) + "\nThe circumference is " + three.format(circumference) + 
            									"\nThe area is " + three.format(area) + "\nThe volume is " + three.format(volume);
            
            JOptionPane.showMessageDialog(null, output);
            System.exit(0);
            
          
               
        }
}
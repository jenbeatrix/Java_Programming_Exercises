import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DrawRect_Maristela extends JApplet {
	
						int x, y, length, width;
	
			

		public void init () {
					
					x = Integer.parseInt(JOptionPane.showInputDialog("Enter x"));
					y = Integer.parseInt(JOptionPane.showInputDialog("Enter y"));
					length = Integer.parseInt(JOptionPane.showInputDialog("Enter length"));
					width = Integer.parseInt(JOptionPane.showInputDialog("Input width"));
					
	}

		public void paint (Graphics g) {
			g.drawRect( x, y, length, width );
		
			
		}
}


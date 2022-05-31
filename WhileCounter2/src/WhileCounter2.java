import java.awt.Graphics;

import javax.swing.JApplet;


public class WhileCounter2 extends JApplet {
	public void paint(Graphics g) {
	
		for(int count = 1; count<= 10; count++) {
			g.drawLine (25,10, 250, count* 10);
		}
	}
}

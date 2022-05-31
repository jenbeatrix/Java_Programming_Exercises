import java.awt.Graphics;

import javax.swing.JApplet;


public class WhileCounter extends JApplet {
	public void paint(Graphics g) {
		int count = 0;
		while(count <= 10) {
			g.drawLine(25, 10, 250, count * 10);
			count++;
		}
	}
}

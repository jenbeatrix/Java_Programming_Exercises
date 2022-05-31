import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JApplet;


public class mid02_Maristela extends JApplet implements ActionListener {
	JLabel crizzyL;
	JTextField crizzyF;
	int num1 = 0, num2 = 0, pro = 0;

	public void init(){
		// TODO Auto-generated constructor stub
	crizzyL = new JLabel("Answer: ");
	crizzyF = new JTextField(4);
	
	num1 = 1 + (int) (Math.random() * 10);
	num2 = 1 + (int) (Math.random() * 10);
	
	JOptionPane.showMessageDialog(null, "How much is " + num1 + " times " + num2 + "?");
	
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	
	crizzyF.addActionListener(this);
	
	c.add(crizzyL);
	c.add(crizzyF);
	}

	
	public void actionPerformed(ActionEvent arg0) {
		String input = crizzyF.getText();
		int crizzyF0 = Integer.parseInt(input);
		
		pro = num1 * num2;
		
		if (pro == crizzyF0) {
			JOptionPane.showMessageDialog(null, "Very Good!");
			MethodHere();
		}
		else {
			JOptionPane.showMessageDialog(null, "No, Please try again.");
			showStatus("How much is " + num1 + " times " + num2 + "?" );
		
		}
	}
	public void MethodHere() {
		num1 = 1 + (int) (Math.random() * 10);
		num2 = 1 + (int) (Math.random() * 10);
		
		showStatus("How much is " + num1 + " times " + num2 + "?" );
		
	}
	
}
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class MultiplicationTable extends JApplet implements ActionListener {
		JLabel lblrow, lblcolumn;
	   JTextField fldrow, fldcolumn;
	   JTextArea areatanan;
	   JScrollPane updown;
	   int row, column;
	  
	   
public void init() {
			
		   Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			lblrow = new JLabel("Row: ");
			lblcolumn = new JLabel ("Column: ");
			areatanan=new JTextArea(20,45);
			updown = new JScrollPane(areatanan);
			
			
			fldrow = new JTextField(5);      
			fldcolumn = new JTextField(5); 
			
			
			c.add(lblrow);												
			c.add(fldrow);
			c.add(lblcolumn);
			c.add(fldcolumn);
			c.add(updown);
			
			fldrow.addActionListener(this);
			fldcolumn.addActionListener(this);
			
	  }
	  
	  
public void actionPerformed(ActionEvent arg0) {

		   	row=Integer.parseInt( fldrow.getText());
		    column=Integer.parseInt( fldcolumn.getText());
		    showStatus(row + " x " + column+ " Multiplication Table");
		    
		       int [][] table = new int [row][column];
		    areatanan.setText(null);
		    for (int RW1 = 0; RW1<row; RW1++){
		    for (int CM1 = 0; CM1<column; CM1++) {
		    table [RW1][CM1] = ((1 + RW1) * (1 + CM1));
		    }
}

		    for (int RW1 = 0; RW1<table.length; RW1++){
		    for (int CM1 = 0; CM1<table [RW1].length; CM1++){
		    areatanan.append(table[RW1][CM1] + "\t");
	}
		    areatanan.append("\n");
		
		    
		    	}
	  	}
 }
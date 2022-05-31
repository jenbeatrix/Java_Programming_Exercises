import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ButtonNames extends JFrame implements ActionListener{
	JButton btn[];
	JFrame frame;
	String name[] = {"Joel Upaw", "ATIENZA", "AVERGONZADO", "BALBUENA", "BANAGLORIOSO", "CABRERA", "GUDA", "GUTIERREZ", "KO", "LABIOS", "LACUESTA", "LAGO", "LAGUITAO", "LAMINTAC", "MACUNLAY", "MAHALINGAM", "MARAGUINOT", "MARISTELA", "MASAYON", "MATEO", "MEJOS", "SANTOS", "VALDEROSA", "VILLALUNA"};
		
	public ButtonNames() {
		// TODO Auto-generated constructor stub
		frame = new JFrame();
		frame.setLayout(new GridLayout(6,4, 5,5));//
		
		btn = new JButton[name.length];
		
		for(int i = 0; i < name.length; i++) {
			btn[i] = new JButton(name[i]);
			btn[i].addActionListener(this);
		}
		
		for(int j = 0; j < name.length; j++) {
			frame.add(btn[j]);
		}
		
		frame.setSize(700, 300);
		frame.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ButtonNames app = new ButtonNames();
		app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Object o = arg0.getSource();
		for(int i = 0; i < name.length; i++) {
			if(o == btn[i]) {
				JOptionPane.showMessageDialog(null, name[i]);
			}
		}
	}

}

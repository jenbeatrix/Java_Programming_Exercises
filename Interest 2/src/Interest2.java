import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;




public class Interest2 {

	public Interest2() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub //F = P( 1 + i)*y
		DecimalFormat two = new DecimalFormat("P #,##0.00");
		double interest, principal, amount;
		int year;
		
		JTextArea area = new JTextArea(20,30);
		JScrollPane scroll = new JScrollPane(area);
		principal = Double.parseDouble(JOptionPane.showInputDialog("Enter Principal amount"));
		interest = Double.parseDouble(JOptionPane.showInputDialog("Enter Interest rate"));
		year = Integer.parseInt(JOptionPane.showInputDialog("Enter Compounding year"));
		
		String output = "Principal:\t\t" + two.format(principal) +
									"\nInterest (%):\t\t" + two.format(interest) + "%" +
									"\nCompounding Year:\t" + two.format(year) +
									"\n\nYear\t\tAmount:\n";
		
		area.setText(output);
		
		for(int i = 1; i <= year; i++) {
				amount = principal * Math.pow(1 + interest/100, i);
				area.append(i + "\t\t" + two.format(amount) + "\n");
			
		}
		
		JOptionPane.showMessageDialog(null, scroll, "Compund Interest", JOptionPane.PLAIN_MESSAGE);
		System.exit(0);
	}

}


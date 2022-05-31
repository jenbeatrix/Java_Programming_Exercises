import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class NumToWord extends JApplet {

String W;
int w1, w2, w3,w4, w5;
JFrame frame;
JLabel inputN;
JTextField fld1 , fld2 , fld3;
String gawas, q1, q2, q3, q4, q5;
DecimalFormat wala;

public void init() {

fld1 = new JTextField(5);
fld3 = new JTextField(5);
inputN = new JLabel("Enter number from 0 to 99999 ");
fld2 = new JTextField(30);
wala = new DecimalFormat("##,###");

Container g = getContentPane();

g.setLayout(new FlowLayout());

g.add(inputN);
g.add(fld1);
g.add(fld3);
g.add(fld2);

fld2.setEditable(false);
fld3.setEditable(false);
fld1.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent arg0) {

int NTW = Integer.parseInt(fld1.getText());
W = fld1.getText();
int LNG = W.length();

if (LNG >= 6) {JOptionPane.showMessageDialog(null,"Invalid input. Number must be from 0 to 99999",
"ERROR", JOptionPane.ERROR_MESSAGE, null);

fld2.setText("");
fld1.setText("");
}

if (NTW >= 100000) {JOptionPane.showMessageDialog(null,"Invalid input. Number must be from 0 to 99999",
"ERROR", JOptionPane.ERROR_MESSAGE, null);

fld2.setText("");
fld1.setText("");
}

w1 = NTW / 10000;
w2 = NTW % 10000 / 1000;
w3 = NTW % 10000 % 1000 / 100;
w4 = NTW % 10000 % 1000 % 100 / 10;
w5 = NTW % 10000 % 1000 % 100 % 10 / 1;

System.out.println(w1);
System.out.println(w2);
System.out.println(w3);
System.out.println(w4);
System.out.println(w5);

switch (w5) {

case 0:
gawas = "";
break;

case 1:
gawas = "One";
break;

case 2:
gawas = "Two";
break;

case 3:
gawas = "Three";
break;

case 4:
gawas = "Four";
break;

case 5:
gawas = "Five";
break;

case 6:
gawas = "Six";
break;

case 7:
gawas = "Seven";
break;

case 8:
gawas = "Eight";
break;

case 9:
gawas = "Nine";
break;

}

q1 = gawas;

switch (w4) {

case 0:
gawas = "";
break;

case 1:
gawas = "One";
break;

case 2:
gawas = "Twenty" + " " + q1;
break;

case 3:
gawas = "Thirty" + " " + q1;
break;

case 4:
gawas = "Fourty" + " " + q1;
break;

case 5:
gawas = "Fifty" + " " + q1;
break;

case 6:
gawas = "Fifty" + " " + q1;
break;

case 7:
gawas = "Seventy" + " " + q1;
break;

case 8:
gawas = "Eighty" + " " + q1;
break;

case 9:
gawas = "Ninety" + " " + q1;
break;
}

q2 = gawas;

switch (w3) {

case 0: 
gawas = "Zero" + " " + q2;
break;

case 1:
gawas = "One Hundred" + " " + q2;
break;

case 2:
gawas = "Two Hundred" + " " + q2;
break;

case 3:
gawas = "Three Hundred" + " " + q2;
break;

case 4:
gawas = "Four Hundred" + " " + q2;
break;

case 5:
gawas = "Five Hundred" + " " + q2;
break;

case 6:
gawas = "Six Hundred" + " " + q2;
break;

case 7:
gawas = "Seven Hundred" + " " + q2;
break;

case 8:
gawas = "Eight Hundred" + " " + q2;
break;

case 9:
gawas = "Nine Hundred" + " " + q2;
break;

}

q3 = gawas;

if (w1 == 1) {

switch (w2) {
case 2:
gawas = "Twelve Thousand" + " " + q3;
break;
}

fld2.setText("" + gawas);
}

switch (w2) {

case 1:
gawas = "One Thousand" + " " + q3;
break;

case 2:
gawas = "Two Thousand" + " " + q3;
break;

case 3:
gawas = "Three Thousand" + " " + q3;
break;

case 4:
gawas = "Four Thousand" + " " + q3;
break;

case 5:
gawas = "Five Thousand" + " " + q3;
break;

case 6:
gawas = "Six Thousand" + " " + q3;
break;

case 7:
gawas = "Seven Thousand" + " " + q3;
break;

case 8:
gawas = "Eight Thousand" + " " + q3;
break;

case 9:
gawas = "Nine Thousand" + " " + q3;
break;

}

q4 = gawas;

switch (w1) {

case 1:
gawas = "One Hundred " + " " + q4;
break;

case 2:
gawas = "Twenty" + " " + q4;
break;

case 3:
gawas = "Thirty" + " " + q4;
break;

case 4:
gawas = "Fourty" + " " + q4;
break;

case 5:
gawas = "Fifty" + " " + q4;
break;

case 6:
gawas = "Sixty" + " " + q4;
break;

case 7:
gawas = "Seventy" + " " + q4;
break;

case 8:
gawas = "Eighty" + " " + q4;
break;

case 9:
gawas = "Ninety" + " " + q4;
break;

}

q5 = gawas;
System.out.println(gawas);
fld2.setText("" + gawas);

if (LNG == 1) {

switch (w5) {

case 0:
gawas = "Zero";
break;

case 1:
gawas = "One";
break;

case 2:
gawas = "Two";
break;

case 3:
gawas = "Three";
break;

case 4:
gawas = "Four";
break;

case 5:
gawas = "Five";
break;

case 6:
gawas = "Six";
break;

case 7:
gawas = "Seven";
break;

case 8:
gawas = "Eight";
break;

case 9:
gawas = "Nine";
break;
}

fld2.setText("" + gawas);

}

if (LNG == 2) {

switch (NTW) {

case 10:
gawas = "Ten";
break;

case 11:
gawas = "Eleven";
break;

case 12:
gawas = "Twelve";
break;

case 13:
gawas = "Thirteen";
break;

case 14:
gawas = "Fourteen";
break;

case 15:
gawas = "Fifteen";
break;

case 16:
gawas = "Sixteen";
break;

case 17:
gawas = "Seventeen";
break;

case 18:
gawas = "Eighteen";
break;

case 19:
gawas = "Nineteen";
break;

case 20:
gawas = "Twenty";
break;

case 30:
gawas = "Thirty";
break;

case 40:
gawas = "Fourty";
break;

case 50:
gawas = "Fifty";
break;

case 60:
gawas = "Sixty";
break;

case 70:
gawas = "Seventy";
break;

case 80:
gawas = "Eighty";
break;

case 90:
gawas = "Ninety";
break;

}
fld2.setText("" + gawas);
}

if (LNG == 3) {

switch (NTW) {

case 100:
gawas = "One Hundred";
break;

case 200:
gawas = "Two Hundred";
break;

case 300:
gawas = "Three Hundred";
break;

case 400:
gawas = "Four Hundred";
break;

case 500:
gawas = "Five Hundred";
break;

case 600:
gawas = "Six Hundred";
break;

case 700:
gawas = "Seven Hundred";
break;

case 800:
gawas = "Eight Hundred";
break;

case 900:
gawas = "Nine Hundred";
break;
}

fld2.setText("" + gawas);
}

if (LNG == 4) {

switch (NTW) {

case 1000:
gawas = "One Thousand";
break;

case 2000:
gawas = "Two Thousand";
break;

case 3000:
gawas = "Three Thousand";
break;

case 4000:
gawas = "Four Thousand";
break;

case 5000:
gawas = "Five Thousand";
break;

case 6000:
gawas = "Six Thousand";
break;

case 700:
gawas = "Seven Thousand";
break;

case 8000:
gawas = "Eight Thousand";
break;

case 9000:
gawas = "Nine Thousand";
break;

}

fld2.setText("" + gawas);

}
if (LNG == 5) {

switch (NTW) {

case 10000:
gawas = "Ten Thousand";
break;

case 20000:
gawas = "Twenty Thousand";
break;

case 30000:
gawas = "Thirty Thousand";
break;

case 40000:
gawas = "Fourty Thousand";
break;

case 50000:
gawas = "Fifty Thousand";
break;

case 60000:
gawas = "Sixty Thousand";
break;

case 70000:
gawas = "Seventy Thousand";
break;

case 80000:
gawas = "Eighty Thousand";
break;

case 90000:
gawas = "Ninety Thousand";
break;

}

fld2.setText("" + gawas);

	}

fld3.setText("" + wala.format(NTW));
	}

			});
		}
}
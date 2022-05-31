import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UnitConversion extends JApplet implements ActionListener {
JTextField fld_ac , fld_h , fld_sqmeter , fld_sqkilom;
JLabel lbl_ac , lbl_h , lbl_sqmeter , lbl_sqkilom;
DecimalFormat Q = new DecimalFormat("#,##0.00000");
double ac, h, sqmeter, sqkilom;

public void init(){

Container a = getContentPane();
a.setLayout(new FlowLayout());

fld_h  = new JTextField(10);
fld_ac = new JTextField(10);
fld_sqmeter = new JTextField(10);
fld_sqkilom = new JTextField(10);

lbl_ac = new JLabel("acre");
lbl_h   = new JLabel("ha");
lbl_sqmeter  = new JLabel("sq.mi.");
lbl_sqkilom = new JLabel("sq.km");

fld_h.addActionListener(this);
a.add(fld_h);
a.add(lbl_h);
fld_ac.addActionListener(this);
a.add(fld_ac);
a.add(lbl_ac);
fld_sqkilom.addActionListener(this);
a.add(fld_sqkilom);
a.add(lbl_sqkilom);
fld_sqmeter.addActionListener(this);
a.add(fld_sqmeter);
a.add(lbl_sqmeter);

}

public void actionPerformed(ActionEvent a){
Object obj = a.getSource();

if (obj.equals(fld_h)) {
h = Double.parseDouble(fld_h.getText());

ac = h * 2.47105  ;
sqkilom = h / 100  ;
sqmeter  = sqkilom / 2.58999;

fld_ac.setText(Q.format(ac));
fld_sqmeter.setText(Q.format(sqmeter));
fld_sqkilom.setText(Q.format(sqkilom));
showStatus("Unit Conversion");
}


Object obj1 = a.getSource();

if (obj1.equals(fld_ac)){
ac = Double.parseDouble(fld_ac.getText());

h = ac / 2.47105   ;
sqkilom = h / 100 ;
sqmeter  = sqkilom / 2.58999 ;

fld_h.setText(Q.format(h));
fld_sqmeter.setText(Q.format(sqmeter));
fld_sqkilom.setText(Q.format(sqkilom));
showStatus("Unit Conversion");
}

Object obj2 = a.getSource();
if (obj2.equals(fld_sqmeter)){
sqmeter = Double.parseDouble(fld_sqmeter.getText());

sqkilom = sqmeter * 2.58999 ;
h = sqkilom * 100 ;
ac  = h * 2.47105 ;

fld_h.setText(Q.format(h));
fld_ac.setText(Q.format(ac));
fld_sqkilom.setText(Q.format(sqkilom));
showStatus("Unit Conversion");
}

Object obj3 = a.getSource();
if (obj3.equals(fld_sqkilom)){
sqkilom = Double.parseDouble(fld_sqkilom.getText());

h = sqkilom * 100 ;
ac  = h * 2.47105 ;
sqmeter = sqkilom / 2.58999 ;

fld_h.setText(Q.format(h));
fld_sqmeter.setText(Q.format(sqmeter));
fld_ac.setText(Q.format(ac));
showStatus("Unit Conversion");

				}
			}
		}
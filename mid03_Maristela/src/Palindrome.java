import javax.swing.JOptionPane;

public class Palindrome {


public static void main(String[] args) {
 int NUMBA;
 int Z1;
 int Z2;
 int Z3;
 int Z4;
 int Z5;
 int O;
 int p = 0;
 String w;
 
 do{
w = JOptionPane.showInputDialog("Enter a 5-DIGIT NUMBER to check if it is a Palindrome.");

NUMBA = Integer.parseInt(w);
Z1 =  NUMBA / 10000;
Z2 = NUMBA % 10000 / 1000;
Z3 = NUMBA % 10000 % 1000 / 100;
Z4 = NUMBA % 10000 % 1000 % 100 / 10;
Z5 = NUMBA % 10000 % 1000 % 100 % 10;
O= w.length();

if ( O != 5){
JOptionPane.showMessageDialog(null, "THE NUMBERS YOU INPUT, " + NUMBA + " IS NOT A FIVE-DIGIT NUMBER. ","Error",JOptionPane.ERROR_MESSAGE);
p=0;
}

else if (Z1 == Z5 & Z2 == Z4){
JOptionPane.showMessageDialog(null,"THE 5-DIGIT NUMBER  " + NUMBA + " IS A PALINDROME.");
p=1;
}

else{
JOptionPane.showMessageDialog(null, "THE 5-DIGIT NUMBER " + NUMBA + " IS NOT A PALINDROME. ","Error",JOptionPane.ERROR_MESSAGE);
p=0;
	}

 }
 while( p==0);
 System.exit(0);

	}
}
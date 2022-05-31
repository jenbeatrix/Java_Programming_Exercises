// Fig. 8.5: TimeTest.java
// Demonstrating the Time3 class set and get methods
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TimeTest extends JApplet
                      implements ActionListener {
   private Time3 t;
   private JLabel hourLabel, minuteLabel, secondLabel;
   private JTextField hourField, minuteField,
                      secondField, display;
   private JButton tickButton;

   public void init()
   {
      t = new Time3();

      Container c = getContentPane();

      c.setLayout( new FlowLayout() );
      hourLabel = new JLabel( "Set Hour" );
      hourField = new JTextField( 10 );
      hourField.addActionListener( this );
      c.add( hourLabel );
      c.add( hourField );

      minuteLabel = new JLabel( "Set minute" );
      minuteField = new JTextField( 10 );
      minuteField.addActionListener( this );
      c.add( minuteLabel );
      c.add( minuteField );

      secondLabel = new JLabel( "Set Second" );
      secondField = new JTextField( 10 );
      secondField.addActionListener( this );
      c.add( secondLabel );
      c.add( secondField );

      display = new JTextField( 30 );
      display.setEditable( false );
      c.add( display );

      tickButton = new JButton( "Add 1 to Second" );
      tickButton.addActionListener( this );
      c.add( tickButton );

      updateDisplay();      
   }

   public void actionPerformed( ActionEvent e )
   {
      if ( e.getSource() == tickButton )
         tick();
      else if ( e.getSource() == hourField ) {
         t.setHour(
            Integer.parseInt( e.getActionCommand() ) );
         hourField.setText( "" );
      }
      else if ( e.getSource() == minuteField ) {
         t.setMinute(
            Integer.parseInt( e.getActionCommand() ) );
         minuteField.setText( "" );
      }
      else if ( e.getSource() == secondField ) {
         t.setSecond(
            Integer.parseInt( e.getActionCommand() ) );
         secondField.setText( "" );
      }

      updateDisplay();
   }

   public void updateDisplay()
   {
      display.setText( "Hour: " + t.getHour() +
         "; Minute: " + t.getMinute() +
         "; Second: " + t.getSecond() );
      showStatus( "Standard time is: " + t.toString() +
         "; Universal time is: " + t.toUniversalString() );
   }

   public void tick()
   {
      t.setSecond( ( t.getSecond() + 1 ) % 60 );

      if ( t.getSecond() == 0 ) {
         t.incrementmin();

      if ( t.getMinute() == 0 )
          t.Incrementhr();
      }
   }
}


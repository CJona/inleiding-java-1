package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class h8_praktijk extends Applet {
    TextField getal1;
    TextField getal2;	
    Button plus;
    Button min;
    Button deel;
    Button keer;
	
    public void init() {
    	setSize(400, 50);
        getal1 = new TextField("", 10);
        getal2 = new TextField("", 10);
        plus = new Button("+");
        min = new Button("-");
        deel = new Button("/");
        keer = new Button("*");
        plus.addActionListener( new PlusListener() );
        min.addActionListener( new MinListener() );
        deel.addActionListener( new DeelListener() );
        keer.addActionListener( new KeerListener() );
        add(getal1);
        add(getal2);
        add(plus);
        add(min);
        add(deel);
        add(keer);
    }

    public void paint(Graphics g) {
    }
    
	
    class PlusListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
        	getal1.setText("" + ( Double.parseDouble(getal1.getText()) + Double.parseDouble(getal2.getText()) ));
        	getal2.setText("");
            repaint();
        }
    }
    class MinListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
        	getal1.setText("" + ( Double.parseDouble(getal1.getText()) - Double.parseDouble(getal2.getText()) ));
        	getal2.setText("");
            repaint();
        }
    }
    class DeelListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            getal1.setText("" + ( Double.parseDouble(getal1.getText()) / Double.parseDouble(getal2.getText()) ));
            getal2.setText("");
            repaint();
        }
    }
    class KeerListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
        	getal1.setText("" + ( Double.parseDouble(getal1.getText()) * Double.parseDouble(getal2.getText()) ));
        	getal2.setText("");
            repaint();
        }
    }
}
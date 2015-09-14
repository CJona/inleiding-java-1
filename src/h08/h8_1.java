package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class h8_1 extends Applet {
    TextField tekstvak;				
    Button knop;
    Button reset;
    String schermtext = "Vul iets in de tekstvak.";
	
    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        reset = new Button("Reset");
        reset.addActionListener( new ResetListener() );
        knop.addActionListener( new KnopListener() );
        add(reset);
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("" + schermtext , 50, 60 );
    }
    
	
    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
        	schermtext = tekstvak.getText();
            tekstvak.setText(":)");
            repaint();
        }
    }

    class ResetListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
        	schermtext = "Vul iets in de tekstvak.";
            tekstvak.setText("");
            repaint();
        }
    }
}
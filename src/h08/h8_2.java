package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class h8_2 extends Applet {			
    Button man;
    Button vrouw;
    Button mleerlingen;
    Button vleerlingen;
    int mannen = 0;
    int vrouwen = 0;
    int manleerlingen = 0;
    int vrouwleerlingen = 0;
    String schermtext = "";
    String schermtext2 = "";
    String schermtext3 = "";
    String schermtext4 = "";
    String schermtext5 = "";
	
    public void init() {
    	man = new Button("Mannen");
    	vrouw = new Button("Vrouwen");
    	mleerlingen = new Button("Mannelijke leerlingen");
    	vleerlingen = new Button("Vrouwelijke leerlingen");
    	man.addActionListener( new KnopListener() );
    	vrouw.addActionListener( new KnopListener2() );
    	mleerlingen.addActionListener( new KnopListener3() );
    	vleerlingen.addActionListener( new KnopListener4() );
        add(man);
        add(vrouw);
        add(mleerlingen);
        add(vleerlingen);
    }

    public void paint(Graphics g) {
    	g.drawString("" + schermtext , 20, 120 );
    	g.drawString("" + schermtext2 , 20, 135 );
    	g.drawString("" + schermtext3 , 20, 150 );
    	g.drawString("" + schermtext4 , 20, 165 );
    	g.drawString("" + schermtext5 , 20, 180 );
    }
    
	
    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
        	mannen++;
        	schermtext = "Aantal mannen = " + mannen ;
        	schermtext2 = "Aantal vrouwen = " + vrouwen ;
        	schermtext3 = "Aantal mannelijke leerlingen = " + manleerlingen ;
        	schermtext4 = "Aantal vrouwelijke leerlingen = " + vrouwleerlingen ;
        	schermtext5 = "Totaal: " + (mannen + vrouwen + manleerlingen + vrouwleerlingen);
            repaint();
        }
    }
    class KnopListener2 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
        	vrouwen++;
        	schermtext = "Aantal mannen = " + mannen ;
        	schermtext2 = "Aantal vrouwen = " + vrouwen ;
        	schermtext3 = "Aantal mannelijke leerlingen = " + manleerlingen ;
        	schermtext4 = "Aantal vrouwelijke leerlingen = " + vrouwleerlingen ;
        	schermtext5 = "Totaal: " + (mannen + vrouwen + manleerlingen + vrouwleerlingen);
            repaint();
        }
    }
    class KnopListener3 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
        	manleerlingen++;
        	schermtext = "Aantal mannen = " + mannen ;
        	schermtext2 = "Aantal vrouwen = " + vrouwen ;
        	schermtext3 = "Aantal mannelijke leerlingen = " + manleerlingen ;
        	schermtext4 = "Aantal vrouwelijke leerlingen = " + vrouwleerlingen ;
        	schermtext5 = "Totaal: " + (mannen + vrouwen + manleerlingen + vrouwleerlingen);
            repaint();
        }
    }
    class KnopListener4 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
        	vrouwleerlingen++;
        	schermtext = "Aantal mannen = " + mannen ;
        	schermtext2 = "Aantal vrouwen = " + vrouwen ;
        	schermtext3 = "Aantal mannelijke leerlingen = " + manleerlingen ;
        	schermtext4 = "Aantal vrouwelijke leerlingen = " + vrouwleerlingen ;
        	schermtext5 = "Totaal: " + (mannen + vrouwen + manleerlingen + vrouwleerlingen);
            repaint();
        }
    }
}
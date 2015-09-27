package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class h10_3 extends Applet {
    TextField input1;
    int maandgetal;
    String maandstring = "";
    Button Ok;
	
    public void init() {
    	setSize(200, 80);
        input1 = new TextField("", 10);
        input1.addActionListener(new TextListener());
        Ok = new Button("Ok");
        Ok.addActionListener( new OkListener() );
        add(input1);
        add(Ok);
    }

    public void paint(Graphics g) {
    	g.drawString("" + maandstring, 20, 50);
    	
    }
    
	
    class OkListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
        	int tempgetal = Integer.parseInt(input1.getText());
        	if(tempgetal < 1 || tempgetal > 12) {
        		maandstring = "Ongeldige maand";
        	}
        	else switch(tempgetal)
        	{
	        	case 1: maandstring = "Maand 1 - Januari heeft 31 dagen."; break;
	        	case 2: maandstring = "Maand 2 - Februari heeft 28 dagen."; break;
	        	case 3: maandstring = "Maand 3 - Maart heeft 31 dagen."; break;
	        	case 4: maandstring = "Maand 4 - April heeft 30 dagen."; break;
	        	case 5: maandstring = "Maand 5 - Mei heeft 31 dagen."; break;
	        	case 6: maandstring = "Maand 6 - Juni heeft 30 dagen."; break;
	        	case 7: maandstring = "Maand 7 - Juli heeft 31 dagen."; break;
	        	case 8: maandstring = "Maand 8 - Augustus heeft 31 dagen."; break;
	        	case 9: maandstring = "Maand 9 - September heeft 30 dagen."; break;
	        	case 10: maandstring = "Maand 10 - Oktober heeft 31 dagen."; break;
	        	case 11: maandstring = "Maand 11 - November heeft 30 dagen."; break;
	        	case 12: maandstring = "Maand 12 - December heeft 31 dagen."; break;
        	}
            repaint();
        }
    }
    class TextListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
        	int tempgetal = Integer.parseInt(input1.getText());
        	if(tempgetal < 1 || tempgetal > 12) {
        		maandstring = "Ongeldige maand";
        	}
        	else switch(tempgetal)
        	{
	        	case 1: maandstring = "Maand 1 - Januari heeft 31 dagen."; break;
	        	case 2: maandstring = "Maand 2 - Februari heeft 28 dagen."; break;
	        	case 3: maandstring = "Maand 3 - Maart heeft 31 dagen."; break;
	        	case 4: maandstring = "Maand 4 - April heeft 30 dagen."; break;
	        	case 5: maandstring = "Maand 5 - Mei heeft 31 dagen."; break;
	        	case 6: maandstring = "Maand 6 - Juni heeft 30 dagen."; break;
	        	case 7: maandstring = "Maand 7 - Juli heeft 31 dagen."; break;
	        	case 8: maandstring = "Maand 8 - Augustus heeft 31 dagen."; break;
	        	case 9: maandstring = "Maand 9 - September heeft 30 dagen."; break;
	        	case 10: maandstring = "Maand 10 - Oktober heeft 31 dagen."; break;
	        	case 11: maandstring = "Maand 11 - November heeft 30 dagen."; break;
	        	case 12: maandstring = "Maand 12 - December heeft 31 dagen."; break;
        	}
            repaint();
        }
    }

}
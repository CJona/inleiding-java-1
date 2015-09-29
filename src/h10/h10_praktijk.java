package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class h10_praktijk extends Applet {
    TextField input1;
    Button Ok;
    String s;
	
    public void init() {
    	setSize(200, 120);
        input1 = new TextField("", 10);
        Ok = new Button("Ok");
        Ok.addActionListener( new OkListener() );
        add(input1);
        add(Ok);
    }

    public void paint(Graphics g) {
    	g.drawString("" + s, 20, 50);
    }
    
	
    class OkListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
        	int tempgetal = Integer.parseInt(input1.getText());
        	switch (tempgetal) {
        	case 1: s = "Een "+tempgetal+" is slecht."; break;
        	case 2: s = "Een "+tempgetal+" is slecht."; break;
        	case 3: s = "Een "+tempgetal+" is slecht."; break;
        	case 4: s = "Een "+tempgetal+" is een onvoldoende."; break;
        	case 5: s = "Een "+tempgetal+" is matig."; break;
        	case 6: s = "Een "+tempgetal+" is voldoende."; break;
        	case 7: s = "Een "+tempgetal+" is voldoende."; break;
        	case 8: s = "Een "+tempgetal+" is goed."; break;
        	case 9: s = "Een "+tempgetal+" is goed."; break;
        	case 10: s = "Een "+tempgetal+" is goed."; break;
        	default: s = "Verkeerd cijfer"; break;
        	}
            repaint();
        }
    }

}
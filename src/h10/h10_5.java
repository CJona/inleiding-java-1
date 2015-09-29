package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class h10_5 extends Applet {
    TextField input1;
    double huidigcijfer;
    double gemiddelde;
    int klikken;
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
    	g.drawString("Gemiddelde cijfer is: "+(gemiddelde/klikken), 20, 65);
    	if(gemiddelde/klikken >= 5.5) g.drawString("U bent geslaagd", 20, 80);
    	else g.drawString("U bent niet geslaagd", 20, 80);
    	
    }
    
	
    class OkListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
        	double tempgetal = Double.parseDouble(input1.getText());
        	if(tempgetal < 11 && tempgetal > 0) {
        		gemiddelde+=tempgetal;
            	klikken++;
            	if(tempgetal < 5.5) s = tempgetal+" is een onvoldoende.";
            	else s = tempgetal+" is een voldoende";
        	}
        	else s = "Vul een normaal getal in.";
        	
            repaint();
        }
    }

}
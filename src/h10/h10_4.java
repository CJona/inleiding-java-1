package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class h10_4 extends Applet {
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
        	if( (tempgetal % 4 == 0 && !(tempgetal % 100 == 0)) || tempgetal % 400 == 0 ) {
        		maandstring = tempgetal+" is wel een schrikkeljaar, Februari heeft 29 dagen in "+tempgetal;
        	}
        	else maandstring = tempgetal+" is geen schrikkeljaar";
            repaint();
        }
    }
    class TextListener implements ActionListener	{
    	public void actionPerformed( ActionEvent e ) {
        	int tempgetal = Integer.parseInt(input1.getText());
        	if( (tempgetal % 4 == 0 && !(tempgetal % 100 == 0)) || tempgetal % 400 == 0 ) {
        		maandstring = tempgetal+" is wel een schrikkeljaar, Februari heeft 29 dagen in "+tempgetal;
        	}
        	else maandstring = tempgetal+" is geen schrikkeljaar";
            repaint();
        }
    }

}
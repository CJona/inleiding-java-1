package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class h10_1 extends Applet {
    TextField input1;
    int grootste;
    int kleinste;
    Button Ok;
	
    public void init() {
    	setSize(200, 50);
        input1 = new TextField("", 10);
        input1.addActionListener(new TextListener());
        Ok = new Button("Ok");
        Ok.addActionListener( new OkListener() );
        add(input1);
        add(Ok);
    }

    public void paint(Graphics g) {
    	g.drawString("Getal " + grootste + " is groter dan " + kleinste, 20, 40);
    	
    }
    
	
    class OkListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
        	int tempgetal = Integer.parseInt(input1.getText());;
        	if(tempgetal > grootste) {
        		grootste = Integer.parseInt(input1.getText());
        	}
        	else kleinste = Integer.parseInt(input1.getText());
            repaint();
        }
    }
    class TextListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
        	int tempgetal = Integer.parseInt(input1.getText());;
        	if(tempgetal > grootste) {
        		grootste = Integer.parseInt(input1.getText());
        	}
        	else kleinste = Integer.parseInt(input1.getText());
            repaint();
        }
    }

}
package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class h10_2 extends Applet {
    TextField input1;
    int grootste;
    int kleinste;
    Button Ok;
	
    public void init() {
    	setSize(300, 50);
        input1 = new TextField("", 10);
        input1.addActionListener(new TextListener());
        Ok = new Button("Ok");
        Ok.addActionListener( new OkListener());
        add(input1);
        add(Ok); 
    }

    public void paint(Graphics g) {
    	g.drawString("Getal " + kleinste + " is kleiner/gelijk aan " + grootste, 10, 40);
    	
    }
    
	
    class OkListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
        	int tempgetal = Integer.parseInt(input1.getText());;
        	
        	if(tempgetal > kleinste){
        		grootste = tempgetal;
        	}
        	else {
        		kleinste = tempgetal;
        	}

            repaint();
        }
    }
    
    class TextListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
        	int tempgetal = Integer.parseInt(input1.getText());;
        	
        	if(tempgetal > kleinste){
        		grootste = tempgetal;
        	}
        	else {
        		kleinste = tempgetal;
        	}

            repaint();
        }
    }

}
package h08;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class h8_praktijk_2 extends Applet {

	int valerie;
	int jeroen;
	int hans;
	TextField valeriebalk;
    TextField jeroenbalk;	
    TextField hansbalk;
    Button oke;
    
	
	private static final long serialVersionUID = 1L;

	public void init() {
    setBackground(Color.white);
    setSize(500, 400);
    valerie = 60;
    jeroen = 40;
    hans = 80;
    valeriebalk = new TextField("Valerie", 10);
    jeroenbalk = new TextField("Jeroen", 10);
    hansbalk = new TextField("Hans", 10);
    oke = new Button("Verander grafiek");
    oke.addActionListener( new KnopListener() );
    add(valeriebalk);
    add(jeroenbalk);
    add(hansbalk);
    add(oke);
  }

  public void paint(Graphics g) {
	  g.drawLine(100, 100, 100, 180);
	  g.drawLine(100, 180, 250, 180);
	  
	  g.drawLine(80, 160, 120, 160);
	  g.drawLine(80, 140, 120, 140);
	  g.drawLine(80, 120, 120, 120);
	  g.drawLine(80, 100, 120, 100);
	  
	  g.setColor(Color.red);
	  g.fillRect(125, 180-valerie, 20, valerie);// grafiek balk valerie
	  g.fillRect(120, 190, 10, 10);
	  g.setColor(Color.magenta);
	  g.fillRect(145, 180-jeroen, 20, jeroen);// grafiek balk jeroen
	  g.fillRect(120, 205, 10, 10);
	  g.setColor(Color.blue);
	  g.fillRect(165, 180-hans, 20, hans);// grafiek balk hans
	  g.fillRect(120, 220, 10, 10); 
	  // hier onder volgende keer afmaken
	  g.setColor(Color.black);
	  g.drawString("100", 55, 102);
	  g.drawString("80", 60, 120);
	  g.drawString("60", 60, 140);
	  g.drawString("20", 60, 160);
	  
	  g.drawString("y in kg", 15, 90);
	  g.drawLine(20, 50, 20, 70);
	  g.drawLine(20, 50, 15, 60);
	  g.drawLine(20, 50, 25, 60);
	  
	  g.drawRect(125, 180-valerie, 20, valerie);// grafiek balk valerie
	  g.drawRect(145, 180-jeroen, 20, jeroen);// grafiek balk jeroen
	  g.drawRect(165, 180-hans, 20, hans);// grafiek balk hans
	  
	  g.drawRect(120, 190, 10, 10);
	  g.drawRect(120, 205, 10, 10);
	  g.drawRect(120, 220, 10, 10);
	  g.drawString("Valerie", 135, 200);
	  g.drawString("Jeroen", 135, 215);
	  g.drawString("Hans", 135, 230);
	  
  }
  
  class KnopListener implements ActionListener	{
      public void actionPerformed( ActionEvent e ) {
    	valerie = Integer.parseInt(valeriebalk.getText());
    	jeroen = Integer.parseInt(jeroenbalk.getText());
    	hans = Integer.parseInt(hansbalk.getText());
      	valeriebalk.setText("Valerie");
      	jeroenbalk.setText("Jeroen");
      	hansbalk.setText("Hans");
        repaint();
      }
  }
}

package h01;

import java.awt.*;
import java.applet.*;

public class Opdr4_4 extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    setBackground(Color.white);
  }

  public void paint(Graphics g) {
	  g.drawLine(100, 10, 100, 150);
	  g.drawLine(100, 150, 250, 150);
	  
	  g.drawLine(80, 10, 120, 10);
	  g.drawLine(80, 45, 120, 45);
	  g.drawLine(80, 80, 120, 80);
	  g.drawLine(80, 115, 120, 115);
	  
	  g.setColor(Color.red);
	  g.fillRect(125, 115, 20, 35);// grafiek balk valerie
	  g.fillRect(120, 160, 10, 10);
	  g.setColor(Color.magenta);
	  g.fillRect(145, 10, 20, 140);// grafiek balk jeroen
	  g.fillRect(120, 175, 10, 10);
	  g.setColor(Color.blue);
	  g.fillRect(165, 50, 20, 100);// grafiek balk hans
	  g.fillRect(120, 190, 10, 10); 
	  
	  g.setColor(Color.black);
	  g.drawString("100", 55, 15);
	  g.drawString("80", 60, 50);
	  g.drawString("60", 60, 85);
	  g.drawString("20", 60, 120);
	  g.drawString("y in kg", 5, 15);
	  g.drawLine(20, 20, 20, 40);
	  g.drawLine(20, 20, 15, 30);
	  g.drawLine(20, 20, 25, 30);
	  
	  g.drawRect(125, 115, 20, 35);// grafiek balk valerie
	  g.drawRect(145, 10, 20, 140);// grafiek balk jeroen
	  g.drawRect(165, 50, 20, 100);// grafiek balk hans
	  
	  g.drawRect(120, 160, 10, 10);
	  g.drawRect(120, 175, 10, 10);
	  g.drawRect(120, 190, 10, 10);
	  g.drawString("Valerie", 135, 170);
	  g.drawString("Jeroen", 135, 185);
	  g.drawString("Hans", 135, 200);
	  
  }
}

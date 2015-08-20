package h01;

import java.awt.*;
import java.applet.*;

public class Opdr4_3 extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    setBackground(Color.white);
  }

  public void paint(Graphics g) {
	  /*g.setColor(Color.black);
	  g.drawRect(30, 80, 50, 20);
	  g.drawRect(30, 100, 50, 20);
	  g.drawRect(30, 120, 50, 20);
	  g.setColor(Color.red);
	  g.fillRect(30, 80, 50, 20);
	  g.setColor(Color.white);
	  g.fillRect(30, 100, 50, 20);
	  g.setColor(Color.blue);
	  g.fillRect(30, 120, 50, 20);*/ // doe dit andersom (eerst kleuren dan rect)
	  g.setColor(Color.red);
	  g.fillRect(30, 80, 50, 20); // rood stuk
	  g.setColor(Color.white);
	  g.fillRect(30, 100, 50, 20); // wit stuk (niet zeker of dit nodig is)
	  g.setColor(Color.blue);
	  g.fillRect(30, 120, 50, 20); // blauw stuk
	  g.setColor(Color.black); // zwarte strepen om te scheiden
	  g.drawRect(30, 80, 50, 20);
	  g.drawRect(30, 100, 50, 20);
	  g.drawRect(30, 120, 50, 20);
	  g.drawRect(30, 140, 10, 20); // mast
	
    
  }
}

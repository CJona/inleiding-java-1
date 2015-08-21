package h01;
import java.awt.*;
import java.applet.*;

public class Opdr4_7 extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    setBackground(Color.white);
  }

  public void paint(Graphics g) {
	  g.setColor(Color.gray);
	  g.fillRect(20, 20, 30, 60);
	  g.fillRect(30, 80, 10, 100);
	  g.setColor(Color.red);
	  g.fillOval(25, 20, 20, 20);
	  g.setColor(Color.yellow);
	  g.fillOval(25, 40, 20, 20);
	  g.setColor(Color.green);
	  g.fillOval(25, 60, 20, 20);
	  
	  g.setColor(Color.black);
	  g.drawRect(30, 80, 10, 100);
	  g.drawRect(20, 20, 30, 60);
	  
	  g.drawOval(25, 20, 20, 20);
	  g.drawOval(25, 40, 20, 20);
	  g.drawOval(25, 60, 20, 20);
	  
	  
	  
  }
}

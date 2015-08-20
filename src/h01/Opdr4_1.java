package h01;
import java.awt.*;
import java.applet.*;

public class Opdr4_1 extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    setBackground(Color.white);
  }

  public void paint(Graphics g) {
    g.setColor(Color.blue);
    g.drawLine(30, 80, 55, 50);
    g.drawLine(55, 50, 80, 80);
    g.drawLine(30, 80, 80, 80);
  }
}

package h01;
import java.awt.*;
import java.applet.*;

public class Opdr4_5 extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    setBackground(Color.blue);
  }

  public void paint(Graphics g) {
	  g.setColor(Color.yellow);
	  g.fillArc(10, 10, 100, 100, 0, 80);
  }
}

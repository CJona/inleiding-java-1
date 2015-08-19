package h01;
import java.awt.*;
import java.applet.*;

public class Opdr2_2 extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    setBackground(Color.white);
  }

  public void paint(Graphics g) {
    g.setColor(Color.blue);
    g.drawString("Ferhat", 60, 60 );
    g.setColor(Color.red);
    g.drawString("Yildirim", 60, 80 );
  }
}

package h01;
import java.awt.*;
import java.applet.*;

public class Show extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    setBackground(Color.cyan);
  }

  public void paint(Graphics g) {
    g.setColor(Color.yellow);
    g.drawString("Ferhat Yildirim", 60, 60 );
  }
}

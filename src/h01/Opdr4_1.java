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
    //g.drawPolygon(new int[] {10, 20, 30}, new int[] {100, 20, 100}, 3);
    g.drawPolygon(new int[] {0, 20, 40}, new int[] {100, 65, 100}, 3);
  }
}

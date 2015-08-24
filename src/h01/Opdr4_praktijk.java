package h01;
import java.awt.*;
import java.applet.*;

public class Opdr4_praktijk extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    setBackground(Color.white);
  }

  public void paint(Graphics g) {
	  g.setColor(Color.magenta);
	  g.fillRect(120, 10, 100, 50);
	  g.fillOval(120, 90, 100, 50);
	  g.fillArc(250, 10, 100, 50, 0, 45);
	  
	  g.setColor(Color.black);
	  g.drawLine(10, 20, 100, 20);
	  g.drawString("Lijn", 40, 35);
	  g.drawRect(10, 50, 90, 50);
	  g.drawString("Rechthoek", 25, 115);
	  g.drawRoundRect(10, 120, 90, 50, 30, 30);
	  g.drawString("Afgeronde rechthoek", 0, 185);
	  g.drawOval(120, 10, 100, 50);
	  g.drawString("Gevulde rechthoek met ovaal", 105, 75);
	  g.drawString("Gevulde ovaal", 125, 155);
	  g.drawOval(240, 90, 50, 50);
	  g.drawString("Cirkel", 245, 160);
	  g.drawOval(250, 10, 100, 50);
	  g.drawString("Taartpunt met ovaal eromheen", 275, 75);
  }
}

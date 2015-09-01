package h05;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class H5_1 extends Applet{

	Color buitenkleur = Color.black;
	Color opvulkleur = Color.magenta;
	int lengte = 100;
	int breedte = 50;
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		

	}
	
	public void paint(Graphics g) {
		  g.setColor(opvulkleur);
		  g.fillRect(120, 10, lengte, breedte);
		  g.fillOval(120, 90, lengte, breedte);
		  g.fillArc(250, 10, lengte, breedte, 0, 45);
		  
		  g.setColor(buitenkleur);
		  g.drawLine(10, 20, 100, 20);
		  g.drawString("Lijn", 40, 35);
		  g.drawRect(10, 50, lengte, breedte);
		  g.drawString("Rechthoek", 25, 115);
		  g.drawRoundRect(10, 120, lengte, breedte, 30, 30);
		  g.drawString("Afgeronde rechthoek", 0, 185);
		  g.drawOval(120, 10, lengte, breedte);
		  g.drawString("Gevulde rechthoek met ovaal", 115, 75);
		  g.drawString("Gevulde ovaal", 125, 155);
		  g.drawOval(240, 90, breedte, breedte);
		  g.drawString("Cirkel", 245, 160);
		  g.drawOval(250, 10, lengte, breedte);
		  g.drawString("Taartpunt met ovaal eromheen", 275, 75);
		
	}

}

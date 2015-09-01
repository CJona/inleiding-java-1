package h06;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class H06_1 extends Applet{
		int max = 113;
		int per = max / 4;
		int over = max % 4;
		double per_final = per + over;
		
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		

	}

	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.drawString("113 delen door 4, ieder krijgt evenveel dan.", 10, 10);
		g.drawString("Er blijft een aantal over, €" + max % 4 , 10, 25);
		g.drawString("Jan krijgt: €" + per_final, 10, 40);
		g.drawString("Ali krijgt: €" + per_final, 10, 60);
		g.drawString("Jeanette krijgt: €" + per_final, 10, 80);
		g.drawString("Ik krijg: €" + per_final, 10, 100);
		
	}
	
}

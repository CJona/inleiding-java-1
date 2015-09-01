package h06;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class H06_3 extends Applet {
	
	int pos1 = 10;
	int pos2 = 10;
		
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
	}

	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.drawString("" + -pos1 + pos2, 20, 20);
		
		

		
	}
	
}

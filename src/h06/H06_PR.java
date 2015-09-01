package h06;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class H06_PR extends Applet {
	
		double cijfer1 = 5.9;
		double cijfer2 = 6.3;
		double cijfer3 = 6.9;
		double gemiddelde = (cijfer1 + cijfer2 + cijfer3) / 3;
		double gemiddeldegeheel = gemiddelde * 10;
		double gemiddeldegeheel2 = (int) gemiddeldegeheel;
		double gemiddeldegeheel3 = (double) gemiddeldegeheel2 / 10;
		
		
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
	}

	public void paint(Graphics g) {
		g.drawString( " uitkomst is " + gemiddeldegeheel3, 20, 20);
		
		

		
	}
	
}

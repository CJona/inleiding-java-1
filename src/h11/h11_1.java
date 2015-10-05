package h11;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class h11_1 extends Applet {
	
    public void init() {
    }

    public void paint(Graphics g) {
    
    	int x = 10;
    	int y = 20;
    	
   		for(int i = 0; i < 10; i++) {
   			x+= 15;
   			for(int i2 = 0; i2 < 10; i2++) {
   				g.drawString("|", x, y+i2*5);
   			}
   			
   		}
   	
    }

}
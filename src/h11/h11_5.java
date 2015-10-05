package h11;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class h11_5 extends Applet {
	
    public void init() {
    }
    
    
    public void paint(Graphics g) {
    	
    	int x = 20;
    	int y = 20;
    	for(int i = 0; i < 5; i++) {

			g.drawRect(x, y, 10, 10);
    		y += 10;
    		x += 10;
 
    	}

    }
    

}
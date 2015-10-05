package h11;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class h11_4 extends Applet {
	
    public void init() {
    }
    
    
    public void paint(Graphics g) {
    	g.drawString("Tafel van drie", 20, 10);
    	
    	int x = 20;
    	int y = 30;
    	for(int i = 1; i < 11; i++) {

			g.drawString(i+" * 3 = "+ (i*3) , x, y);
    		y += 20;
 
    	}

    }
    

}
package h11;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class h11_6 extends Applet {
	
    public void init() {
    }
    
    
    public void paint(Graphics g) {
    	
    		int xy = 10;
    		int grootte = 70;
    		
    		for (int i = 0; i < 5; i++) {
    			
    			g.drawOval(xy, xy, grootte, grootte);
    			
    			xy += 5;
    			grootte -= 10;
    			
    		}

    }
    

}

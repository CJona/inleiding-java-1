package h11;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class h11_7 extends Applet {
	
    public void init() {
    }
    
    
    public void paint(Graphics g) {
    	
    		int xy = 10;
    		int grootte = 500;
    		
    		for (int i = 0; i < 50; i++) {
    			
    			g.drawOval(xy, xy, grootte, grootte);
    			
    			xy += 5;
    			grootte -= 10;
    			
    		}

    }
    

}

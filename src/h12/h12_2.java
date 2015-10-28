package h12;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class h12_2 extends Applet {
	
	Button[] knoppen = new Button[25];
	
    public void init() {
    	for(int i = 0; i < knoppen.length; i++) {
    		knoppen[i] = new Button("Knop "+(i+1));
    		add(knoppen[i]);
    	}
    }

    public void paint(Graphics g) {
    	
    }

}
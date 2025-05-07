import java.applet.Applet;
import java.awt.*;

public class DrawingApplet extends Applet {
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval (50, 50, 100, 100);
		
		g.setColor(Color.BLUE);
		g.fillRect(200, 50, 100, 100);

		g.setColor(Color.GREEN);
		g.drawLine(400, 100, 500, 200);
	}
}
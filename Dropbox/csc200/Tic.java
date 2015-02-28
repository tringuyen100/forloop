import java.awt.Graphics;

import javax.swing.JApplet;


public class Tic extends JApplet{
	public void paint(Graphics canvas) {
		//canvas.drawLine(0, 0, 500, 500);
		//horizontal lines
		canvas.drawLine(25, 425, 300, 425);
		canvas.drawLine(25, 325, 300, 325);
		//verticle lines
		canvas.drawLine(100, 500, 100, 250);
		canvas.drawLine(200, 500, 200, 250);
		//x lines
		canvas.drawLine(200, 425, 100, 500);
		canvas.drawLine(100, 425, 200, 325);
		canvas.drawLine(100, 325, 200, 425);
		canvas.drawLine(100, 425, 200, 500);
		canvas.drawLine(100, 325, 200, 250);
		canvas.drawLine(100, 250, 200, 325);
		canvas.drawLine(200, 500, 300, 425);
		canvas.drawLine(200, 425, 300, 500);
		canvas.drawLine(200, 325, 300, 250);
		canvas.drawLine(200, 250, 300, 325);
		//o circle
		canvas.drawOval(25, 425, 75, 75);
		canvas.drawOval(25, 250, 75, 75);
		canvas.drawOval(25, 340, 75, 75);
		canvas.drawOval(220, 340, 75, 75);
		//verticle line
		canvas.drawLine(155, 500, 150, 250);
	}
}

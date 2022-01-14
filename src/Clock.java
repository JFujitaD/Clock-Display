import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.JPanel;

public class Clock extends JPanel implements Runnable{
	
	private static final Dimension SIZE = new Dimension(75, 75);
	private final Color BACKGROUND_COLOR = Color.LIGHT_GRAY;
	private final Color FACE_COLOR = Color.WHITE;
	private final int MARGIN = 2;
	private final int STROKE_WIDTH = 2;
	private final int HAND_WIDTH = 6;
	private final int ANIMATION_DELAY = 30;
	
	//Bad practice
	private int angle1Arg;
	private int angle2Arg;
	
	private int angle1;
	private int angle2;
	
	public Clock() {
		this(225, 225);
	}
	
	public Clock(int angle1, int angle2) {
		this.angle1 = angle1;
		this.angle2 = angle2;
		
		this.setPreferredSize(SIZE);
		this.setBackground(BACKGROUND_COLOR);
	}
	
	public void setAngles(int angle1, int angle2) {
	
		this.angle1Arg = angle1;
		this.angle2Arg = angle2;
		
		Thread t = new Thread(this);
		t.start();
	}
	
	public void resetAngles() {
		
		setAngles(225, 225);
	}

	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		drawFace(g2);
		drawHands(g2);
	}
	
	private void drawFace(Graphics2D g2) {
		
		g2.setStroke(new BasicStroke(STROKE_WIDTH));
		
		g2.setColor(FACE_COLOR);
		g2.fillOval(MARGIN, MARGIN, SIZE.width - MARGIN - 1, SIZE.height - MARGIN - 1);
		g2.setColor(Color.BLACK);
		g2.drawOval(MARGIN, MARGIN, SIZE.width - MARGIN - 1, SIZE.height - MARGIN - 1);
	}
	
	private void drawHands(Graphics2D g2) {
		
		Point center = new Point(SIZE.width / 2, SIZE.height / 2);
		
		double theta1 = angle1 * Math.PI / 180;
		double theta2 = angle2 * Math.PI / 180;
	
		
		Point hand1 = new Point((int) (center.x + Math.cos(theta1) * center.x), (int) (center.y + Math.sin(theta1) * -center.y));
		Point hand2 = new Point((int) (center.x + Math.cos(theta2) * center.x), (int) (center.y + Math.sin(theta2) * -center.y));
		
		g2.setStroke(new BasicStroke(HAND_WIDTH));
		g2.drawLine(center.x, center.y, hand1.x, hand1.y);
		g2.drawLine(center.x, center.y, hand2.x, hand2.y);
	}

	@Override
	public void run() {
		
		while(this.angle1 != angle1Arg || this.angle2 != angle2Arg) {
			
			if(this.angle1 < angle1Arg) {
				this.angle1++;
			}
			else if(this.angle1 > angle1Arg){
				this.angle1--;
			}
			if(this.angle2 < angle2Arg) {
				this.angle2++;
			}
			else if(this.angle2 > angle2Arg) {
				this.angle2--;
			}
			
			this.repaint();
			
			try {
				Thread.sleep(ANIMATION_DELAY);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

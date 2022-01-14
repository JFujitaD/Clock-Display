import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JFrame;

public class Wall extends JFrame implements Runnable{
	
	private HashMap<ClockValue, ClockGroup> clockGroupMap = new HashMap<>();
	
	public Wall() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Clock Display");
		this.setLayout(new GridLayout(2, 2));
		
		addClockGroups();
		
		this.pack();
		this.setResizable(false);
		this.setVisible(true);
		
		startThread();
	}
	
	private void addClockGroups() {
		
		LocalDateTime now = LocalDateTime.now();
		int hourTens = (int) Math.floor(now.getHour() / 10);
		int hourOnes = now.getHour() % 10;
		int minuteTens = (int) Math.floor(now.getMinute() / 10);
		int minuteOnes = now.getMinute() % 10;
		
		clockGroupMap.put(ClockValue.HOUR_TENS, new ClockGroup(ClockValue.HOUR_TENS, hourTens));
		clockGroupMap.put(ClockValue.HOUR_ONES, new ClockGroup(ClockValue.HOUR_ONES, hourOnes));
		clockGroupMap.put(ClockValue.MINUTE_TENS, new ClockGroup(ClockValue.MINUTE_TENS, minuteTens));
		clockGroupMap.put(ClockValue.MINUTE_ONES, new ClockGroup(ClockValue.MINUTE_ONES, minuteOnes));
		
		this.add(clockGroupMap.get(ClockValue.HOUR_TENS));
		this.add(clockGroupMap.get(ClockValue.HOUR_ONES));
		this.add(clockGroupMap.get(ClockValue.MINUTE_TENS));
		this.add(clockGroupMap.get(ClockValue.MINUTE_ONES));
	}

	private void startThread() {
		
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		
		while(true) {
			LocalDateTime now = LocalDateTime.now();
			int hourTens = (int) Math.floor(now.getHour() / 10);
			int hourOnes = now.getHour() % 10;
			int minuteTens = (int) Math.floor(now.getMinute() / 10);
			int minuteOnes = now.getMinute() % 10;
			
			ClockGroupManager.setValue(clockGroupMap.get(ClockValue.HOUR_TENS), hourTens);
			ClockGroupManager.setValue(clockGroupMap.get(ClockValue.HOUR_ONES), hourOnes);
			ClockGroupManager.setValue(clockGroupMap.get(ClockValue.MINUTE_TENS), minuteTens);
			ClockGroupManager.setValue(clockGroupMap.get(ClockValue.MINUTE_ONES), minuteOnes);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			ClockGroupManager.repaint();
		}
	}
	
	public static void main(String args[]) {
		
		new Wall();
	}
}

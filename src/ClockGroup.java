import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

public class ClockGroup extends JPanel{

	private ArrayList<Clock> clocks = new ArrayList<>();
	
	public ClockGroup(ClockValue type, int value) {
		
		this.setLayout(new GridLayout(6, 4));
		
		addClocks();
		//ClockGroupManager.setValue(this, value);
	}
	
	public ArrayList<Clock> getClocks(){
		return clocks;
	}
	
	private void addClocks() {
		
		for(int i = 0; i < 24; i++) {
			Clock clock = new Clock();
			clocks.add(clock);
			this.add(clock);
		}
	}
}

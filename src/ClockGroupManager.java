import java.util.ArrayList;

public class ClockGroupManager{
	
	private static ArrayList<Clock> clocks;
	
	public static void setValue(ClockGroup clockGroup, int value) {
		
		clocks = clockGroup.getClocks();
		
		switch(value) {
		case 0: setZero(clockGroup); break;
		case 1: setOne(clockGroup); break;
		case 2: setTwo(clockGroup); break;
		case 3: setThree(clockGroup); break;
		case 4: setFour(clockGroup); break;
		case 5: setFive(clockGroup); break;
		case 6: setSix(clockGroup); break;
		case 7: setSeven(clockGroup); break;
		case 8: setEight(clockGroup); break;
		case 9: setNine(clockGroup); break;
		default: System.err.println("Value needs to be 0-9"); break;
		}
	}
	
	public static void repaint() {
		
		for(Clock clock : clocks) {
			clock.repaint();
		}
	}
	
	private static void setZero(ClockGroup clockGroup) {
		
		clocks.get(0).setAngles(0, 270);
		clocks.get(1).setAngles(0, 180);
		clocks.get(2).setAngles(0, 180);
		clocks.get(3).setAngles(180, 270);
		
		clocks.get(4).setAngles(90, 270);
		clocks.get(5).setAngles(0, 270);
		clocks.get(6).setAngles(180, 270);
		clocks.get(7).setAngles(90, 270);
		
		clocks.get(8).setAngles(90, 270);
		clocks.get(9).setAngles(90, 270);
		clocks.get(10).setAngles(90, 270);
		clocks.get(11).setAngles(90, 270);
		
		clocks.get(12).setAngles(90, 270);
		clocks.get(13).setAngles(90, 270);
		clocks.get(14).setAngles(90, 270);
		clocks.get(15).setAngles(90, 270);
		
		clocks.get(16).setAngles(90, 270);
		clocks.get(17).setAngles(0, 90);
		clocks.get(18).setAngles(90, 180);
		clocks.get(19).setAngles(90, 270);
		
		clocks.get(20).setAngles(0, 90);
		clocks.get(21).setAngles(0, 180);
		clocks.get(22).setAngles(0, 180);
		clocks.get(23).setAngles(90, 180);
	}
	private static void setOne(ClockGroup clockGroup) {
		
		clocks.get(0).setAngles(0, 270);
		clocks.get(1).setAngles(0, 180);
		clocks.get(2).setAngles(180, 270);
		clocks.get(3).resetAngles();
		
		clocks.get(4).setAngles(0, 90);
		clocks.get(5).setAngles(180, 270);
		clocks.get(6).setAngles(90, 270);
		clocks.get(7).resetAngles();
		
		clocks.get(8).resetAngles();
		clocks.get(9).setAngles(90, 270);
		clocks.get(10).setAngles(90, 270);
		clocks.get(11).resetAngles();
		
		clocks.get(12).resetAngles();
		clocks.get(13).setAngles(90, 270);
		clocks.get(14).setAngles(90, 270);
		clocks.get(15).resetAngles();
		
		clocks.get(16).setAngles(0, 270);
		clocks.get(17).setAngles(90, 180);
		clocks.get(18).setAngles(0, 90);
		clocks.get(19).setAngles(180, 270);
		
		clocks.get(20).setAngles(0, 90);
		clocks.get(21).setAngles(0, 180);
		clocks.get(22).setAngles(0, 180);
		clocks.get(23).setAngles(90, 180);
	}
	private static void setTwo(ClockGroup clockGroup) {
		
		clocks.get(0).setAngles(0, 270);
		clocks.get(1).setAngles(0, 180);
		clocks.get(2).setAngles(0, 180);
		clocks.get(3).setAngles(180, 270);
		
		clocks.get(4).setAngles(0, 90);
		clocks.get(5).setAngles(0, 180);
		clocks.get(6).setAngles(180, 270);
		clocks.get(7).setAngles(90, 270);
		
		clocks.get(8).setAngles(0, 270);
		clocks.get(9).setAngles(0, 180);
		clocks.get(10).setAngles(90, 180);
		clocks.get(11).setAngles(90, 270);
		
		clocks.get(12).setAngles(90, 270);
		clocks.get(13).setAngles(0, 270);
		clocks.get(14).setAngles(0, 180);
		clocks.get(15).setAngles(90, 180);
		
		clocks.get(16).setAngles(90, 270);
		clocks.get(17).setAngles(0, 90);
		clocks.get(18).setAngles(0, 180);
		clocks.get(19).setAngles(180, 270);
		
		clocks.get(20).setAngles(0, 90);
		clocks.get(21).setAngles(0, 180);
		clocks.get(22).setAngles(0, 180);
		clocks.get(23).setAngles(90, 180);
	}
	private static void setThree(ClockGroup clockGroup) {
		
		clocks.get(0).setAngles(0, 270);
		clocks.get(1).setAngles(0, 180);
		clocks.get(2).setAngles(0, 180);
		clocks.get(3).setAngles(180, 270);
		
		clocks.get(4).setAngles(0, 90);
		clocks.get(5).setAngles(0, 180);
		clocks.get(6).setAngles(180, 270);
		clocks.get(7).setAngles(90, 270);
		
		clocks.get(8).setAngles(0, 270);
		clocks.get(9).setAngles(0, 180);
		clocks.get(10).setAngles(90, 180);
		clocks.get(11).setAngles(90, 270);
		
		clocks.get(12).setAngles(0, 90);
		clocks.get(13).setAngles(0, 180);
		clocks.get(14).setAngles(180, 270);
		clocks.get(15).setAngles(90, 270);
		
		clocks.get(16).setAngles(0, 270);
		clocks.get(17).setAngles(0, 180);
		clocks.get(18).setAngles(90, 180);
		clocks.get(19).setAngles(90, 270);
		
		clocks.get(20).setAngles(0, 90);
		clocks.get(21).setAngles(0, 180);
		clocks.get(22).setAngles(0, 180);
		clocks.get(23).setAngles(90, 180);
	}
	private static void setFour(ClockGroup clockGroup) {
		
		clocks.get(0).setAngles(0, 270);
		clocks.get(1).setAngles(180, 270);
		clocks.get(2).setAngles(0, 270);
		clocks.get(3).setAngles(180, 270);
		
		clocks.get(4).setAngles(90, 270);
		clocks.get(5).setAngles(90, 270);
		clocks.get(6).setAngles(90, 270);
		clocks.get(7).setAngles(90, 270);
		
		clocks.get(8).setAngles(90, 270);
		clocks.get(9).setAngles(0, 90);
		clocks.get(10).setAngles(90, 180);
		clocks.get(11).setAngles(90, 270);
		
		clocks.get(12).setAngles(0, 90);
		clocks.get(13).setAngles(0, 180);
		clocks.get(14).setAngles(180, 270);
		clocks.get(15).setAngles(90, 270);
		
		clocks.get(16).resetAngles();
		clocks.get(17).resetAngles();
		clocks.get(18).setAngles(90, 270);
		clocks.get(19).setAngles(90, 270);
		
		clocks.get(20).resetAngles();
		clocks.get(21).resetAngles();
		clocks.get(22).setAngles(0, 90);
		clocks.get(23).setAngles(90, 180);
	}
	private static void setFive(ClockGroup clockGroup) {
		
		clocks.get(0).setAngles(0, 270);
		clocks.get(1).setAngles(0, 180);
		clocks.get(2).setAngles(0, 180);
		clocks.get(3).setAngles(180, 270);
		
		clocks.get(4).setAngles(90, 270);
		clocks.get(5).setAngles(0, 270);
		clocks.get(6).setAngles(0, 180);
		clocks.get(7).setAngles(90, 180);
		
		clocks.get(8).setAngles(90, 270);
		clocks.get(9).setAngles(0, 90);
		clocks.get(10).setAngles(0, 180);
		clocks.get(11).setAngles(180, 270);
		
		clocks.get(12).setAngles(0, 90);
		clocks.get(13).setAngles(0, 180);
		clocks.get(14).setAngles(180, 270);
		clocks.get(15).setAngles(90, 270);
		
		clocks.get(16).setAngles(0, 270);
		clocks.get(17).setAngles(0, 180);
		clocks.get(18).setAngles(90, 180);
		clocks.get(19).setAngles(90, 270);
		
		clocks.get(20).setAngles(0, 90);
		clocks.get(21).setAngles(0, 180);
		clocks.get(22).setAngles(0, 180);
		clocks.get(23).setAngles(90, 180);	
	}
	private static void setSix(ClockGroup clockGroup) {
		
		clocks.get(0).setAngles(0, 270);
		clocks.get(1).setAngles(0, 180);
		clocks.get(2).setAngles(0, 180);
		clocks.get(3).setAngles(180, 270);
		
		clocks.get(4).setAngles(90, 270);
		clocks.get(5).setAngles(0, 270);
		clocks.get(6).setAngles(0, 180);
		clocks.get(7).setAngles(90, 180);
		
		clocks.get(8).setAngles(90, 270);
		clocks.get(9).setAngles(0, 90);
		clocks.get(10).setAngles(0, 180);
		clocks.get(11).setAngles(180, 270);
		
		clocks.get(12).setAngles(90, 270);
		clocks.get(13).setAngles(0, 270);
		clocks.get(14).setAngles(180, 270);
		clocks.get(15).setAngles(90, 270);
		
		clocks.get(16).setAngles(90, 270);
		clocks.get(17).setAngles(0, 90);
		clocks.get(18).setAngles(90, 180);
		clocks.get(19).setAngles(90, 270);
		
		clocks.get(20).setAngles(0, 90);
		clocks.get(21).setAngles(0, 180);
		clocks.get(22).setAngles(0, 180);
		clocks.get(23).setAngles(90, 180);
	}
	private static void setSeven(ClockGroup clockGroup) {
		
		clocks.get(0).setAngles(0, 270);
		clocks.get(1).setAngles(0, 180);
		clocks.get(2).setAngles(0, 180);
		clocks.get(3).setAngles(180, 270);
		
		clocks.get(4).setAngles(0, 90);
		clocks.get(5).setAngles(0, 180);
		clocks.get(6).setAngles(180, 270);
		clocks.get(7).setAngles(90, 270);
		
		clocks.get(8).resetAngles();
		clocks.get(9).resetAngles();
		clocks.get(10).setAngles(90, 270);
		clocks.get(11).setAngles(90, 270);
		
		clocks.get(12).resetAngles();
		clocks.get(13).resetAngles();
		clocks.get(14).setAngles(90, 270);
		clocks.get(15).setAngles(90, 270);
		
		clocks.get(16).resetAngles();
		clocks.get(17).resetAngles();
		clocks.get(18).setAngles(90, 270);
		clocks.get(19).setAngles(90, 270);
		
		clocks.get(20).resetAngles();
		clocks.get(21).resetAngles();
		clocks.get(22).setAngles(0, 90);
		clocks.get(23).setAngles(90, 180);
	}
	private static void setEight(ClockGroup clockGroup) {
		
		clocks.get(0).setAngles(0, 270);
		clocks.get(1).setAngles(0, 180);
		clocks.get(2).setAngles(0, 180);
		clocks.get(3).setAngles(180, 270);
		
		clocks.get(4).setAngles(90, 270);
		clocks.get(5).setAngles(0, 270);
		clocks.get(6).setAngles(180, 270);
		clocks.get(7).setAngles(90, 270);
		
		clocks.get(8).setAngles(90, 270);
		clocks.get(9).setAngles(0, 90);
		clocks.get(10).setAngles(90, 180);
		clocks.get(11).setAngles(90, 270);
		
		clocks.get(12).setAngles(90, 270);
		clocks.get(13).setAngles(0, 270);
		clocks.get(14).setAngles(180, 270);
		clocks.get(15).setAngles(90, 270);
		
		clocks.get(16).setAngles(90, 270);
		clocks.get(17).setAngles(0, 90);
		clocks.get(18).setAngles(90, 180);
		clocks.get(19).setAngles(90, 270);
		
		clocks.get(20).setAngles(0, 90);
		clocks.get(21).setAngles(0, 180);
		clocks.get(22).setAngles(0, 180);
		clocks.get(23).setAngles(90, 180);
	}
	private static void setNine(ClockGroup clockGroup) {
		
		clocks.get(0).setAngles(0, 270);
		clocks.get(1).setAngles(0, 180);
		clocks.get(2).setAngles(0, 180);
		clocks.get(3).setAngles(180, 270);
		
		clocks.get(4).setAngles(90, 270);
		clocks.get(5).setAngles(0, 270);
		clocks.get(6).setAngles(180, 270);
		clocks.get(7).setAngles(90, 270);
		
		clocks.get(8).setAngles(90, 270);
		clocks.get(9).setAngles(0, 90);
		clocks.get(10).setAngles(90, 180);
		clocks.get(11).setAngles(90, 270);
		
		clocks.get(12).setAngles(0, 90);
		clocks.get(13).setAngles(0, 180);
		clocks.get(14).setAngles(180, 270);
		clocks.get(15).setAngles(90, 270);
		
		clocks.get(16).resetAngles();
		clocks.get(17).resetAngles();
		clocks.get(18).setAngles(90, 270);
		clocks.get(19).setAngles(90, 270);
		
		clocks.get(20).resetAngles();
		clocks.get(21).resetAngles();
		clocks.get(22).setAngles(0, 90);
		clocks.get(23).setAngles(90, 180);
	}
}

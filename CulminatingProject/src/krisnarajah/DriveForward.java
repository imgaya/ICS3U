package krisnarajah;

import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class DriveForward implements Behavior{
	private boolean suppress = false;
	@Override
	public boolean takeControl() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		suppress = false;
		Motor.A.forward();
		Motor.B.forward();
		while(suppress = false){
			Thread.yield();
		}
		Motor.A.stop();
		Motor.B.stop();
	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub
		suppress = true;
	}

}

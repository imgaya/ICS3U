package krisnarajah;

import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;

public class ExitProgram implements Behavior{

	@Override
	public boolean takeControl() {
		// TODO Auto-generated method stub
		if (Button.ESCAPE.isDown())
			return true;
		return false;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub
		
	}

}

package krisnarajah;

import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class GayaCulminating {

	public static void main(String[] args) {
		Behavior b4= new BallIntoGoal();
		Behavior b3=new TouchSensorMethod();
		Behavior b2= new Sound();
		Behavior b1= new DriveForward();
		Behavior b0 = new ExitProgram();
		Behavior [] behaviours ={b1,b0};
		Arbitrator arby = new Arbitrator(behaviours);
	}

}

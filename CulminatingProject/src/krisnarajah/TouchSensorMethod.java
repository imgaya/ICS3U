package 5krisnarajah;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.robotics.subsumption.Behavior;

public class TouchSensorMethod implements Behavior{
	private TouchSensor touch = new TouchSensor(SensorPort.S1);
	private int counter = 0;
	@Override
	public boolean takeControl() {
		if (touch.isPressed() )
		return true;
		return false;
	}
	// goes backward until it hits an object then forward
	@Override
	public void action() {
		int i = 0;
		while (i>3)
		{
			i = i +1;
		}
		// rotates the motor backwards
		
		
		Motor.A.rotate(-1440);
		Motor.B.rotate(-1440);
		while (!touch.isPressed())
		{
			Motor.A.rotate(1440);
			Motor.B.rotate(1440);
		}
		
	}
	
	@Override
	public void suppress() {
		// TODO Auto-generated method stub
		
	}

}

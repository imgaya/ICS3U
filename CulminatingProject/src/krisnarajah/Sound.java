package krisnarajah;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.robotics.subsumption.Behavior;

public class Sound implements Behavior{
	private SoundSensor sound= new SoundSensor(SensorPort.S3,true);
	private LightSensor light = new LightSensor(SensorPort.S2,true);
	private boolean suppress = false;
	int laps ;
	@Override
	//reads light value and does 2 laps around the map      
	public boolean takeControl() {
		if (sound.readValue()>50){
			return true;
		}else if (light.readValue()>36){
		 return false;
		}
		return false;
	}
// motor stops after 2 laps
	@Override
	public void action() {
		LightSensor light = new LightSensor(SensorPort.S2);
	laps = light.getLightValue();
	if (light.readValue()>53){
	}
	Motor.A.stop();
	Motor.B.stop();
	
		
	}

	@Override
	public void suppress() {
		suppress = true;	
		
	}

}

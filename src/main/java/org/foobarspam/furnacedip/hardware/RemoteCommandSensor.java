package org.foobarspam.furnacedip.hardware;

import org.foobarspam.furnacedip.interfaces.Thermometer;
import org.foobarspam.furnacedip.types.RoomTemperature;

public class RemoteCommandSensor implements Thermometer {
	
	@Override
	public double read(RoomTemperature temperature){
		return temperature.getTemperature();
	}

}

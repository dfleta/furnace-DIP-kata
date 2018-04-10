package org.foobarspam.furnaceDIP.hardware;

import org.foobarspam.furnaceDIP.interfaces.Heater;
import org.foobarspam.furnaceDIP.types.RoomTemperature;

public class GasHeater implements Heater {
	
	public void engage(RoomTemperature temperature){
		temperature.incrementTemperature(1);
	}
	
	public void disengage(RoomTemperature temperature){
		temperature.incrementTemperature(-1);
	}
}

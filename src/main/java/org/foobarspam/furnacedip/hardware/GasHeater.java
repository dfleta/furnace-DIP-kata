package org.foobarspam.furnacedip.hardware;

import org.foobarspam.furnacedip.interfaces.Heater;
import org.foobarspam.furnacedip.types.RoomTemperature;

public class GasHeater implements Heater {
	
	public void engage(RoomTemperature temperature){
		temperature.incrementTemperature(1);
	}
	
	public void disengage(RoomTemperature temperature){
		temperature.incrementTemperature(-1);
	}
}

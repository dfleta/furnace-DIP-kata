package org.foobarspam.furnacedip.interfaces;

import org.foobarspam.furnacedip.types.RoomTemperature;

public interface Heater {
	
	public void engage(RoomTemperature temperature);
	public void disengage(RoomTemperature temperature);

}

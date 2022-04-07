package org.foobarspam.furnacedip.interfaces;

import org.foobarspam.furnacedip.types.RoomTemperature;

public interface Heater {
	
	void engage(RoomTemperature temperature);
	void disengage(RoomTemperature temperature);

}

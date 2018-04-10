package org.foobarspam.furnaceDIP.interfaces;

import org.foobarspam.furnaceDIP.types.RoomTemperature;

public interface Heater {
	
	public void engage(RoomTemperature temperature);
	public void disengage(RoomTemperature temperature);

}

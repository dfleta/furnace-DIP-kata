package org.foobarspam.furnaceDIP.otherstuff;

import org.foobarspam.furnaceDIP.hardware.GasHeater;
import org.foobarspam.furnaceDIP.interfaces.Heater;
import org.foobarspam.furnaceDIP.types.RoomTemperature;

public class Jedi implements Heater {
	
	public void engage(RoomTemperature temperature){
		 temperature.incrementTemperature(this.toucheLightSable());
	}
	public void disengage(RoomTemperature temperature){
		Heater heater = new GasHeater();
		this.forcePersuasion(heater, temperature);
	}
	
	private double toucheLightSable(){
		final double lightSableTemperature = 1400; // in ºC
		return lightSableTemperature;
	}
	
	private void forcePersuasion(Heater heater, RoomTemperature temperature){
		temperature.incrementTemperature(-1400);
		heater.disengage(temperature);
	}
	
	public void speak(){
    System.out.println("\n"
    		+ "\t  __.-._   \n"
    		+ "\t  '-._\"7' \n"
    		+ "\t   /'.-c   \n"
    		+ "\t   |  /T   \n"
    		+ "\t  _)_/LI   \n"
    		+ "\nDo or do not. There is no try ");
	}
}

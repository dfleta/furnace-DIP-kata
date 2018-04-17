package org.foobarspam.furnaceDIP.types;

public class RoomTemperature {
	
	private double temperature = 0;
	private static RoomTemperature instance = new RoomTemperature();
	
	private RoomTemperature() {
	}

	public static RoomTemperature getInstance() {
		return instance;
	}

	public double getTemperature() {
		return this.temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public void incrementTemperature(double increment) {
		this.temperature += increment;
	}

}

package org.foobarspam.furnacedip.types;

import java.util.Optional;

public class RoomTemperature {
	
	private double temperature = 0;
	private static Optional<RoomTemperature> instance = Optional.empty();
	
	private RoomTemperature() {
	}

	public static RoomTemperature getInstance() {
		if (instance.isEmpty()) {
			instance = Optional.of(new RoomTemperature());
		}
		return instance.get();
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

package org.foobarspam.furnacedip.interfaces;

import org.foobarspam.furnacedip.types.RoomTemperature;

public interface Regulator {

    void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, RoomTemperature temperature);

}
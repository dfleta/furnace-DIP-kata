package org.foobarspam.furnacedip.main;

import org.foobarspam.furnacedip.hardware.GasHeater;
import org.foobarspam.furnacedip.hardware.Regulator;
import org.foobarspam.furnacedip.hardware.RemoteCommandSensor;
import org.foobarspam.furnacedip.interfaces.Heater;
import org.foobarspam.furnacedip.interfaces.Thermometer;
import org.foobarspam.furnacedip.otherstuff.Jedi;
import org.foobarspam.furnacedip.types.RoomTemperature;

public class App 
{
    public static void main( String[] args )
    {
    	final double minTemp = 15.0;
        final double maxTemp = 21.0;
        
        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(17);
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();
        
        Regulator regulator = new Regulator();
        
        System.out.println( "Arrancando..." );
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);
        
        temperature = RoomTemperature.getInstance();
        Jedi yoda = new Jedi();
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate(thermometer, yoda, minTemp, maxTemp, temperature);
        yoda.speak();

        Heater luke = new Jedi();
        // luke.speak(); // ups, The method speak() is undefined for the type HeaterJava
    }
}

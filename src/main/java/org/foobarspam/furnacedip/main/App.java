package org.foobarspam.furnacedip.main;

import org.foobarspam.furnacedip.hardware.GasHeater;
import org.foobarspam.furnacedip.hardware.Controller;
import org.foobarspam.furnacedip.hardware.RemoteCommandSensor;
import org.foobarspam.furnacedip.interfaces.Heater;
import org.foobarspam.furnacedip.interfaces.Thermometer;
import org.foobarspam.furnacedip.otherstuff.Jedi;
import org.foobarspam.furnacedip.types.RoomTemperature;

public class App 
{
    public static void main( String[] args )
    {
    	final double MIN_TEMP = 15.0;
        final double MAX_TEMP = 21.0;
        
        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(17);
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();
        
        Controller regulator = new Controller();
        
        System.out.println( "Arrancando..." );
        regulator.regulate(thermometer, heater, MIN_TEMP, MAX_TEMP, temperature);
        
        temperature = RoomTemperature.getInstance();
        Jedi yoda = new Jedi("Yoda");
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate(thermometer, yoda, MIN_TEMP, MAX_TEMP, temperature);
        yoda.speak();

        Heater grogu = new Jedi("Grogu");
        ((Jedi)grogu).speak(); // ups, The method speak() is undefined for the type HeaterJava
    }
}

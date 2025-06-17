package com.temperature;

import com.temperature.beans.Building;
import com.temperature.beans.Commericial;
import com.temperature.beans.Sensor;
import com.temperature.beans.TemperatureSensor;

public class TemperatureDataApp {
    public static void main(String[] args) {
        Sensor tempSensor = new TemperatureSensor(25);  //   based on constructor , we send the temp value
        System.out.println(tempSensor.getReading());

      Commericial.Parking parking = new Commericial.Parking();


    }
}

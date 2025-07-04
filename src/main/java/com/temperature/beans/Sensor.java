package com.temperature.beans;
// Abstraction
public interface Sensor {
   public float getReading();
   public float getReading(String unit);

    float getReading(ReadingUnit unit);
}

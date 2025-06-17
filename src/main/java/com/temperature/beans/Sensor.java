package com.temperature.beans;

public interface Sensor {
   public float getReading();
   public float getReading(String unit);

    float getReading(ReadingUnit unit);
}

package com.temperature.beans;

import org.myjava.practice.exception.TemperatureDataException;

public class TemperatureSensor implements Sensor{
    private float temp;
    public TemperatureSensor(float aTemp) throws TemperatureDataException {
       if(aTemp < -89 || aTemp > 58){
           throw new TemperatureDataException("out of range Exception");
       }
    }
    public float getReading(){
        System.out.println(temp);
        return 0;
    }

    @Override
    public float getReading(String unit) {
        return 0;
    }

    @Override
    public float getReading(ReadingUnit unit) {
        if(ReadingUnit.C.equals(unit)){
            System.out.println(temp + " " +unit);
            return temp ;
        }
        if(ReadingUnit.F.equals(unit)){
            System.out.println((temp * 9/5) + 32 +" " +unit);
            return (temp * 9/5) + 32 ;
        }

        return 0;
    }
    @Override
    public String toString(){
        return "temperature " + temp;
    }
    @Override
    public int hashCode(){
        return (int) temp*32;
    }
    @Override
    public boolean equals(Object temperatureSensor){
        TemperatureSensor myObj = (TemperatureSensor) temperatureSensor;
        if(super.equals(myObj)){
            return true;
        }
        else {
            return this.temp == myObj.temp;
        }
    }

    public static void main(String[] args) {
        TemperatureSensor temperatureSensor1 = null;
        try {
            temperatureSensor1 = new TemperatureSensor(32);
        } catch (TemperatureDataException e) {
            throw new RuntimeException(e);
        }
        temperatureSensor1.getReading();
        temperatureSensor1.getReading(ReadingUnit.C);
        temperatureSensor1.getReading(ReadingUnit.F);

        TemperatureSensor temperatureSensor= null;
        try {
            temperatureSensor = new TemperatureSensor(32);
        } catch (TemperatureDataException e) {
            throw new RuntimeException(e);
        }
        System.out.println(temperatureSensor.toString());
        System.out.println(temperatureSensor.hashCode());
        System.out.println(temperatureSensor.getClass());
        System.out.println(temperatureSensor == temperatureSensor1);   // it is always false because object referenece number is different

        System.out.println(temperatureSensor);
        System.out.println(temperatureSensor1);

        System.out.println(temperatureSensor1.toString());
        System.out.println(temperatureSensor1.hashCode());
        System.out.println(temperatureSensor1.getClass());
        System.out.println(temperatureSensor.equals(temperatureSensor1));
    }

}

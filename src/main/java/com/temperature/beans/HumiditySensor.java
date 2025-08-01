//package com.temperature.beans;
//
//public class HumiditySensor implements Sensor{
//    private float humidity;
//    public void setHumidity(float aHumidity){
//        humidity = aHumidity;
//    }
//    public float getHumidity(){
//        return humidity;
//    }
//    public float getReading(){
//        System.out.println(humidity);
//        return humidity;
//    }
//
//    @Override
//    public float getReading(String unit) {
//        return 0;
//    }
//
//    @Override
//    public float getReading(ReadingUnit unit) {
//        if(ReadingUnit.G.equals(unit)){
//            System.out.println(humidity * 1000 + " "+ unit);
//            return humidity;
//        }
//        if (ReadingUnit.KG.equals(unit)){
//            System.out.println(humidity + " " + unit);
//        }
//    return 0.0f;
//    }
//
//    public static void main(String[] args) {
//        HumiditySensor sensor = new HumiditySensor();
//        sensor.setHumidity(32);
//        sensor.getReading();
//        sensor.getReading(ReadingUnit.G);
//        sensor.getReading(ReadingUnit.KG);
//    }
//
//
//}

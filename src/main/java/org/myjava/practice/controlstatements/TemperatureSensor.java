package org.myjava.practice.controlstatements;

import java.util.Scanner;

public class TemperatureSensor {
    public void check(float number){
       if (number < 18 || number > 28 ){
           System.out.println("out of temp : "+  number);
       }
       if (number >= 18 && number <= 20){
           System.out.println("coolest");
       }
       if (number >= 20 && number <= 24){
           System.out.println("cooler");
       }
       if (number >= 24 && number <= 28){
           System.out.println("cool");
       }

    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       float f1 = scanner.nextFloat();
       float f2 = scanner.nextFloat();
       float f3 = scanner.nextFloat();
       float f4 = scanner.nextFloat();
       float f5 = scanner.nextFloat();
       TemperatureSensor temperatureSensor = new TemperatureSensor();
       temperatureSensor.check(f1);
       temperatureSensor.check(f2);
       temperatureSensor.check(f3);
       temperatureSensor.check(f4);
       temperatureSensor.check(f5);
   }

}

package org.myjava.practice.controlstatements;

import java.util.Scanner;

public class TemperatureNextLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 //       int n = scanner.nextInt();
  //     String[] temp = new String[n];
//        for (int i = 0; i < n; i++) {
//       temp[i] = scanner.nextLine();
//    }
        TemperatureSensor temperatureSensor = new TemperatureSensor();
//        for(int j=0;j<n;j++){
//           temperatureSensor.check(Float.parseFloat(temp[j]));
//        }
        String temp1 = scanner.nextLine();
        String temp2 = scanner.nextLine();
        temperatureSensor.check(Float.parseFloat(temp1));
        temperatureSensor.check(Float.parseFloat(temp2));
}
}

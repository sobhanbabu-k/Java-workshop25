package org.myjava.practice.arrays;

import java.util.Scanner;

public class Sensor2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        String[] sensor = new String[s];
        String[] temp = new String[s];
        Float[][] sensortemp = new Float[s][s];
        System.out.println("Enter the temp");
        for(int i = 0 ; i < s ; i++) {
            for (int j = 0; j < s; j++) {
                sensortemp[i][j] = scanner.nextFloat();
            }
        }
            System.out.println("Elements of temp :");
            for(int k = 0; k < s ; k++){
                System.out.println("Sensor "+ k);
                for(int l = 0; l < s ; l++){
                    if(sensortemp[l][k]>18 && sensortemp[l][k]<28) {     // out of range condition
                        System.out.println("Temp " + sensortemp[l][k]);
                    }
                    else {
                        System.out.println("out of range "+sensortemp[l][k]);
                    }
                }
                System.out.println();
            }

        }



    }


package org.myjava.practice.arrays;

import java.util.Scanner;

public class SIngleDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the Number of sensor1");
        int n = scanner.nextInt();
        Float[] temp = new Float[n];
        for(int i = 0;i<n;i++){
            temp[i] = scanner.nextFloat();
        }
        System.out.println("temperature");
        for(int j = 0 ;j<n;j++){
            if(temp[j]%2 == 0) {   // Even numbers
                System.out.println(temp[j]);
            }
        }
    }
}

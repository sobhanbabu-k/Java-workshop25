package org.myjava.practice.arrays;

import java.util.Scanner;

public class InputArray {
    public void print(){
       Scanner scanner = new Scanner(System.in);
       int number = scanner.nextInt();
       String[] buildingNames = new String[number];
       for(int a = 0 ; a < buildingNames.length ; a++){
           buildingNames[a] = scanner.next();
       }
       for (int b = 0 ; b < buildingNames.length ; b++){
           System.out.println(buildingNames[b]);
       }

    }
    public static void main(String[] args) {
     InputArray inputArray = new InputArray();
     inputArray.print();

    }
}

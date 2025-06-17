package org.myjava.practice.controlstatements;

public class FloorIdentifier {
    public void floorIdentifier(int number){
        if(number%2 == 0){
            System.out.println("Even Floor Number");
        }
        else {
            System.out.println("Odd Floor Number");
        }
    }

    public static void main(String[] args) {
        FloorIdentifier floorno = new FloorIdentifier();
        floorno.floorIdentifier(4);
    }
}

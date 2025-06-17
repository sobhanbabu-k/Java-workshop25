package org.myjava.practice.controlstatements;

public class FloorPrinterWhile {
    public void print(int buildingNo, int noOfFloors){
        int i = 1;
        System.out.println("Building No : "+buildingNo);
        while(i <= noOfFloors){
            System.out.println("Floor No " + i);
            i++;
        }
    }

    public static void main(String[] args) {
        FloorPrinterWhile floorPrinterWhile = new FloorPrinterWhile();
        floorPrinterWhile.print(1,10);
        floorPrinterWhile.print(2,20);
        floorPrinterWhile.print(3,30);
    }
}

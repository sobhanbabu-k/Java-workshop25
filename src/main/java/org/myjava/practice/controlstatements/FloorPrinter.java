package org.myjava.practice.controlstatements;

public class FloorPrinter {
    public void Building(int buildingNo, int noOfFloors) {
        System.out.println("BuildingNo :__"+buildingNo);
        for (int i = 1; i < noOfFloors; i++) {
            System.out.println("Floor No : " + i);
        }
    }


    public static void main(String[] args) {
        FloorPrinter floorPrinter = new FloorPrinter();
        floorPrinter.Building(1,11);
        floorPrinter.Building(2,22);
        floorPrinter.Building(3,33);

    }
}


package com.temperature.beans;

public sealed abstract class Building permits Residential, Commericial {
    private Floor[] floors;
    private String buildingName;
    private String shape;
    private String color;
    private int buildingNo;
    private int noOfFloors;
    private float buildingHeight;
    private float squareFeets;
    private boolean parkingAvaiable;

    public Building() {

    }

    public abstract void getEBill();

    public Building(String name,float height, float squareFeet){
        this.buildingName = name;
        this.buildingHeight = height;
        this.squareFeets = squareFeet;


    }

    public static class Parking {
        public static void print() {
            System.out.println(" parking place .....");
        }
    }

}

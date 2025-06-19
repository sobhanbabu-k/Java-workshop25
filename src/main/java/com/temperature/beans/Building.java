package com.temperature.beans;

import org.myjava.practice.exception.FloorHeightOfRangeException;

import java.util.List;
import java.util.Set;

public sealed abstract class Building permits Residential, Commericial {
    private Set<Floor> floors;
    private String buildingName;
    private String shape;
    private String color;
    private int buildingNo;
    private int noOfFloors;
    private float buildingHeight;
    private float squareFeets;


    public Set<Floor> getFloors() {
        return floors;
    }

    public void setFloors(Set<Floor> floors) {
        this.floors = floors;
    }

    public String getBuildingName(String buildName) {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getShape(String shape) {
        return this.shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColor(String color) {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBuildingNo(int buildingNo) {
        return this.buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    public int getNoOfFloors(int noOfFloor) {
        return noOfFloors;
    }

    public void setNoOfFloors(int noOfFloors) throws FloorHeightOfRangeException{
        if(noOfFloors > 100){
            throw new FloorHeightOfRangeException("Floors Out of Range as per the Government Conditions");
        }
        this.noOfFloors = noOfFloors;
    }

    public float getBuildingHeight(float buildingHeight) {
        return this.buildingHeight;
    }

    public void setBuildingHeight(float buildingHeight) {
        this.buildingHeight = buildingHeight;
    }

    public float getSquareFeets(float squareFeet) {
        return squareFeets;
    }

    public void setSquareFeets(float squareFeets) {
        this.squareFeets = squareFeets;
    }

    public boolean isParkingAvaiable() {
        return parkingAvaiable;
    }

    public void setParkingAvaiable(boolean parkingAvaiable) {
        this.parkingAvaiable = parkingAvaiable;
    }

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

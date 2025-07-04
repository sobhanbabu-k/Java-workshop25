package com.temperature.beans;

import java.util.List;

public class Zone {
    private List<TemperatureSensor> temperatureSensors;
    private int zoneNo;
    private int noOfRooms;
    private String zoneName;
    private int noOfSensors;
    private String zoneType;

    public List<TemperatureSensor> getTemperatureSensors() {
        return temperatureSensors;
    }

    public void setTemperatureSensors(List<TemperatureSensor> temperatureSensors) {
        this.temperatureSensors = temperatureSensors;
    }

    public int getZoneNo() {
        return zoneNo;
    }

    public void setZoneNo(int zoneNo) {
        this.zoneNo = zoneNo;
    }

    public int getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public int getNoOfSensors() {
        return noOfSensors;
    }

    public void setNoOfSensors(int noOfSensors) {
        this.noOfSensors = noOfSensors;
    }

    public String getZoneType() {
        return zoneType;
    }

    public void setZoneType(String zoneType) {
        this.zoneType = zoneType;
    }

}

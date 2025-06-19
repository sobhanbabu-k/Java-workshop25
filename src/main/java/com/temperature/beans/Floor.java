package com.temperature.beans;

import java.util.List;

public class Floor {
    private List<Zone> zones;
    private int floorNo;
    private String floorName;
    private int noOfZones;

    public List<Zone> getZones() {
        return zones;
    }

    public void setZones(List<Zone> zones) {
        this.zones = zones;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public int getNoOfZones() {
        return noOfZones;
    }

    public void setNoOfZones(int noOfZones) {
        this.noOfZones = noOfZones;
    }
}

package com.temperature.beans;

import java.util.Set;

public class Floor {
    private Set<Zone> zones;
    private int floorNo;
    private String floorName;
    private int noOfZones;

    public Set<Zone> getZones() {
        return zones;
    }

    public void setZones(Set<Zone> zones) {
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

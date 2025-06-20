package com.temperature.beans;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Location implements Serializable {
    private Set<Building> buildings;
    private String doorNo;
    private String city;
    private String street;
    private String area;
    private String district;
    private String state;
    private String pincode;
    private String country;
    private String latitute;
    private String longtitute;
    private Integer noOfBuildings;

    public Set<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(Set<Building> buildings) {
        this.buildings = buildings;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLatitute() {
        return latitute;
    }

    public void setLatitute(String latitute) {
        this.latitute = latitute;
    }

    public String getLongtitute() {
        return longtitute;
    }

    public void setLongtitute(String longtitute) {
        this.longtitute = longtitute;
    }

    public Integer getNoOfBuildings() {
        return noOfBuildings;
    }

    public void setNoOfBuildings(Integer noOfBuildings) {
        this.noOfBuildings = noOfBuildings;
    }
    public String toString(){
        return this.country +
                this.state +
                this.district+
                this.street;
    }
}

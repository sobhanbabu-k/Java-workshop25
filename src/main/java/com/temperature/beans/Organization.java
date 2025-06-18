package com.temperature.beans;

import java.io.Serializable;
import java.util.Date;

public class Organization implements Serializable {
    private Location[] locations;
    private String name;
    private String type;
    private String certificateId;
    private Date dateofIdentification;
    private String email;
    private String contactNumber;
    private String ceo;

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public Date getDateofIdentification() {
        return dateofIdentification;
    }

    public void setDateofIdentification(Date dateofIdentification) {
        this.dateofIdentification = dateofIdentification;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }
    public String toString(){
        return this.ceo + " is a ceo of "+ this.name +  "  " +
                this.email+ "  " +
                this.contactNumber;
    }

}

package com.temperature.beans;

public final class Residential extends Building {
    private String type;                     // instances variables

    public Residential(String name, float height, float squareFeet,String aType) {
        super(name, height, squareFeet);
        this.type = aType;
    }

    public Residential() {
        super();
    }

    @Override
    public void getEBill() {
        System.out.println("CurrentBill For Residential");
    }
    public void setType(String aType){
        type = aType;
    }
    public String getType(){

        return type;
    }
    public static void parking(){
        System.out.println("Residential Parking...........");
    }



}

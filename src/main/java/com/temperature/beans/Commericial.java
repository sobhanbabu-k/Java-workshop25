package com.temperature.beans;

public final class Commericial extends Building{
    private String time;

//    public Commericial(String name, float height, float squareFeet, String aTime) {
//        super(name, height, squareFeet);
//        this.time = aTime;
//    }

    @Override
    public void getEBill() {
        System.out.println("CurrentBill for Commericial");
    }

    public static void print(){
        System.out.println("Commercial Parking..........");
    }
}

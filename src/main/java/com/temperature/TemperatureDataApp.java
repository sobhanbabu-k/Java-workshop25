package com.temperature;

import com.temperature.beans.*;

import java.io.*;

public class TemperatureDataApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Sensor tempSensor = new TemperatureSensor(25);  //   based on constructor , we send the temp value
//        System.out.println(tempSensor.getReading());
//
//      Commericial.Parking parking = new Commericial.Parking();

        Organization organization=new Organization();
        organization.setName("OurKadaiTech");
        organization.setCeo("Sathish sir");
        organization.setEmail("ourkadaitech.com");
        organization.setContactNumber("1234567899");

        FileOutputStream fileOutputStream = new FileOutputStream("ourkadaitech.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(organization);
        objectOutputStream.close();
        fileOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("ourkadaitech.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Organization myOrg = (Organization) objectInputStream.readObject();
        System.out.println(myOrg);

        Location location = new Location();
        location.setCountry("india");
        location.setState("TN");
        location.setDistrict("Coimbatore");
        location.setStreet("Isha");

        fileOutputStream = new FileOutputStream("coimbatore.txt");
        objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(location);
        objectOutputStream.close();
        objectOutputStream.close();
//        FileInputStream fileInputStream1 = new FileInputStream("location.txt");
//        ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream1);
//        Location location1 =(Location) objectInputStream1.readObject();
//        System.out.println(location1);

        Location location1=new Location();
        location1.setCountry("india");
        location1.setState("TN");
        location1.setDistrict("Chennai");
        location1.setStreet("Tambaram");

        fileOutputStream = new FileOutputStream("chennai.txt");
        objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(location1);
        objectOutputStream.close();
        objectOutputStream.close();
//        FileInputStream fileInputStream2 = new FileInputStream("location.txt");
//        ObjectInputStream objectInputStream2 = new ObjectInputStream(fileInputStream2);
//        Location location =(Location) objectInputStream1.readObject();
//        System.out.println(location1);


       //Commericial commericial=new Commericial();

    }
}

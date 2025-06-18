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
        ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(organization);
        outputStream.close();
        fileOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("ourkadaitech.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Organization myOrg = (Organization) objectInputStream.readObject();
        System.out.println(myOrg);

        Location location = new Location();
        location.setCountry("india");
        location.setState("TN");
        location.setDistrict("Madurai");
        location.setStreet("UthaKadai");

        FileOutputStream outputStream1 = new FileOutputStream("location.txt");
        ObjectOutputStream outputStream2 = new ObjectOutputStream(outputStream1);
        outputStream2.writeObject(location);
        outputStream2.close();
        outputStream1.close();
        FileInputStream fileInputStream1 = new FileInputStream("location.txt");
        ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream1);
        Location location1 =(Location) objectInputStream1.readObject();
        System.out.println(location1);


    }
}

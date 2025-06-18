package com.myjava.string.temperaturetest;

import com.temperature.TemperatureDataApp;
import com.temperature.beans.Location;
import com.temperature.beans.TemperatureData;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TemperatureTest {
    @Test
    public void testLocation() throws IOException, ClassNotFoundException {
//        Location location = new Location();
//        location.setCountry("india");
//        location.setState("TN");
//        location.setDistrict("Tambaram");
//        location.setPincode("234444");
//        location.setCity("Chennai");
//
//        TemperatureDataApp temperatureDataApp = new TemperatureDataApp();
//        temperatureDataApp.writeLocations("chennai.txt",location);
//        File myFile = new File("chennai.txt");
//        Assertions.assertTrue(myFile.exists());
//
//        FileInputStream fileInputStream = new FileInputStream("chennai.txt");
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//        Location location1 = (Location) objectInputStream.readObject();
//        Assertions.assertEquals("india",location1.getCountry());


        Location location2 = new Location();
        location2.setNoOfBuildings(3);
        location2.setDistrict("Tirunelveli");
        location2.setArea("Sobhan");

               TemperatureDataApp temperatureDataApp = new TemperatureDataApp();

        temperatureDataApp.writeLocations("cbe.txt",location2);
        File myFile1 = new File("cbe.txt");
        System.out.println(myFile1.getName());
        Assertions.assertTrue(myFile1.exists());

        FileInputStream fileInputStream = new FileInputStream("cbe.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Location location3 = (Location) objectInputStream.readObject();
        System.out.println(location3.getCity());
        Assertions.assertEquals(location2.getDistrict(),location3.getDistrict());
    //    Assertions.assertEquals(location2.getArea(),location3.getArea());



    }

}

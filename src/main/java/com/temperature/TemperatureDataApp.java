package com.temperature;

import com.temperature.beans.*;
import org.myjava.practice.exception.FloorHeightOfRangeException;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TemperatureDataApp {

    public static void main(String[] args) throws FloorHeightOfRangeException {

        Organization ourKadai = new Organization();
        ourKadai.setName("OurkadaiTech");
        ourKadai.setCeo("Sathish sir");
        ourKadai.setEmail("ourkadaitech.com");
        ourKadai.setContactNumber("1234567889");


        Location chennai = createLocation("4-34","Chennai","Tambaram","CableBridge","Chennai","TamilNadu","India","123456",2);
        Location coimbatore = createLocation("4-33","AmmaCIty","AmmaStret","AmmaArea","Coimbatore","TamilNadu","India","234455",2);
        List<Location> noOfLocObjects = new ArrayList<>();
        noOfLocObjects.add(chennai);
        noOfLocObjects.add(coimbatore);
        Organization organization = new Organization();
        organization.setLocations(noOfLocObjects);

        Commericial navigator=createBuilding("NavigatorTech","Rectangle","Blue",10,13,70.12f,345.34f);
        Commericial creator = createBuilding("CreatorTech","Square","Orange",20,7,80.56f,345.45f);
        Commericial inventor = createBuilding("InventorTech","Circle","White",30,10,90.01f,323.33f);
        Commericial innovator = createBuilding("InnovatorTech","SqaureRound","Brown",40,9,70.34f,343.44f);
        List<Building> chennaiBuildings = new ArrayList<>();
        chennaiBuildings.add(navigator);
        chennaiBuildings.add(creator);
        List<Building> coimbatoreBuildings = new ArrayList<>();
        coimbatoreBuildings.add(inventor);
        coimbatoreBuildings.add(innovator);
        chennai.setBuildings(chennaiBuildings);
        coimbatore.setBuildings(coimbatoreBuildings);

        Floor navigatorFloor = createFloors(0,"DownF",2);
        Floor navigatorfloor1= createFloors(1,"UG1",2);
        Set<Floor> floors = Set.of(navigatorFloor,navigatorfloor1);
        navigator.setFloors(floors);

        Floor creatorFloor = createFloors(1,"FirstFloor",2);
        Floor creatorFloor1 = createFloors(2,"SecondFloor",2);

        Set<Floor> creators = Set.of(creatorFloor,creatorFloor1);
        creator.setFloors(creators);



    }
    public static Location createLocation(String doorNo,String city,String street,String area,String district,String state,String country,String pincode,Integer noOfBuildings){
        Location location=new Location();
        location.setDoorNo(doorNo);
        location.setCity(city);
        location.setStreet(street);
        location.setArea(area);
        location.setDistrict(district);
        location.setState(state);
        location.setCountry(country);
        location.setPincode(pincode);
        location.setNoOfBuildings(noOfBuildings);
        return location;
    }

    public static Commericial createBuilding(String buildName,String shape,String color,int buildingNo,int noOfFloor,float buildingHeight,float squareFeet) throws FloorHeightOfRangeException {
        Commericial commericial=new Commericial();
        commericial.setBuildingName(buildName);
        commericial.setShape(shape);
        commericial.setColor(color);
        commericial.setBuildingNo(buildingNo);
        commericial.setNoOfFloors(noOfFloor);
        commericial.setBuildingHeight(buildingHeight);
        commericial.setSquareFeets(squareFeet);
        return commericial ;
    }

    public static Floor createFloors(int floorNo, String floorName, int noOfZones){
        Floor floor=new Floor();
        floor.setFloorNo(floorNo);
        floor.setFloorName(floorName);
        floor.setNoOfZones(noOfZones);
        return floor;
    }




//         Residential residential= new Residential();
//        try {
//            residential.setNoOfFloors(120);
//        } catch (FloorHeightOfRangeException e) {
//            throw new RuntimeException(e);
//        }


        //  this is temperature sensor exception
//        TemperatureSensor temperatureSensor = null;
//        try {
//            temperatureSensor = new TemperatureSensor(40);
//        } catch (TemperatureDataException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            temperatureSensor = new TemperatureSensor(80);
//        } catch (TemperatureDataException e) {
//            throw new RuntimeException(e);
//        }
//        Organization ourKadai = new Organization();
//        ourKadai.setName("OurkadaiTech");
//        ourKadai.setCeo("Sathish sir");
//        ourKadai.setEmail("ourkadaitech.com");
//        ourKadai.setContactNumber("1234567889");
//
//        FileOutputStream fileOutputStream =null;
//        ObjectOutputStream objectOutputStream =null;
//        FileInputStream fileInputStream=null;
//        ObjectInputStream objectInputStream=null;
//
//        try {
//            fileOutputStream = new FileOutputStream("ourkadaitechnology.txt");
//            objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(ourKadai);
//            objectOutputStream.close();
//            fileOutputStream.close();
//            fileInputStream = new FileInputStream("ourkadaitechnology.txt");
//            objectInputStream = new ObjectInputStream(fileInputStream);
//            Organization organization = (Organization) objectInputStream.readObject();
//            System.out.println(organization);
//        }
//         catch (FileNotFoundException e) {
//           throw new RuntimeException(e);
//        }
//        catch (ClassNotFoundException e){
//            throw new RuntimeException(e);
//        }
//        catch (IOException e){
//            throw new RuntimeException();
//        }
//        finally {
//            try {
//                if(fileOutputStream != null){
//                    fileOutputStream.close();
//                }
//                if(objectOutputStream != null){
//                    objectOutputStream.close();
//                }
//                if(fileInputStream != null){
//                    fileInputStream.close();
//                }
//                if(objectInputStream != null){
//                    objectOutputStream.close();
//                }
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }



//    public void writeLocations(String fileName,Location location) throws IOException, ClassNotFoundException {
//
//        location = new Location();
//        location.setCountry("india");
//        location.setState("TN");
//        location.setDistrict("Coimbatore");
//        location.setStreet("Isha");
//
//        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(location);
//        objectOutputStream.close();
//        objectOutputStream.close();
//     }



  //  }
}

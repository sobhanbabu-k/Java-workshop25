package com.temperature;

import com.temperature.beans.*;

import java.io.*;

public class TemperatureDataApp {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Organization ourKadai = new Organization();
        ourKadai.setName("OurkadaiTech");
        ourKadai.setCeo("Sathish sir");
        ourKadai.setEmail("ourkadaitech.com");
        ourKadai.setContactNumber("1234567889");

        FileOutputStream fileOutputStream =null;
        ObjectOutputStream objectOutputStream =null;
        FileInputStream fileInputStream=null;
        ObjectInputStream objectInputStream=null;

        try {
            fileOutputStream = new FileOutputStream("ourkadaitechnology.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(ourKadai);
            objectOutputStream.close();
            fileOutputStream.close();
            fileInputStream = new FileInputStream("ourkadaitechnology.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            Organization organization = (Organization) objectInputStream.readObject();
            System.out.println(organization);
        }
         catch (FileNotFoundException e) {
           throw new RuntimeException(e);
        }
        catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
        catch (IOException e){
            throw new RuntimeException();
        }
        finally {
            try {
                if(fileOutputStream != null){
                    fileOutputStream.close();
                }
                if(objectOutputStream != null){
                    objectOutputStream.close();
                }
                if(fileInputStream != null){
                    fileInputStream.close();
                }
                if(objectInputStream != null){
                    objectOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }



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



    }
}

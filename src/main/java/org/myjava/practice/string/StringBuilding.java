package org.myjava.practice.string;

public class StringBuilding {
    public static void main(String[] args) {
        String[] buildingNames = {"Sobhan Enclave","Royal Green","Shelton","MildStone"};
        for(int i = 0; i < buildingNames.length; i++){
            if(buildingNames[i].startsWith("S")){
                System.out.println(buildingNames[i]);
            }
        }
    }
}

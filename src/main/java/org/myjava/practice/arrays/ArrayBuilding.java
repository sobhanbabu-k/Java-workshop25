package org.myjava.practice.arrays;
import java.util.Scanner;

public class ArrayBuilding {
    public int remove(int n){
        return (n-1);
    }
    public static void main(String[] args) {
        ArrayBuilding arrayBuilding=new ArrayBuilding();
        String[] buildingNames = new String[10];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<=buildingNames.length;i++){
            if(i<5) {
                buildingNames[i] = scanner.next();
            }

        }

        for(int i=0;i<=buildingNames.length;i++) {
            if(i<5) {
                System.out.println(buildingNames[i]);
            }
        }
        for(int i=5;i<=buildingNames.length;i++){
            if(i<7) {
                buildingNames[i] = scanner.next();
            }

        }
        for(int i=5;i<=buildingNames.length;i++) {
            if(i<7) {
                System.out.println(buildingNames[i]);
            }
        }
        arrayBuilding.remove(buildingNames.length);
        for(int i=0;i<=buildingNames.length;i++){

            System.out.println(buildingNames[i]);

        }
    }
}

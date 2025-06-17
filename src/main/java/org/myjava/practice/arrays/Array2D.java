package org.myjava.practice.arrays;

public class Array2D {
    public static void main(String[] args) {
        String[][] buildingNames = {{"A","B","c","D","F"},{"12","23","22","17","32"}};
         int k = 5;
        for(int i=0;i<k;i++){
            for(int j=0;j<buildingNames.length;j++){
                System.out.println(buildingNames[j][i]);
            }
        }

    }
}

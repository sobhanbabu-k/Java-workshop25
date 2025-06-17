package org.myjava.practice.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BuildingArrayCopy {
    public static void main(String[] args) {
        String[] buildings = new String[5];
        buildings[0] = "A";
        buildings[1] = "B";
        buildings[2] = "C";
        buildings[3] = "D";
        buildings[4] = "E";
   /*     String[] buildingCopy = new String[4];
        for(int i = 0,j=0;i<buildings.length;i++){
            if(!buildings[i].equals("C")) {
                buildingCopy[j] = buildings[i];
                j++;
            }


        }
        for(int k = 0 ; k<buildingCopy.length;k++){
            System.out.println(buildingCopy[k]);
        }
*/
        // 2nd method remove the null in the index of 3
        String[] array2 = new String[5];
        for(int i =0;i< buildings.length;i++){
           if(buildings[i] != "C"){
               array2[i] = buildings[i];
           }

            System.out.println(array2[i]);
        }
//        for(int s=0;s<array2.length;s++) {
//            if (array2[s] == null) {
//        //        String copy = array2[s];
//                array2[s] = array2[s + 1];
//                array2[s+1] = array2[s+2];
//        //        array2[s+2] = copy;
//            }
//            System.out.println(array2[s] + " new");
//        }
        buildings[buildings.length-1].equals(null);
        for (int r=0;r<buildings.length-1;r++){
            buildings[r] = buildings[r+1];

        }


    }
}

package org.myjava.practice.arrays;


public class SimpleArray {
    public static void main(String[] args) {
        Integer[][] arrays = {{1, 3, 5, 7,9,11,13,15,17,19,21},{2, 4, 6, 8,10,12,14,16,18,20,22}};
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < arrays.length; j++) {
        //        System.out.println(arrays.length);
                System.out.println(arrays[j][i]);
            }
        }
    }
}


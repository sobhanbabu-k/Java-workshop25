package org.myjava.practice.arrays;


public class SimpleArray {
    public static void main(String[] args) {
        Integer[][] arrays = {{1, 3, 5, 7},{2, 4, 6, 8}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < arrays.length; j++) {
        //        System.out.println(arrays.length);
                System.out.println(arrays[j][i]);
            }
        }
    }
}


package com.myjava.string.java;

public class ArrayIndexClass {
    public int number(int[] arr, int index) {
        if(index>=arr.length){
            throw new ArrayIndexOutOfBoundsException("Index out of bound");
        }
        return arr[index];
    }
}

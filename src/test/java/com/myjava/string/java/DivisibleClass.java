package com.myjava.string.java;

public class DivisibleClass {

    public int div(int a, int b) {
       if(b==0){
           throw new ArithmeticException("You Cannot divided By zero");
       }
        return (a/b);
    }
}

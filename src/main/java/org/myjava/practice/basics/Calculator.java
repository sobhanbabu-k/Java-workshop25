package org.myjava.practice.basics;

import java.util.Scanner;

public class Calculator {
    public void add(int a, int b){
        int t = a+b;
        System.out.println(" addition "+ t);
    }
    public void mul(int a, int b){
        System.out.println("multiplicatin  "+a*b);
    }
    public void sub(int a, int b){
        System.out.println( a-b  +" subtraction");
    }
    public void div(int a,int b){
        System.out.println("division "+a/b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a b values");
        int a = scanner.nextByte();
        int b = scanner.nextByte();
        Calculator calculator = new Calculator();
        calculator.add(a,b);
        calculator.sub(a,b);
        calculator.mul(a,b);
        calculator.div(a,b);
    }
}

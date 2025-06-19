package org.myjava.practice.collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> noOfBook = new Stack<>();
        noOfBook.add(1);
        noOfBook.add(3);
        noOfBook.add(6);
        noOfBook.push(4);
        System.out.println(noOfBook);
        System.out.println(noOfBook.pop());
        System.out.println(noOfBook);
        System.out.println(noOfBook.peek());
        System.out.println(noOfBook);
    }
}

package org.myjava.practice.string;

public class StringEx {
    public static void main(String[] args) {
        String s = "String is immutable object which stories value of byte array";
        String words[] = s.split(" ");
        System.out.println(words.length);
        System.out.println(s.length());


        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]);
            System.out.println();

        }
        System.out.println();
        s = s.replace(" ", "");
        System.out.println(s);
        String letters = "String is immutable object which stories value of byte array";
        String split = " ";
        String array[] = letters.split(split);
        int add = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            add += array[i].length();
        }
        System.out.println();
        System.out.println(add);
    }
}

package org.myjava.practice.string;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        String value = "String is immutable object which stories value of byte array";
        StringTokenizer stringTokenizer = new StringTokenizer(value," ",true);
        System.out.println(stringTokenizer.countTokens());
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }



    }
}

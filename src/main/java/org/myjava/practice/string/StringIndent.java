package org.myjava.practice.string;

public class StringIndent {
    public static void main(String[] args) {
        String str = "     String is immutable object which stories value of byte array";
        String result = str.stripIndent();
        System.out.println(" Orignal String value :" + str);
        System.out.println("After Indent Value    : "+ result);
    }
}

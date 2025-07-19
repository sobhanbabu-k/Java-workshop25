package org.myjava.practice.stream;


import java.util.HashMap;
import java.util.Map;

public class MapStream {
    public static void main(String[] args) {
        Map<Integer,String> subNames = new HashMap<>();
        subNames.put(101,"English");
        subNames.put(103,"Maths");
        subNames.put(102,"Telugu");
        subNames.put(105,"Social");
        subNames.put(104,"Science");
        subNames.put(100,"dkljd");
        System.out.println(subNames.keySet());
        System.out.println(subNames);
        System.out.println(subNames.values());
        System.out.println(subNames.entrySet());
    }
}

package org.myjava.practice.collections.task;


import java.util.*;

public class MarksSort {


    public static void main(String[] args) {
    List<String> name = new ArrayList<>();
    name.add("Sobhanbabu");
    name.add("Bala");
    name.add("Srinu");
        System.out.println(name);
        name.sort(Comparator.naturalOrder());
        System.out.println(name);
        name.sort(Comparator.reverseOrder());
        System.out.println(name);
    }
}

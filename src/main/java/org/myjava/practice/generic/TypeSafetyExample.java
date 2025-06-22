package org.myjava.practice.generic;

import java.util.ArrayList;
import java.util.List;

public class TypeSafetyExample {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("namesob");
        list.add(343);
        list.add("3344fdf");
        list.add(34.33);
        System.out.println(list);

        String name = (String) list.get(0);
        System.out.println(name);
        Double dobvalue = (Double) list.get(3);
        System.out.println(dobvalue);


    }
}

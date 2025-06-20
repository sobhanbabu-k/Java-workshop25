package org.myjava.practice.collections.task;

import java.util.*;

public class ListNumMax {
    public static void main(String[] args) {
        List<Integer> name = new ArrayList<>();
        name.add(100);
        name.add(399);
        name.add(349);
        System.out.println(name);
        System.out.println(Collections.max(name));
        System.out.println(name);
    }
}

package org.myjava.practice.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetCollections {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(40);
        set.add(70);
        set.add(90);
        set.add(20);
        Set<Integer> set1 = Set.of(30,40,50,20,80);
        Set<Integer> setAdd = new HashSet<>();
        setAdd.addAll(set);
        setAdd.addAll(set1);
   //   System.out.println(setAdd);
        set.retainAll(set1);
        setAdd.removeAll(set1);
        System.out.println(setAdd);


//        set.addAll(set1);
//        System.out.println(set);
//        set.retainAll(set1);
//        System.out.println(set);
//        set.removeAll(set1);
//        System.out.println(set);


    }
}

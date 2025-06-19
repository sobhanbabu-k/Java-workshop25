package org.myjava.practice.collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollections {
    public static void main(String[] args) {
        Map<Integer,String> cseA = new HashMap<>();
        cseA.put(101,"Sathashini");
        cseA.put(102,"Keerthu");
        cseA.put(103,"maddy");
        cseA.put(104,"Sobhan");

        Map<Integer, String> cseB = new HashMap<>();
        cseB.put(105,"Pawan kalyan");
        cseB.put(106,"Janasena");
        cseB.put(107,"AA");
        cseB.put(108,"pspk");

       Map<Integer , String> totalCse = new HashMap<>();
       totalCse.putAll(cseA);
       totalCse.putAll(cseB);
//        System.out.println(totalCse);
//        System.out.println(totalCse.keySet());
//        System.out.println(totalCse.values());

        Map<Integer,String> students = new HashMap<>();
        students.put(201,"sobhan");
        students.put(205,"suresh");
        students.put(104,"Sobhan");
        students.put(102,"Keerthu");
        students.put(109,"shahasini");
        students.put(110,"maddy");

        Map<Integer, String> paidst = new HashMap<>();
       paidst.putAll(cseA);
       paidst.putAll(cseB);
       paidst.entrySet().removeAll(students.entrySet());
        System.out.println(paidst);

    }
}

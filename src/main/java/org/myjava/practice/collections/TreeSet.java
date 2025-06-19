package org.myjava.practice.collections;

import java.util.*;

public class TreeSet {
    public static void main(String[] args) {
        // TreeSet<>(Comparator.reverseOrder());
        //
       Set<String> students = new java.util.TreeSet<>();
       students.add("Sobhan");
       students.add("Keerthu");
       students.add("maddy");
       students.add("sathasini_angel sister");
    //   students.add(null);
    //    System.out.println(students);

        Queue<Integer> admission =new LinkedList<>();
        admission.add(101);
        admission.add(106);
        admission.add(566);
        admission.add(345);
        System.out.println(admission);
        System.out.println(admission.remove());
        System.out.println(admission);
        admission.add(200);
        System.out.println(admission);
        // poll remove first element
        Integer addmissionNo = admission.peek();
//        while(addmissionNo!=null){
//            System.out.println(addmissionNo);
//           addmissionNo= admission.poll();
//        }
        System.out.println(admission.peek());



    }
}

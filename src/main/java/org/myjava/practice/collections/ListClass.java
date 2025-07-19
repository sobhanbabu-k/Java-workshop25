package org.myjava.practice.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListClass {
    public static void main(String[] args) {
        List<String> names = new Vector<>();
        names.add("Sobhan");
        names.add("Maddy");
        names.add("sahasini");
        names.add("keerthu");
        System.out.println(names);
        names.add("Rock");
        System.out.println(names);

        List<String> totalNames = new Vector<>();
        totalNames.add("Sobhan babu");
        totalNames.add("Babu");
        names.addAll(totalNames);
        System.out.println(names);
//        System.out.println(names.removeFirst());
//        System.out.println(names);
//        System.out.println(names.removeLast());
//        System.out.println(names);
//        names.add(0,"Sobhan");
//        System.out.println(names);
//        names.set(2,"Sahashini_Danger");
//        System.out.println(names);
//       names.forEach(System.out::println);
//
//        Iterator<String> nameIterator = names.iterator();
//  //      nameIterator.forEachRemaining(System.out::println);
//        while (nameIterator.hasNext()){
//              String name = nameIterator.next();
//              if(name.equals("Sobhan")){
//                  names.remove("Sobhan");
//                  System.out.println("removed");
//            }
//            System.out.println(name);
//            System.out.println(names);
//        }

    }
}

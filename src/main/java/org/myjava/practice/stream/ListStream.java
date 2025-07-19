package org.myjava.practice.stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListStream {
//    public static void main(String[] args) {
//        List<String> names = List.of("sobhan","mani","suresh","bala");
//       names.stream().filter(name -> name.startsWith("s")).forEach(System.out::println);
//      //  System.out.println(names);
//    }
public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Sobhan");
    names.add("Suresh");
    names.add("mani");
    names.add("dhaka");
    names.stream().filter(name -> name.startsWith("d")).distinct().map(String::toUpperCase).forEach(System.out::println);
}
}

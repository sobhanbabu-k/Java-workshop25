package org.myjava.practice.tasktime.streams;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class setSubjectsStream {
    public static void main(String[] args) {
         List<String> list = List.of("Physics ","Maths ","Chemistry ","Social ");
         String addValue ="Local_Language ";
    //     Stream<List> sub = Arrays.stream(list);
    //    System.out.println( Stream.concat(Stream.of(addValue),Stream.of(list)));
        System.out.println(Stream.concat(Stream.of(addValue),list.stream().limit(list.size()-1)).collect(Collectors.joining()));
    }
}

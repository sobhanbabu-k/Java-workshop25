package org.myjava.practice.tasktime.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MarksStream {
    public static void main(String[] args) {
        List<Integer> marks = List.of(23,44,23,12,43,98,32);
       List<Integer> ascending = marks.stream().sorted().collect(Collectors.toList());
        System.out.println(ascending);
        List<Integer> desending = marks.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(desending);
    }
}

package org.myjava.practice.stream;

import java.util.List;

public class StudentsMarks {
    public static void main(String[] args) {
    List<Integer> marks = List.of(45,66,78,98,45,34,56,33,23,12);
    long passcount = marks.stream().filter(mark -> mark > 40).count();
        System.out.println(passcount);
        marks.stream().filter(fail -> fail < 40).forEach(System.out::println);

    }
}

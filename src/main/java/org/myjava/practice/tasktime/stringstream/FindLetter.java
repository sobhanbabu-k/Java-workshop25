package org.myjava.practice.tasktime.stringstream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindLetter {
    public static void main(String[] args) {
        String[] elements = {"Sobhan has completed the b tech from giet college"};
        long count = Arrays.stream(elements)
                .flatMapToInt(s -> s.chars())
                        .filter(c -> c !=' ')
                        .count();
        System.out.println(count);

        Arrays.stream(elements).flatMap(s -> Arrays.stream(s.split("")));
        String letters = Arrays.stream(elements).flatMap(s -> Arrays.stream(s.split(" "))).toString();
        System.out.println(letters.length());


    }
}

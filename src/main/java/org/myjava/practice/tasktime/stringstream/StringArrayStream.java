package org.myjava.practice.tasktime.stringstream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringArrayStream {
    public static void main(String[] args) {
        String[] names = {"Sobhan", "Keerthanasri", "sathasini", ",maddy", "guru"};
         // min word
        System.out.println(Arrays.stream(names).sorted(Comparator.comparing(String::length)).findFirst().get());
        // max word
        System.out.println(Arrays.stream(names).sorted(Comparator.comparing(String::length).reversed()).findFirst().get());
        // min length
        System.out.println(Arrays.stream(names).map(String::length).sorted().findFirst().get());
        // max length
        System.out.println(Arrays.stream(names).map(String::length).sorted(Comparator.reverseOrder()).findFirst().get());

    }

}

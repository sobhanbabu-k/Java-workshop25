package org.myjava.practice.tasktime.stringstream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindElement {
    public static void main(String[] args) {
        String[] elements = {"Sobhan has completed the b tech from giet college"};
        List<String> words = Arrays.stream(elements)
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());
        System.out.println(words.size());
        words.forEach(System.out::println);

    }
}

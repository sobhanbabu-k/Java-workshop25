package org.myjava.practice.tasktime.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ListNumMax {
    public static void main(String[] args) {
        Integer[] numbers = {12,144,55,32,45};
        Stream<Integer> maxNum = Arrays.stream(numbers);
        System.out.println(maxNum.max(Integer::compare).get());
    }

}

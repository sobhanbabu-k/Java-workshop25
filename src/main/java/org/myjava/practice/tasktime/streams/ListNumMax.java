package org.myjava.practice.tasktime.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class ListNumMax {
    public static void main(String[] args) {
        Integer[] numbers = {12,44,55,32,55};
        Stream<Integer> maxNum = Arrays.stream(numbers);

    }

}

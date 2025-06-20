package org.myjava.practice.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStream {
    public static void main(String[] args) {
//        Integer[] numbers = {23,3,4,6,45,66,33,32,88};
//        Stream<Integer> evenStream = Arrays.stream(numbers);
//        evenStream.filter(number -> number%2==0).forEach(System.out::println);
//
//        int[] num = {3,6,7,9,5};
//        IntStream numSquare = Arrays.stream(num);
//        numSquare.map(n -> n*n).filter(n -> n>10).forEach(System.out::println);


        int[] maxnum = {12,45,33,78,44};
//        IntStream maxNumber = Arrays.stream(maxnum);
//     //   maxNumber.max();
//        System.out.println(maxNumber.max());
        Integer[] numbers = {23,44,66,44,87};
        Stream<Integer> maxNum = Arrays.stream(numbers);
       // maxNum.max()

    }
}

package org.myjava.practice.tasktime;

import java.time.LocalTime;
import java.time.OffsetTime;
import java.util.Scanner;

public class StringTimeDiff {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(3,30,30);
        LocalTime time1 = LocalTime.of(6,30,30);
        LocalTime time2 = LocalTime.of(9,30,30);
        System.out.println(time1.compareTo(time));
         int j = time1.compareTo(time2);
         int k = time.compareTo(time2);

        System.out.println(j);
        System.out.println(k);

    }
}

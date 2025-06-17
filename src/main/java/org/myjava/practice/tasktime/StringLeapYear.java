package org.myjava.practice.tasktime;

import java.time.Year;

public class StringLeapYear {
    public static void main(String[] args) {
        Year year = Year.of(2024);
        System.out.println(year);
        System.out.println(year.isLeap());
    }
}

package org.myjava.practice.tasktime;

import java.time.LocalDate;
import java.util.Scanner;

public class StringNoOfMonths {
    public static void main(String[] args) {
        LocalDate localDate =LocalDate.of(2025,01,23);
        for(int i = 0;i<12;i++) {
            localDate = localDate.plusMonths(i);
            System.out.println(i+" Month "+localDate.lengthOfMonth() );
        }
    }
}

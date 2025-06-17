package org.myjava.practice.tasktime;

import java.time.LocalDate;

public class StringPreviousDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Present Date : "+localDate);
       localDate = localDate.minusDays(5);
        System.out.println(" Before 5 days date : "+localDate);
    }
}

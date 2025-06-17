package org.myjava.practice.tasktime;

import java.time.LocalDate;
import java.time.Year;

public class StringDayOfTheYear {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate localDate1 =LocalDate.of(2025,06,16);
       int days = localDate1.getDayOfYear();
        System.out.println(days);

    }
}

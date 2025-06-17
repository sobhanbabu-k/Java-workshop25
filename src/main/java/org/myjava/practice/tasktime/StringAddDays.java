package org.myjava.practice.tasktime;

import java.time.LocalDate;

public class StringAddDays {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2000,03,06);
        System.out.println(localDate);
        System.out.println(localDate.plusDays(14));
    }
}

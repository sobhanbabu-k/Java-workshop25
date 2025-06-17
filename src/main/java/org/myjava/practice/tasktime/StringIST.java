package org.myjava.practice.tasktime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class StringIST {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("This is the Indian standard Time "+dateTime);
       dateTime = dateTime.minusHours(10);
       dateTime = dateTime.minusMinutes(30);
        System.out.println("This is the Central Standard Time : "+dateTime);
    }
}

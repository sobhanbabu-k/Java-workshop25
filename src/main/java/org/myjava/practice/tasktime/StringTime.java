package org.myjava.practice.tasktime;

import java.time.LocalTime;

public class StringTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Acutal time : "+ time);
        System.out.println("Before 30 min time : "+time.minusMinutes(30));  // before 30 min time
    }
}

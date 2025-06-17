package org.myjava.practice.tasktime;

import java.time.LocalDate;
import java.time.OffsetTime;

public class StringDateTimeOffset {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.print(localDate+":T:");
        OffsetTime offsetTime = OffsetTime.now();
        System.out.println(offsetTime);

    }
}

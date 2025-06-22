package org.myjava.practice.tasktime.streams;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Stream;

public class TempStream {
    public static void main(String[] args) {
        Map<LocalDateTime,Integer> tempList = new HashMap<>();
        tempList.put(LocalDateTime.now(),30);
        tempList.put(LocalDateTime.now().minusMinutes(30),32);
        tempList.put(LocalDateTime.now().minusMinutes(40),34);
        tempList.put(LocalDateTime.now().minusMinutes(50),36);
        System.out.println(Stream.of(tempList).toList());
    }
}

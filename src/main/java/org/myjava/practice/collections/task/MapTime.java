package org.myjava.practice.collections.task;


import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class MapTime {
    public static void main(String[] args) {
        Map<LocalDateTime, Double> name = new HashMap<>();
        name.put(LocalDateTime.of(2025,06,20,9,33,33),30.05);
        name.put(LocalDateTime.of(2025,06,20,10,00,33),34.55);
        name.put(LocalDateTime.of(2025,06,20,10,33,33),36.66);
        name.put(LocalDateTime.of(2025,06,20,11,00,33),38.66);
        System.out.println(name);
        // System.out.println(name.keySet()+"    "+name.values());
    }
}

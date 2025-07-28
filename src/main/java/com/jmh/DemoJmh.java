package com.jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DemoJmh {
    public static void main(String[] args) {
        DemoJmh.addItem();
        DemoJmh.addElement();
    }
    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    public static void addItem(){
        List<Integer> a = new ArrayList<>();
       a.add(0,10);
       a.add(1,39);
       a.add(2,34);
       a.add(3,34);
        System.out.println(a.size());
        System.out.println(TimeUnit.SECONDS);
        System.out.println(Mode.AverageTime);
    }
    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    public static void addElement(){
        List<String> names = new LinkedList<>();
        names.add(0,"sobhan");
        names.add(1,"sadha");
        names.add(2,"keerrr");
        names.add(3,"sudarrrr");
        System.out.println(names.size());
        System.out.println(TimeUnit.NANOSECONDS);
    }

    @Benchmark
    public void init() {
        // Do nothing
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    public void doNothing() {
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    public void objectCreation() {
        new Object();
    }
}

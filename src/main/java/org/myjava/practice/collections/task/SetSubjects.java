package org.myjava.practice.collections.task;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class SetSubjects {
    public static void main(String[] args) {
        List<String> subjectNames = new Vector<>();
        subjectNames.add("Physics");
        subjectNames.add("Maths");
        subjectNames.add("Chemistry");
        subjectNames.add("Social");
        System.out.println(subjectNames);
        subjectNames.add(0,"first");

    }
}

package org.myjava.practice.string;

import java.util.Scanner;

public class StringDegree {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Your Name");
//        String name = scanner.nextLine();
//        System.out.println("Please Enter Your Qualification");
//        String degree = scanner.nextLine();
//        System.out.println("Name of the Student is : " +name + ";  Qualification is : "+degree);
//        scanner.close();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the Name");
//        StringBuilder nameWithDegree = new StringBuilder();
//        nameWithDegree.append(scanner.nextLine()).append(" ");
//        System.out.println("Enter the Degree");
//        nameWithDegree.append(scanner.nextLine());
//        System.out.println(nameWithDegree);

//String Buffer
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the Name");
//        StringBuffer nameWithDegree = new StringBuffer();
//        nameWithDegree.append(scanner.nextLine()).append(" ");
//        System.out.println("Enter the Degree");
//        nameWithDegree.append(scanner.nextLine());
//        System.out.println(nameWithDegree);

        Scanner scanner = new Scanner(System.in);
        StringBuffer value = new StringBuffer();
        System.out.println("Enter the name");
        String name = scanner.nextLine();
        System.out.println("Enter Your Degree");
        String degree = scanner.nextLine();
        System.out.println("Enter Your Stream");
        String stream = scanner.nextLine();
        System.out.println("Enter Your College");
        String college = scanner.nextLine();

//        value.append(name).append(" is completed the ");
//        value.append(degree).append(" from ");
//        value.append(college).append(" as a main stream of ");
//        value.append(stream);
        String s = "%s is completed the %s from %s as a main stream of %s";
        System.out.println(String.format(s,name,degree,college,stream));









    }
}

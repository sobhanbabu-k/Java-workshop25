package org.myjava.practice.tasktime;

import java.time.LocalDate;

public class StringVacinationKid {
    public static void main(String[] args) {
        LocalDate dateOfBirth = LocalDate.of(2024,01,10);
        System.out.println("Date of Birth Of the Kid : "+dateOfBirth);
        System.out.println("vacination 1 : "+dateOfBirth.plusDays(30));
        System.out.println("vacination 2 : "+dateOfBirth.plusDays(60));
        System.out.println("vacination 3 : "+dateOfBirth.plusDays(90));
        System.out.println("vacination 4 : "+dateOfBirth.plusDays(120));
        System.out.println("vacination 5 : "+dateOfBirth.plusDays(150));
        System.out.println("vacination 6 : "+dateOfBirth.plusDays(720));


    }
}

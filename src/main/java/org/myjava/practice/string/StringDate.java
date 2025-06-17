package org.myjava.practice.string;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class StringDate {
    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date);
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//        Date date1 = new Date(2000,3,6);
//        System.out.println(date1);
//        LocalDate localDate1=LocalDate.of(2000,4,6);
//     //   System.out.println(localDate1);
//     //   System.out.println(localDate.minusYears(2000));
//        System.out.println((localDate.compareTo(localDate1))+" Years ");
//        System.out.println(localDate.getMonth());
//        System.out.println(localDate.getDayOfMonth());
     //   System.out.println(localDate.getDayOfWeek());
      //  System.out.println(localDate.getDayOfYear());
  //      System.out.println(localDate.getYear());

        Scanner scanner =new Scanner(System.in);
        String inputDate = scanner.next();
        LocalDate localDate2 = LocalDate.parse(inputDate);
        System.out.println(localDate2);
        System.out.println(localDate2.format(DateTimeFormatter.ofPattern("dd-L-YYYY")));  // month = 3
        System.out.println(localDate2.format(DateTimeFormatter.ofPattern("dd-LL-YYYY")));  // 03
        System.out.println(localDate2.format(DateTimeFormatter.ofPattern("dd-LLL-YYYY")));  // Mar
        System.out.println(localDate2.format(DateTimeFormatter.ofPattern("dd-LLLL-YYYY"))); // March

    }
}

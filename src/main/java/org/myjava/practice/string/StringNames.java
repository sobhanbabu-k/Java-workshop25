package org.myjava.practice.string;

import java.util.Scanner;

public class StringNames {
    public static void main(String[] args) {
//        String[] str = {"sobhan","sanju","siva","devi"};
//
//        for(int i = 0;i<str.length;i++){
//            if (i % 2 == 0) {
//                System.out.println("Mr :"+str[i]);
//            }
//            else {
//                System.out.println("Miss :"+str[i]);
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[n];
        for(int i = 0;i < names.length;i++){
            names[i] = scanner.nextLine();
        }

        StringBuffer nameWithTitle = new StringBuffer();

        for(int j = 0; j<names.length;j++){
            if(names[j].length() % 2 == 0){
                System.out.println(nameWithTitle.insert(0,"Mr ").append(names[j]));
            }
            else {
                System.out.println(nameWithTitle.insert(0,"Miss ").append(names[j]));
            }
            nameWithTitle.delete(0,nameWithTitle.length());
        }


    }
}

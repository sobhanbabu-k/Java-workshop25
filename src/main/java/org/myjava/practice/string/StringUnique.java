package org.myjava.practice.string;

import java.util.Arrays;

public class StringUnique {
    public static void main(String[] args) {
        // Unique letters
      String str = "String is immutable object which stories value of byte array";
      str = str.toLowerCase();

        System.out.println("Unique letter = ");
      for(int i = 0; i < str.length();i++) {
          char ch = str.charAt(i);
          int count = 0;
          if (Character.isLetter(ch)) {
              for (int j = 0; j < str.length(); j++) {
                  if (str.charAt(j) == ch) {
                      count++;
                  }
              }
              if (count == 1) {
                  System.out.println(ch + " ");
              }

          }
      }

    }
}

package org.myjava.practice.string;

public class StringVowel {
    public static void main(String[] args) {
        String str = "String is immutable object which stories value of byte array";
         str = str.toLowerCase();
        System.out.print("Vowel in the sentence is : ");
         for(int i = 0 ; i < str.length();i++){
             char ch = str.charAt(i);

             if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch =='u'){
                 // Here i print both vowel characers and indexes
                 System.out.print(ch+ "= " + i +", ");

             }
         }

    }
}

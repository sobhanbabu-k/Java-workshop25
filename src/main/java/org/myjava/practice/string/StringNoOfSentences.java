package org.myjava.practice.string;

public class StringNoOfSentences {
    public static void main(String[] args) {
        // Sentences Count
        String str = "String is immutable object. which stories value of byte array.";
        String[] sentences = str.split("\\.");
          int count = 0;
        for(int i = 0 ; i < sentences.length; i++){
            System.out.println(sentences[i]);
            count++;
        }
        System.out.println("Number of Sentences : "+count);

        // count sentences, words , letters
        String str1 = "String is immutable object. which stories value of byte array.";
        String[] sentences1 = str1.split("[\\.] ");
        int count1 = 0;
        for(int j = 0 ; j < sentences1.length; j++){
            System.out.println(sentences1[j]);
            count1++;
        }
        System.out.println(" No of Sentences : "+count1);

        String str2 = "String is immutable object. which stories value of byte array.";

        int count2 =0;
         String[] words = str2.split(" ");
        for(int i = 0 ; i < words.length; i++){
        //    System.out.println(words[i]);
            count2++;
        }
        System.out.println("Number of words : "+count2);

        // letters
        String str3 = "String is immutable object. which stories value of byte array.";

        int count3 = 0;
        for(int i = 0; i < str3.length(); i++){
            count3++;
        }
        System.out.println("No of letters : "+count3);

    }
}

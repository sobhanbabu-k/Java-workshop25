package org.myjava.practice.string;

public class StringMinWord {
    public static void main(String[] args) {
        String str = "String is immutable object which stories value of byte array String immutable object which stories value of byte array array";
      str = str.toLowerCase();
      String[] word = str.split(" ");
      for(int k = 0 ; k < word.length; k++) {
          System.out.println(word[k]);
      }
      int minCount =Integer.MAX_VALUE;
      String s = "";
      for (int i = 0 ; i < word.length; i++){
          int count = 0;
          for (int j = 0 ; j < word.length; j++){
              if(word[i].equals(word[j])){
                  count++;
              }
          }
          if(count < minCount){
              minCount = count;
              s = word[i];
          }
      }
        System.out.println("Least count word : "+s +" count is "+minCount);
    }
}

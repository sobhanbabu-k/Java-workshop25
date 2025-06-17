package com.myjava.string.java;

public class StringWordCounter {
    public int count(String value) {
        int counter = 0;
        if(!(value == null)){
            String[] words = value.split(" ");
            for(int i = 0;i < words.length;i++){
                if(!words[i].equals("")){
                    counter++;
                }
            }
        }

        return counter;
    }
}

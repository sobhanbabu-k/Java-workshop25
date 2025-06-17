package org.myjava.practice.string;

public class StringRepeat {
    public static void main(String[] args) {
        String str = "String issssssssss iiiimmutable object";
        str = str.toLowerCase();
        System.out.println("Input value : "+str);
        char[] ch = str.toCharArray();
        int maxCount = 0;
        char maxChar = ' ';
        for(int i = 0 ; i < ch.length ; i++){
            int count = 0;
            for(int j = 0 ; j < ch.length ; j++){
                if(ch[j] == ch[i]){
                    count++;
                }
            }
            if(maxCount < count){
                maxCount = count;
                maxChar = ch[i];
            }
        }
        System.out.println("highest charcter is : "+ maxChar);

    }
}

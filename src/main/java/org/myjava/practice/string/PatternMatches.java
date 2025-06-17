package org.myjava.practice.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatches {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Mr.[a-zA-Z]");
        Matcher  matcher=pattern.matcher("Mr.Sobhan");
        System.out.println(matcher.find());

        String value = "Sobhan has completed b tech in EEE, from Giet Engineering college.";
        String[] names = value.split(",|\\s");
        for(String name : names){
            System.out.println(name);
        }
        // vowels
        Pattern pattern1 = Pattern.compile("[^aeiou]+");
        Matcher matcher1 = pattern1.matcher("sssgghhha``");
        System.out.println(matcher1.find() );




    }
}

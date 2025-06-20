package com.myjava.string.lamdatest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.myjava.practice.lamda.Arithematic;

public class ArithematicTest {
    @Test
    public void testAddition(){
        Arithematic addition = (int a,int b) -> a+b;
        Assertions.assertEquals(100,addition.calculate(50,50));
    }
    @Test
    public void testMultiple(){
        Arithematic multiple =(int a,int b) -> a*b;
        Assertions.assertEquals(100,multiple.calculate(2,50));
    }
    @Test
    public void testSubstaction(){
        Arithematic sub = (int a,int b) -> a-b;
        Assertions.assertEquals(30,sub.calculate(100,70));
    }
    @Test
    public void testDivision(){
        Arithematic div = (int a, int b) -> a/b;
        Assertions.assertEquals(11,div.calculate(110,10));
    }
    @Test
    public void testModulus(){
        Arithematic mod = (int a, int b) -> a%b;
        Assertions.assertEquals(3,mod.calculate(53,5));
    }
}

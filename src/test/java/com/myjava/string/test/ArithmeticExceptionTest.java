package com.myjava.string.test;

import com.myjava.string.java.DivisibleClass;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ArithmeticExceptionTest {
    @Test
    public void division(){
        int a = 30;
        int b = 6;
        DivisibleClass divisibleClass=new DivisibleClass();
        int result = divisibleClass.div(a,b);
        Assertions.assertEquals(5,result);
         a = 30;
         b = 0;
       try {
           int result1 = divisibleClass.div(a,b);
           Assertions.assertEquals(6,result1);
       }
       catch (ArithmeticException e){
           Assertions.assertEquals("You Cannot divided By zero",e.getMessage());
       }
    }
}

package com.myjava.string.test;

import com.myjava.string.java.ArrayIndexClass;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class StringArrayTest {
    @Test
    public void arrayTest(){
        ArrayIndexClass arrayIndexClass = new ArrayIndexClass();
        int[] numbers={2,3,4,6,6};
        int index = 2;
        int result =   arrayIndexClass.number(numbers,index);
        Assertions.assertEquals(4,result);

        index=3;
        result= arrayIndexClass.number(numbers,index);
        Assertions.assertEquals(6,result);

        index=7;
        try {
            result=arrayIndexClass.number(numbers,index);
            Assertions.assertEquals(4,index);
            Assertions.fail();

        }
        catch (ArrayIndexOutOfBoundsException e){
            Assertions.assertNotNull(e);
            Assertions.assertEquals("Index out of bound",e.getMessage());
    //        throw new ArrayIndexOutOfBoundsException();
        }



    }

}






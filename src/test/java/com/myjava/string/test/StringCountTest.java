package com.myjava.string.test;

import com.myjava.string.java.StringWordCounter;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StringCountTest {
   @Test
    public void testCount(){
       StringWordCounter stringWordCounter = new StringWordCounter();
       int count1 = stringWordCounter.count("String is immutable object");
       Assertions.assertEquals(4,count1);
   }
   @Test
   public void testCountWithExtraSentence(){
      StringWordCounter stringWordCounter = new StringWordCounter();
      int count2 = stringWordCounter.count("String is immutable object It cannot change");
      Assertions.assertEquals(7,count2);
   }
   @Test
   public void testCountWithExtraSpace(){
      StringWordCounter stringWordCounter = new StringWordCounter();
      int count3 = stringWordCounter.count("String is immutable  object It cannot change");
      Assertions.assertEquals(7,count3);
   }
   @Test
   public void testCountWithoutSentence(){
      StringWordCounter stringWordCounter = new StringWordCounter();
      int count4 = stringWordCounter.count("");
      Assertions.assertEquals(0,count4);
   }
   @Test
   public void testCountEmpty(){
      StringWordCounter stringWordCounter = new StringWordCounter();
      int count5 = stringWordCounter.count(null);
      Assertions.assertEquals(0,count5);
   }
   @Test
   public void testCountWithDoubleQuotes(){
      StringWordCounter stringWordCounter = new StringWordCounter();
      int count6 = stringWordCounter.count("String is immutable  \"object\" It cannot change");
      Assertions.assertEquals(7,count6);
   }
   @Test
   public void testCountWithSingleWord(){
      StringWordCounter stringWordCounter = new StringWordCounter();
      int count7 = stringWordCounter.count("uncountable");
      Assertions.assertEquals(1,count7);
   }
   @Test
   public void testCountWithComma(){
      StringWordCounter stringWordCounter = new StringWordCounter();
      int count7 = stringWordCounter.count("uncountable, String is immutable object");
      Assertions.assertEquals(5,count7);
   }
   @Test
   public void testCountWithSingleQuotes(){
      StringWordCounter stringWordCounter = new StringWordCounter();
      int count8 = stringWordCounter.count("uncountable, 'String' is immutable object");
      Assertions.assertEquals(5,count8);
   }
   @Test
   public void testCountWithSpecialChar(){
      StringWordCounter stringWordCounter = new StringWordCounter();
      int count9 = stringWordCounter.count("uncountable&%@, '$String' is 8*immutable object");
      Assertions.assertEquals(5,count9);
   }

}

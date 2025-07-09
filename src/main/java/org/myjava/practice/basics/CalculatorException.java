package org.myjava.practice.basics;

public class CalculatorException {
    public int divide(int a,int b){
        try{
            if(b == 0){
                throw new ArithmeticException("Cannot Divide By 0");
            }
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            return 0;

        }
        return a/b;
    }
    public int addition(int a,int b){
        return a+b;
    }

    public int subtract(int a,int b){
        return a-b;
    }

    public int multiple(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        CalculatorException  calculatorException = new CalculatorException();
       int result = calculatorException.divide(4,0);
     int result1 = calculatorException.addition(2,5);
     int result2 = calculatorException.subtract(4,2);
     int result3 = calculatorException.multiple(2,3);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}

package org.myjava.practice.generic;

public class SortingGeneric<T extends Comparable<T>> {
  public void sort(T []array){
      for(int i = 0;i<array.length;i++){
          for(int j = i+1;j<array.length;j++){
              if(array[i].compareTo(array[j])>0){
                  T temp = array[i];
                  array[i] = array[j];
                  array[j] =temp;
              }
          }
      }
  }
  public void print(T []array){
      for(T value: array){
          System.out.println(value);
      }
  }

    public static void main(String[] args) {
        SortingGeneric<Integer> sortGeneric = new SortingGeneric<>();
        Integer[] number = {2,4,7,1,5};
        sortGeneric.sort(number);
        sortGeneric.print(number);
     //  System.out.println(number);

        SortingGeneric<String> sortString = new SortingGeneric<>();
        String[] names = {"Sobhan","Sathashini","Maddy","Keethiiii"};
        sortString.sort(names);
        sortString.print(names);

        SortingGeneric<Character> sortChar = new SortingGeneric<>();
        Character[] nameChar = {'N','H','A','K'};
        sortChar.sort(nameChar);
        sortChar.print(nameChar);

        SortingGeneric<Double> sortDouble = new SortingGeneric<>();
        Double[] nameDouble = {12.22,43.33,34.33,87.44};
        sortDouble.sort(nameDouble);
        sortDouble.print(nameDouble);
    }
}

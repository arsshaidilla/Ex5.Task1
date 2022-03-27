package com.company;
public class Exercise5Task1 {
    public static  void main (String []args) {
        int array []=new int [10];
        for (int i=0; i <array.length;i++)
            array[i]= array. length-1-i;
        for(int num :array )
            System.out.println("array["+num+")="+array[num]);
    }
}

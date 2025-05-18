package com.company;

public class InserValue {
    public void inSerValue(int[] array,int ValueInsertAt)
    {
        int count = 0 ;
         count++;
         int newSize = array.length + count;
        int[] newArray = new int[newSize];
        int newArrayIndex = 0;
       for (int i = 0 ; i < array.length;i++)
       {
           newArray[i] = array[i];
        System.out.print(newArray[i] + " ");
       }
        newArray[newSize -1 ] = ValueInsertAt;
        System.out.println("Sau khi them :  ");
        for (int i = 0 ; i < newArray.length;i++)
        {

            System.out.print(newArray[i] + " ");
        }
    }
}

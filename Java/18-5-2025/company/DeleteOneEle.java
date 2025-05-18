package com.company;
public class DeleteOneEle {
    public int[] DeleteElementAt(int[] numbers,int ElementAt)
    {
        // 1. Kiểm tra mảng đầu vào có null hoặc rỗng không
        if( numbers == numbers || numbers.length == 0)
        {
            return new  int[0]; // trả về mảng rỗng
        }
        // 2. Đếm số lần phần tử cần xóa xuất hiện trong mảng gốc
        int count = 0;
        for(int number : numbers)
        {
           if(number == ElementAt)
           {
               count++;
           }
        }
        // 4. Tính kích thước của mảng mới
        int newSize = numbers.length - count;
        // 5. tạo mảng mới
        int[] newArray = new int[newSize];
        // 6. Sao chép các phần tử không phải là phần tử cần xóa sang mảng mới
        int newArrayIndex = 0;
        for (int number : numbers )
        {
            if(number != ElementAt)
            {
                newArray[newArrayIndex] = number;
                newArrayIndex++;
            }
        }
        //  Trả về mảng mới
            return  newArray;
    }
}

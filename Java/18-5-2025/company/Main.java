package com.company;



import java.util.Map;
import java.util.Scanner;

public class Main {
    public int[] number;
    public  Main()
    {
        this.number = new int[]{10,20,30,40,50,60,70,90,10};
    }
    public void showElementOfArr() {
        System.out.print("All ele of array: ");
        for (int i = 0 ; i < number.length;i++)
        {
            System.out.print(this.number[i] + " ");
        }
        System.out.println();
    }

    public void sumArr()
    {
        int SumEleArr = 0 ;
        for (int i = 0 ; i < this.number.length;i++)
        {
            SumEleArr += this.number[i];
        }
        System.out.print("Sum all total ele in arr : " + SumEleArr);
        System.out.println();
    }
    public void SearchForAnElement()
    {
        Scanner scr = new Scanner(System.in);
        BinarySearch bs = new BinarySearch();
        int element = 0 ;
        System.out.print(" Your ele choice : ");
        int choice = scr.nextInt();
        // Binary Search
       int kq =  bs.binarySearch(this.number,0,this.number.length - 1,choice );
       for (int i = 0; i < this.number.length;i++)
       {
           element = this.number[kq];
       }
    System.out.print("Phan tu" + " " + element + " " + "tim duoc o vi tri thu : "+ kq);
    }
    public void countEleAppearance()
    {
        CountElementAppearances cea = new CountElementAppearances();
        Map<Integer,Integer> result =  cea.countEleAppearances(this.number);

        System.out.println("So lan xuat hien cac phan tu trong mang la : ");
        for (Map.Entry<Integer, Integer> entry : result.entrySet())
        {
            System.out.println("Phan tu" + entry.getKey() + ": xuat hien " + entry.getValue() + " lan" );
        }
    }
    public  void DeleteOneElement()
    {
        DeleteOneEle doe = new DeleteOneEle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want del element in Array : ");
        int del = sc.nextInt();
        int[] kq = doe.DeleteElementAt(this.number,del);
                for (int i = 0;i < this.number.length;i++)
                {
                    System.out.println(" Phan tu da duoc xoa thanh cong!");
                    System.out.print(kq[i]);
                }
    }
    public  void inSertValueInArray()
    {
        InserValue iv = new InserValue();
        Scanner sc = new Scanner(System.in);
            System.out.print("Your ele want insert : ");
            int insert = sc.nextInt();
            iv.inSerValue(this.number,insert);
    }
    public static void Menu()
    {
        Scanner scr = new Scanner(System.in);
        Main obj = new Main();
        do {
            System.out.println(" ======== Menu ======== ");
            System.out.println(" 0.Show all ele of array: ");
            System.out.println(" 1.Sum of all elements ");
            System.out.println(" 2.Search for an element ");
            System.out.println(" 3.Count nulmber of appearances ");
            System.out.println(" 4.Delete one element ");
            System.out.println(" 5.Insert one element ");
            System.out.println(" 6.Find min/max element ");
            System.out.println(" 7. Reverse elements ");
            System.out.println(" 8.Sort elements ascending / descending ");
            System.out.println(" 9.Input 0 to Stop!");
            System.out.println(" ======================== ");
            System.out.print(" Your Choose : ");
            int input = scr.nextInt();
            switch (input)
            {
                case 0:
                    obj.showElementOfArr();
                    break;
                case 1:
                    obj.sumArr();
                    break;
                case 2:
                    obj.SearchForAnElement();
                    break;
                case 3:
                    obj.countEleAppearance();
                    break;
                case 4:
                    obj.DeleteOneElement();
                    break;
                case 5:
                    obj.inSertValueInArray();
                    break;
            }
        }while (true);
    }
    public static void main(String[] args) {
        Menu();
    }
}

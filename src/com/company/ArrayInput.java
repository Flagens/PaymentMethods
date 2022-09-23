package com.company;

import java.util.Scanner;

public class ArrayInput
{
    public static float arrayInput()
    {
        int sum = 0;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of banknotes ");

        n=sc.nextInt();
        int[] array = new int[10];
        System.out.println("Enter banknotes");
        for(int i=0; i<n; i++) {
            array[i]=sc.nextInt();
        }

        for (int i=0; i<n; i++)
        {
            sum += array[i];
        }
        System.out.println(sum);
        return sum;
    }
}
package com.company;

import java.util.Scanner;

public class ArrayInput
{
    private static float sum = 0;

    public static float arrayInput()
    {

        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of banknotes ");

        n=sc.nextInt();
        float[] array = new float[10];
        sum = 0;
        System.out.println("Enter banknotes");
        for(int i=0; i<n; i++) {
            array[i]=sc.nextFloat();
        }

        for (int i=0; i<n; i++)
        {
            sum += array[i];
        }
        System.out.println(sum);
        return sum;
    }
    public static float getSum() {
        return sum;
    }


}
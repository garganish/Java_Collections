/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author anishgarg
 */
public class Array1 {
    static void display(int arr[])
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[10];
        for(int i = 0; i < 10; i++)
            arr[i] = 3 * i;
        System.out.print("Original contents: ");
             display(arr);
             Arrays.sort(arr);
             System.out.println("");
             System.out.print("sorted contents: ");
             display(arr);
             Arrays.fill(arr,2,6,2);
             System.out.println("");
             System.out.print("display contents: ");
             display(arr);
             System.out.println("");
             // Binary search for 9.
             int index=Arrays.binarySearch(arr,18);
             System.out.println(index);
    }
}

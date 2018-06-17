/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author anishgarg
 */
public class testing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a = new int[100];
            int[] b = new int[100];
            int[] c = new int[100];
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            c[i]=sc.nextInt();
        }
        System.out.println("display");
        for(int i=0;i<t;i++)
        {
            System.out.println(a[i]);
            System.out.println(b[i]);
            System.out.println(c[i]);
            
        }
    }
}

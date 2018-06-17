/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author anishgarg
 */
public class String_methods {
    public static void main(String[] args) {
        String str="Good morning";
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println("\n ");
        System.out.println(str.toUpperCase()+"\n");
        System.out.println(str.toLowerCase()+"\n");
        System.out.println(str+"\n");//AS THE STRINGS ARE IMMUTABLE SO ORIGINAL STRING REMAIN UNCHANGED 
        // IT WILL CREATE THE OBJECT IN EACH CASE (UPPER YA LOWER) and the reurn the value.
    }
}

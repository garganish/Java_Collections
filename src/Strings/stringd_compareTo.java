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
public class stringd_compareTo {
    public static void main(String[] args) {
        
                //  COMPARETO
        System.out.println("ABC".compareTo("ABC"));//0
        System.out.println("ABC".compareTo("BBC"));//-1
        System.out.println("CBC".compareTo("ABC"));//2
        System.out.println("ABC".compareTo("ABCDEFGH"));//-5
        
        // compareTo works as
        //if the it gives the differnce int he char if it finds the unmatches char
        //elese it gives the difference in the length  of the 2 string
        //so in case 2 and 3 when it finds the unmatched char return the diff in the char
        //in case 4 diff in the length will return as the 1 string is the substring of the 2 string
        
                //  SUBSTRING
        String str="welcome anish garg";
        System.out.println(str.substring(6));
        System.out.println(str.substring(6,14));//retun from 6-13 the last index is excluded
        
                //TRIM
        System.out.println("    hello       ".trim()+" world");//removes the extreme space from the right and left
                //    JOIN
        String result=String.join(",", "anish","akshit","arjun");
        System.out.println(result);
    }
}

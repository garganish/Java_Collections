/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayDeque;

/**
 *
 * @author anishgarg
 */
public class array_dequeues {
    public static void main(String[] args) {
        ArrayDeque<String> aque=new ArrayDeque<>();
        aque.push("first"); 
        aque.push("fourth");
        aque.push("seventh");
        while(!aque.isEmpty())
        {
        System.out.print("["+aque.pop()+"]");}
        System.out.println(" ");
    }
    
}

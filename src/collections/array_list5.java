/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;

/**
 *
 * @author anishgarg
 */
public class array_list5 {
    public static void main(String[] args) {
        ArrayList<Integer> alt=new ArrayList<>();
        alt.add(12);
        alt.add(11);
        alt.add(14);
        alt.add(15);
        System.out.println(alt);
        
        //alt.remove(11);//IT TREAT IT AS THE INDEX SO GIVES ARRAYOUTOF BOUND EXCEPTION
        //the remove function as 2 overload 
        //1>object as parameter
        // 2> Index
        alt.remove(new Integer(11));//do wrapping
        System.out.println(alt);
    }
}

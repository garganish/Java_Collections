/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.TreeSet;

/**
 *
 * @author anishgarg
 */
public class tree_set {
    public static void main(String[] args) {
        TreeSet<String> tset=new TreeSet<>();
        tset.add("first");
        tset.add("second");
        tset.add("anish");
        tset.add("third");
        tset.add("anish");
        System.out.println(tset);
    }
    //for decending order we need to implement the Comparator and overrides the compareTo function which is done in example treeset2
    
}


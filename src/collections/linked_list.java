/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.LinkedList;

/**
 *
 * @author anishgarg
 */
public class linked_list {
    public static void main(String[] args) {
        LinkedList<String> str=new LinkedList<>();
        str.add("first");
        str.addFirst("second");
        str.addLast("third");
        System.out.println(str);
         str.remove("second");
         str.removeLast();
        System.out.println(str);
        
    }
}

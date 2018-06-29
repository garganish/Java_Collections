/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author anishgarg
 */
public class cpllections1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(-1);
        ll.add(3);
        ll.add(13);
        ll.add(-5);
        Comparator <Integer> cm =Collections.reverseOrder();
        Iterator<Integer> it=ll.iterator();
        while(it.hasNext())
        {
            System.out.print("["+it.next()+"]");
        }
        System.out.println("");
    Collections.sort(ll,cm);
    for(int i:ll)
    {
        System.out.print(i+" ");
    }
      System.out.println();
           System.out.println("Minimum: " + Collections.min(ll));
           System.out.println("Maximum: " + Collections.max(ll));  
        
    }
}

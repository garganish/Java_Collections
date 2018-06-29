/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author anishgarg
 */
public class array_list2 {
     public static void main(String[] args) {
       ArrayList<Integer> arr=new ArrayList<>();
       //arr.add("1");
       arr.add(1);
       arr.add(2);
       arr.add(3);
             for(int i=0;i<arr.size();i++)
       {
           System.out.print("["+arr.get(i)+"]");
       }
        System.out.println(" ");
        
        
        
        for(Integer values:arr)
        {
            System.out.print("["+values+"]");
        }
        System.out.println(" ");
        
        
        Iterator<Integer> it =arr.iterator();
        while(it.hasNext())
        {
            System.out.print("["+it.next()+"]");
        }
        System.out.println(" ");
          
        
        ListIterator<Integer> lit=arr.listIterator();
          while(lit.hasNext())
          {
              System.out.print("["+lit.next()+"]");
              
          }
          System.out.println(" ");
          
          
          while(lit.hasPrevious())
          {
              System.out.print("["+lit.previous()+"]");
          }
          System.out.println(" ");
          
          
          Integer res[]=new Integer[arr.size()];
          arr.toArray(res);
          for(Integer str:res)
          {
              System.out.print("["+str+"]");
          }
          System.out.println(" ");
         
          
          
    }
}

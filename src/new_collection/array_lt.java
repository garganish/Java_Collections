/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author anishgarg
 */
public class array_lt {
    public static void main(String[] args) {
        ArrayList<String> alt=new ArrayList<>();
        alt.add("mercedes");
        alt.add("maserati");
        alt.add("porshe");
        for(int i=0;i<alt.size();i++)
        {
            System.out.println(alt.get(i)); 
        }
        System.out.println();
        for(String vals:alt)
        {
            System.out.println(vals);
        }
      Iterator<String> it=alt.iterator();
      while(it.hasNext())
      {
          System.out.print("["+it.next()+"]");
      }
        System.out.println("\n");
      ListIterator<String> lit=alt.listIterator();
//WE ALSO HAS listIterator work as forward as well as backword
      while(lit.hasNext())
      {
       System.out.print("["+lit.next()+"]");   
      }
         System.out.println("\n");
      ListIterator<String> lits=alt.listIterator();
      while(lits.hasPrevious())
      {
       System.out.print("["+lit.previous()+"]");   
      } 
        System.out.println("\n");
        
       String[] arrays=new String[alt.size()];
       alt.toArray(arrays);
       for(String values:arrays)
       {
           System.out.print("["+values+"]");
       }
        
    }
}

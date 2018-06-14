package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class array_lists 
{
    public static void main(String[] args) {
       ArrayList<String> arr=new ArrayList<>();
       arr.add("audi");
       arr.add("mercedes");
       arr.add("buggati");
       arr.add("mustang GT");
       for(int i=0;i<arr.size();i++)
       {
           System.out.print("["+arr.get(i)+"]");
       }
        System.out.println(" ");
        
        
        for(String values:arr)
        {
            System.out.print("["+values+"]");
        }
        System.out.println(" ");
        
        
        Iterator<String> it =arr.iterator();
        while(it.hasNext())
        {
            System.out.print("["+it.next()+"]");
        }
        System.out.println(" ");
          
        
        ListIterator<String> lit=arr.listIterator();
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
          
          
          String res[]=new String[arr.size()];
          arr.toArray(res);
          for(String str:res)
          {
              System.out.print("["+str+"]");
          }
          System.out.println(" ");
         
    }
    
    
}

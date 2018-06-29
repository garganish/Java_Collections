/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author anishgarg
 */
public class vectors {
    public static void main(String[] args) {
        //IT IS THE VECTOR HAVING CAPACITY 3 AND WHEN IT 3 ELEMENTS ENTERED THEN IT INCREASE THE SIZE BY 2.
        Vector<Integer> vt=new Vector<>(3,2);
        
    System.out.println("Initial size: " + vt.size());
    System.out.println("Initial capacity: " +
                       vt.capacity());
    vt.addElement(1);
    vt.addElement(2);
    vt.addElement(3);
    vt.addElement(4);
    System.out.println("Capacity after four additions: " +
                       vt.capacity());
    
    vt.addElement(5);
    System.out.println("Current capacity: " +
                       vt.capacity());
    vt.addElement(6);
    vt.addElement(7);
    System.out.println("Current capacity: " +
                       vt.capacity());
    vt.addElement(9);
    vt.addElement(10);
    System.out.println("Current capacity: " +
                       vt.capacity());
    vt.addElement(11);
    vt.addElement(12);
    System.out.println("First element: " + vt.firstElement());
    System.out.println("Last element: " + vt.lastElement());
    if(vt.contains(3))
      System.out.println("Vector contains 3.");
        
    //how to print them:
        Enumeration<Integer> em=vt.elements();
        while(em.hasMoreElements())
        {
            System.out.print(em.nextElement()+" ");
        }
        
    }
}

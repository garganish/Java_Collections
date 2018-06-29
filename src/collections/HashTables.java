/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import com.sun.jmx.snmp.Enumerated;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author anishgarg
 */
public class HashTables {

    public static void main(String[] args) {
        String str;
        Hashtable<String, Double> ht = new Hashtable<String, Double>();
        ht.put("John Doe", 3434.34);
        ht.put("Tom Smith", 123.22);
        ht.put("Jane Baker", 1378.00);
        ht.put("Tod Hall", 99.22);
        ht.put("Ralph Smith", -19.08);

        Enumeration<String> em = ht.keys();
        while (em.hasMoreElements()) {
            str = em.nextElement();
            System.out.println(str + " " + ht.get(str));
        }

        //Using For loop
        /*Set<Map.Entry<String,Double>> se=ht.entrySet();
            for(Map.Entry<String,Double> mp:se)
            {
                System.out.print(mp.getKey()+" ");
            System.out.println(mp.getValue());
           }*/
        //using Iterator
        /*Set<String> se=ht.keySet();
         //Iterator<Map.Entry<String, Double>> it=se.iterator();
         Iterator<String> it=se.iterator();
         while(it.hasNext())
         {
             str=it.next();
             System.out.println(str+" "+ht.get(str));
         }*/
        
 /* System.out.println();
    // Deposit 1,000 into John Doe's account.
    Double bal = ht.get("John Doe");
    ht.put("John Doe", bal+1000);
    System.out.println("John Doe's new balance: " +
                       ht.get("John Doe"));*/
    }
}

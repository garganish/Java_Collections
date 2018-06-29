/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author anishgarg
 */
public class TreeMaps1 {
    public static void main(String[] args) {
        //from the TreeMap we get the values i t he alphabetically order.
        TreeMap<String,Double> tm=new TreeMap<>();
        tm.put("John Doe", new Double(3434.34));
           tm.put("Tom Smith", new Double(123.22));
           tm.put("Jane Baker", new Double(1378.00));
           tm.put("Tod Hall", new Double(99.22));
           tm.put("Ralph Smith", new Double(-19.08));
           Set<Map.Entry<String,Double>> se=tm.entrySet();
           for(Map.Entry<String,Double> me: se)
           {
               System.out.print(me.getKey() + ": ");
              System.out.println(me.getValue());
           }
           System.out.println();
           Double bal=tm.get("John Doe");
           tm.put("John Doe", bal+1000);
           System.out.println("new bal of John Doe"+tm.get("John Doe"));
    }
}

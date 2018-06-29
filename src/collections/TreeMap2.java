/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author anishgarg
 */
public class TreeMap2 {
    public static void main(String[] args) {
        TreeMap<String,Double> tm=new TreeMap<>(new descending1());
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
    }
}
class descending1 implements Comparator<String>
{

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}

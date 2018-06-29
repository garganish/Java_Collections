/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author anishgarg
 */
public class hashmaps1 {

    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("anish", new Double(3434.34));
        hm.put("Tom Smith", new Double(123.22));
        hm.put("Jane Baker", new Double(1378.00));
        hm.put("Tod Hall", new Double(99.22));
        hm.put("Ralph Smith", new Double(-19.08));
        //HashMaps does'nt implement Iteratorable so hence
        Set<Map.Entry<String,Double>> se=hm.entrySet();
        for(Map.Entry<String,Double> me:se)
        {
            System.out.print(me.getKey()+" ");
            System.out.println(me.getValue());
        }
        System.out.println("\n");
        //how to get the value by using key. i.e anish
       Double bal=hm.get("anish");
        hm.put("anish",bal+1000);
        System.out.println("anish new bals"+hm.get("anish"));
    }
}

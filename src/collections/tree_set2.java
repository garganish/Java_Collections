/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author anishgarg
 */
public class tree_set2 {
    public static void main(String[] args) {
        TreeSet<String> tset=new TreeSet<>(new descending());
        tset.add("first");
        tset.add("second");
        tset.add("anish");
        tset.add("third");
        tset.add("anish");
        System.out.println(tset);
    }
}
class descending implements Comparator<String>
{

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}

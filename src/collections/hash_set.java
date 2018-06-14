/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashSet;

/**
 *
 * @author anishgarg
 */
public class hash_set {
    public static void main(String[] args) {
        HashSet<String> hset=new HashSet<>();
        hset.add("first");
        hset.add("second");
        hset.add("second");
        hset.add("third");
        System.out.println(hset);
    }
}

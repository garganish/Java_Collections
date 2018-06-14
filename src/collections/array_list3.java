/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;

/**
 *
 * @author anishgarg
 */
public class array_list3 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("mercedes");
        arr.add("bmw");
        arr.add("audi");
        arr.add("city");
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);
        arr.remove("audi");
        System.out.println(arr);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.TreeSet;

/**
 *
 * @author anishgarg
 */
public class tree_set3 {
    public static void main(String[] args) {
        TreeSet<student2> stu=new TreeSet<>();
        //it give error if you wanna do compare the object as on which basis the treeset can do comparing so 
        // to do comparing we thee class you wanna do compare should implement the comparable class
        // go to student2 class
        stu.add(new student2(1001,"anish"));
        stu.add(new student2(1002,"rames"));
        stu.add(new student2(1004,"zakir"));
        for(student2 values:stu)
        {
            System.out.println(values);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 *
 * @author anishgarg
 */
public class class_class {
    public static void main(String[] args) {
        Class cls=Scanner.class;//THIS CLASS IS USED TO CHECK THE METHOD DECLARED OR FOR HELP PURPOSE LIKE HASNEXT,TOSTRING,NEXT() ETC
        Method[] meth=cls.getDeclaredMethods();
        if(meth!=null)
        {
            for(Method me:meth)
            {
                System.out.println(me.getName());
            }
        }
    }
}

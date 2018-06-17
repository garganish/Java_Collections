/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author anishgarg
 */
public class Strings_integers {
    public static void main(String[] args) {
        
        int num=4321;
        String str=String.valueOf(num);//conert int to the Strings 
        System.out.println(str);
        
        Strings_integers db=new Strings_integers();//IN CASE OF OBJECTS STRING.VALUEOF WILL CALL THE toString() method
        str=String.valueOf(db);
        System.out.println(str.toString());
    }
}

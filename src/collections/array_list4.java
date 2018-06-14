
package collections;

import java.util.ArrayList;

public class array_list4 {
    public static void main(String[] args) {
        ArrayList<student> str=new ArrayList<>();
        str.add(new student(1001,"anish"));
        str.add(new student(1002,"akshit"));
        str.add(new student(1003,"amit"));
        str.add(new student(1004,"rajesh"));
        for(student values:str)
        {
            System.out.println(values);
        }
        str.remove(new student(1003,"amit"));
        for(student values:str)
        {
            System.out.println(values);
        }
    }
    
}

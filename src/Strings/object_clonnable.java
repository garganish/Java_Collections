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
public class object_clonnable {
    public static void main(String[] args) {
       students st=new students(1001,"anish");
        System.out.println(st);
        
        students std=new students();//FIRST WAY TO COPY THE ELEMENTS  NOW THE 2ND WAY IS TO CREATE A CONE METHOD(NAME CAN B OF YOUR CHOICE)
        std.setRollno(1007);
        std.setName("arpit");
        System.out.println(std);
        
        students st1=st.createclone();//CREATE A CREATE CLONE METHOD AND GIVE THE REFFERECE TO COPY THE ELEMENTS
        System.out.println(st1);
    }
}
class students implements Cloneable
{
    private int rollno;
    private String name;

    public students createclone() 
    {
        students stt=null;
        try
        {
        stt=(students) clone();//important point
        }
        catch(CloneNotSupportedException ex)
        {
            System.out.println(ex);
        }
        return stt;
    }
    public students(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

   

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "students{" + "rollno=" + rollno + ", name=" + name + '}';
    }

    public students() {
    }
    
    
}

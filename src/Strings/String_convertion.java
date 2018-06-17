
package Strings;


public class String_convertion {
    public static void main(String[] args) {
        
        char[] val={'a','n','i','s','h'};
        String str=new String(val);
        System.out.println(str);// char array to string
        
        char[] res=str.toCharArray();//string to char Array 
        for(char vals:res)
        {
            System.out.print(vals); 
        }
        System.out.println("\n");
        
        byte[] rs={67,68,69,79,80};//convert byte to string
        String str1=new String(rs);
        System.out.println(str1);
        
        byte[] values=str1.getBytes();//convert String to Byte array
        for(byte vals1:values)
        {
            System.out.print("["+vals1+"]");
        }
        System.out.println("\n");
    }
}


package Strings;


public class string_buffer1 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("welcome anish garg");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb);
        System.out.println(sb.reverse());
        sb.append("welcome");
        System.out.println(sb); //so as we use the string buffer thats why there is string manupilation.
        StringBuffer str=new StringBuffer("hello");
        System.out.println("buffer before: "+str);
        System.out.println("buffer before: "+str.charAt(1));
        str.setCharAt(1,'i');// SETCHAR
        str.setLength(2);// NEW FUNCTION SETLENGTH()
        System.out.println("buffer before: "+str);
         sb=new StringBuffer("i java");
         sb.insert(2,"like ");
         System.out.println(sb);
         sb=new StringBuffer("welcome anish garg");
         sb.delete(4, 6);
         System.out.println(sb);
    }
}

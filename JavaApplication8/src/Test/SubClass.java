
package Test;


public class SubClass extends SuperClass{
 
    public int doIt(String str, Integer... data) 
    {
        String signature = "(String, Integer[])";
        System.out.println("Overridden: " + str + " " + signature);
        return 0;
    }
    
    public static void main(String... args) throws Exception
    {
        SuperClass sb = new SubClass();
   
        sb.doIt("hello", 3);
    }
    
}
 
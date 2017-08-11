
package Test;
public class B extends A{       
    public B (){
        System.out.print("B");
    }
    public B (int i){
        this();
        System.out.print(i+3);
    }
}
 
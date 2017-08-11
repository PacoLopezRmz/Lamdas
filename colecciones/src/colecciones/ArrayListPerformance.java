
package colecciones;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ArrayListPerformance {
    public static void main(String[] args) {
      
      long inicio1 =  System.currentTimeMillis();
      String nombre =  new String("nom");
      List<Integer> list = new ArrayList<Integer>(10000000);
       
        for (int i=0; i<10000000; i++ ) {
            list.add(i);
        }
        long fin1 = System.currentTimeMillis();
        System.out.println("Inicio uno");
        System.out.println(fin1 - inicio1);
        
      long inicio2 =  System.currentTimeMillis();
      StringBuilder nombre2 =  new StringBuilder("name");
      List<Integer> list2 = new ArrayList<Integer>(10000000);
       
        for (int i=0; i<10000000; i++ ) {
            list2.add(i);
        }
         long fin2 =  System.currentTimeMillis();
        System.out.println("Inicio dos");
        System.out.println(fin2 - inicio2);
    }
    
}

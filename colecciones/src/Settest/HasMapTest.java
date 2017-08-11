
package Settest;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HasMapTest {
    public static void main(String[] args) {
        Map<Integer, String> diccionario =  new HashMap<Integer, String>();
//        Map m = Collections.synchronizedMap(diccionario);
//   Map d = hashMap. synchronizeMap();
//   Map t = Collection.synchronizeMap(diccionario);


        
        diccionario.put(1, "id");
         diccionario.put(2, "Name");
         diccionario.put(3, "LastName");
         
        System.out.println(diccionario.size());
        diccionario.entrySet().forEach((e) -> {
            System.out.println("Llave: " + e.getKey() + " :: " + "Valor " + e.getValue());
        });
    }
 
}

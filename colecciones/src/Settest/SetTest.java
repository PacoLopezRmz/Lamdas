
package Settest;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<String>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("c");
        lista.add("d");
        lista.add("a");
        
        for (String list : lista) {
            System.out.println(list);
        }
    }
}

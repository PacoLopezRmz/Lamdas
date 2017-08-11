
package Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

 class Bottle { }
 public class Test {
   public static void main(String[] args) {
    
       List<String> names = Arrays.asList("Volha", "Ivan", "John", "Mike", "Alex");
String name = names.stream()
    .filter(s -> {
        //System.out.println("filtering " + s);
        return s.length() == 4;
    }).map(s -> {
        //System.out.println("uppercasing " + s);
        return s.toUpperCase();
    }).findFirst().get();
 System.out.println(name);
   }
 }
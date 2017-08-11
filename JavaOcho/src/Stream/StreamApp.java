
package Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamApp {
   private List<String> lista;
   private List<String> numeros;
   
   public StreamApp(){
       lista = new ArrayList<>();
       lista.add("Juan");
       lista.add("Pedro");
       lista.add("Raul");
       lista.add("Ramon");
       
       numeros = new ArrayList<>();
       numeros.add("1");
       numeros.add("2");
       numeros.add("3");
       
   }
   
   public void filtrar(){
       lista.stream().filter(x -> x.startsWith("R")).forEach(System.out::println);
   }
   
   public void ordenar(){
       lista.stream().sorted((x, y) -> y.compareTo(x)).forEach(System.out::println);
   }
   public void limitar(){
    
}
   
    public static void main(String[] args) {
        StreamApp streams = new StreamApp();
        streams.filtrar();
    }
}


package metodosReferencia;

import java.util.Arrays;
import java.util.Comparator;

public class MetodoRef {
     
   public static void main(String[] args) {
     MetodoRef.referenciarMetodosObjetos();
     
    }
    public static void referenciarMetodosObjetos(){
        String[] nombres = {"Armando","Gerardo","Paco"};
//      Arrays.sort(nombres, new Comparator<String>() {
//            @Override
//            public int compare(String t, String t1) {
//            return t.compareToIgnoreCase(t1);
//            }
//        });
      Arrays.sort(nombres, String::compareToIgnoreCase);
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
    public void referenciaMetodoParticular(){
        
    }
    public void referenciarContructor(){
        IPersona iper =  Persona::new;
        Persona per = iper.crear(1, "Francisco Lopez");
        System.out.println(per);
    }
   
}

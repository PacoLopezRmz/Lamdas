
package colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();
     Persona pepe =  new Persona("Pepe","Pina");
     
  Profesor profesor = new Profesor();
  profesor.name = "joel";
  profesor.lastName = "Perez";
  profesor.especialidad = "Fisico";
  personas.add(pepe);
  personas.add(profesor);
        for (Object persona : personas) {
            System.out.println(persona);
        }
        Iterator iterar =  personas.iterator();
        while (iterar.hasNext()){
            System.out.println("Iterator");
            System.out.println(iterar.next());
        }
    }
}

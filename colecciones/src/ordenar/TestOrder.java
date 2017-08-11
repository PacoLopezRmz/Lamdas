
package ordenar;

import java.util.ArrayList;
import java.util.Collections;

public class TestOrder {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.nombre = "Gelipe";
        alumno.edad = 25;
        
        Alumno alumno2 = new Alumno();
        alumno2.nombre = "Zenon";
        alumno2.edad = 24;
        
        Alumno alumno3 = new Alumno();
        alumno3.nombre = "Adal";
        alumno3.edad = 23;
        
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        
        System.out.println("Sin ordenar");
        for (Alumno alumno1 : alumnos) {
            System.out.println(alumno1);
        }
        Collections.sort(alumnos);
        System.out.println("Lista Ordenada");
        for (Alumno alumno1 : alumnos) {
            System.out.println(alumno1);
        }
        
        
    }
  
}

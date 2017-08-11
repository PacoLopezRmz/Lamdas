
package com.netec.varags;

public class Operaciones {
    public static void main(String[] args) {
//           Operaciones op = new Operaciones();
//           float promedio = op.promedio(3,5,6,7,3,9);
//           System.out.println("Promedio: " + promedio);

        Operaciones op = new Operaciones();
        op.CalcularCalificaciones
        ("Saul", "Mecatronica", 10,5,9,6,3,5,8);
    }
    
//      public float promedio(int... calificaciones){
//       int suma = 0; 
//          for (int calificacion : calificaciones) {
//              suma += calificacion;
//              
//          }
//          return ((float) suma / calificaciones.length);
//    }
    
    public void CalcularCalificaciones(String nombreAlumno,
            String Carrera,int... calificaciones){
        System.err.println("Alumno: " + nombreAlumno);
        System.err.println("Carrera: " + Carrera);
        for (int calificacion : calificaciones) {
            System.err.println("Calificaciones: " + calificacion);
            
        }
    }
}

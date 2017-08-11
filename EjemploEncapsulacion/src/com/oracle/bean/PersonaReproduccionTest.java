
package com.oracle.bean;

public class PersonaReproduccionTest {
    public static void main(String[] args) {
        Persona Julio  =  new Persona();
        Julio.nombre = "Julio";
        Julio.sexo = "M";
        
        Persona Julia  =  new Persona();
        Julio.nombre = "Julia";
        //Julio.sexo = "F";
        
        Julio.reproducirce(Julia);
    }
}

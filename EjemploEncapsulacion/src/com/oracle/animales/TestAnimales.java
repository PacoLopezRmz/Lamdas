
package com.oracle.animales;

class Animal{
    String nombre;
    
    //Sobre carga de constructor
    public Animal(String nombre){
        this.nombre = nombre;
    }
    
    Animal reproducirse(Animal a){
        Animal hijo = new Animal(nombre);
        return hijo;
    }
}

class Gato extends Animal{
    public Gato(String nombre){
       super(nombre); 
    }

    @Override
    Animal reproducirse(Animal animal) {
       if(!(animal instanceof Gato)){
           System.err.println("No se puede reproducir");
       }
       Gato gato =  new Gato("Gato BeBe");
    return gato;
    }
}  
   class Perro extends Animal{
    public Perro(String nombre){
        super(nombre);
    }
} 


public class TestAnimales {
    public static void main(String args[]) {
       Perro p = new Perro("Decker");
       Gato g =  new Gato("Benito");
       System.out.println("Nuevo hijo :" + p.reproducirse(p));
    }
}

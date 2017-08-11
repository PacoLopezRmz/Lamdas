
package metodosReferencia;


public class Persona {
    public int ID;
    public String nombre;

    public Persona(int ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "ID=" + ID + ", nombre=" + nombre + '}';
    }
    
}

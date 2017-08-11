
package Serializacion;

import java.io.Serializable;

public class Gato implements Serializable{
   private static final long SerialVersionUID = 38566456822419556L;
    public String nombre;
    public String raza;

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", raza=" + raza + '}';
    }
            
}

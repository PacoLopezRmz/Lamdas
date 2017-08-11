
package ordenar;

public class Alumno implements Comparable<Alumno>{
public String nombre;
public String apellido;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
public int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }

    @Override
    public int compareTo(Alumno t) {
        String a = new String(this.getNombre() + String.valueOf(this.getEdad()));
        String b = new String(t.getNombre());
        return a.compareTo(b);
    }

}

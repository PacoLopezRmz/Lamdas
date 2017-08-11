package ejemploencapsulacion;

public class Empleado {
   private String nombre;
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
        
        if (edad <= 0){
            System.out.println("Edad no permitida");
        }else if(edad > 100){
            System.out.println("Edad muy alta");
        }
    }
   
   
}

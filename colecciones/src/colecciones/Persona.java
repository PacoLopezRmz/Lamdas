
package colecciones;

public class Persona {
public String name;
public String lastName;

public Persona(){
    
}

    Persona(String name, String lastName) {
    this.name = name;
    this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", lastName=" + lastName + '}';
    }
    
}


package Cliente;

import PersonalExeption.MiExeption;
import java.util.Date;
import javax.swing.JOptionPane;

public class SalsaVale {
    public static void main(String[] args) throws Exception {
        
        try{
            SalsaVale.validarEntrar("Juan",16);
        }catch(MiExeption ex){
            JOptionPane.showMessageDialog(null,ex.getDescription() + ":" + 
                    ex.getMessage());
            throw new MiExeption(500,"Menor no permitido", 
                    new Date(),"No se permite la entrada a menores");
        }
    }
    public static boolean validarEntrar(String nombre, int edad) throws Exception{
        boolean esMayor = false;
        if(edad >= 18){
            esMayor = true;
            System.out.println("Bienvenido: " + nombre);
        }else{
            throw new MiExeption("No eres mayor de edad");
        }
        return esMayor;
    }
  
}

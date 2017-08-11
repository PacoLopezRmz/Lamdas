
package Serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class TestGato {
    public static void main(String[] args) throws Exception{
        Gato Benito = new Gato();
        Benito.nombre = "Benito";
        Benito.raza = "Angora";
        
        try{
//        FileOutputStream fm = new FileOutputStream("tester.ser");
//        ObjectOutputStream os = new ObjectOutputStream(fm);
//        os.writeObject(Benito);
//        os.close();
            FileInputStream fi = new FileInputStream("tester.ser");
            ObjectInputStream obj = new ObjectInputStream(fi);
            Gato nuevoGato = (Gato) obj.readObject();
            obj.close();
            System.out.println(nuevoGato);
           
        }catch(Exception e){
            e.printStackTrace();
                    }
        }
    }
 
    


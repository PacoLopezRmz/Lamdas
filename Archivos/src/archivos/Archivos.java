
package archivos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {

    public static void main(String[] args) throws IOException {
    
        // Crear un archivo
        File file = new File("PruebaFiles2.txt");
        char[] in = new char[36];;
    if(!file.exists()){
        if(file.createNewFile()){
            System.out.println("Se creo exitosamente");
        }else{
            System.out.println("No se creo el archivo");
        }
    }else{
        System.out.println("El archivo ya existe");
    }
        FileWriter fw = new FileWriter(file);
        fw.write("Articulo:  Television \n Precio: $5000");
        fw.flush();
        fw.close();
        
        FileReader fr = new FileReader(file);
       
        int size = fr.read(in);
        
        System.out.println(size + " ");
        for (char c : in) {
            System.out.println(in); 
        }
    }
    
}

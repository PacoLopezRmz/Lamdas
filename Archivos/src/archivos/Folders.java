
package archivos;

import java.io.File;
import java.io.IOException;

public class Folders {
    public static void main(String[] args) throws IOException {
       File dir = new File("Electronica");
       dir.mkdir();
        File midirectorio = new File("Electronica","Ventas.txt");
        midirectorio.createNewFile();
    }
 
}

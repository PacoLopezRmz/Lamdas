
package lamdas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.swing.text.StyledEditorKit;

public class OrdenarSinLamda {
    public static void main(String[] args) {
        
    List<Persona> clientes = new ArrayList<Persona>();
    clientes.add(new Persona("Lety"));
    clientes.add(new Persona("Alberto"));
    clientes.add(new Persona("Carlos"));
    clientes.add(new Persona("Yessica"));
    
//    Collections.sort(clientes, new Comparator<Persona>(){
//        @Override
//        public int compare(Persona o1, Persona o2){
//        return o1.nombre.compareTo(o2.nombre);
//    }
//        
//    });
    
//    Collections.sort(clientes, 
//         (Persona p1, Persona p2)->p1.nombre.compareTo(p2.nombre));
    for(Persona cliente : clientes){
            System.out.println(cliente);
}
}
}

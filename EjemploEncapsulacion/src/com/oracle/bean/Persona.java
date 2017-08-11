
package com.oracle.bean;

public class Persona {
    Persona padre;
    Persona madre;
    
    String nombre;
    String sexo;
    
public Persona reproducirce(Persona p){
    Persona hijo = null;
    
    if(p!=null && p instanceof Persona){
        
if (this.sexo != p.sexo){
      hijo = new Persona();
 switch (this.sexo){
     case "F":
         hijo.madre=this;
         hijo.padre=p;
         break;
     case "H":
         hijo.madre=p;
         hijo.padre=this;
         break;
     default:
         System.out.println("Falta sexo opuesto");
         break;
 }
}else{
    System.out.println("Reproduccion");
}
    }
    return hijo;
}
}

package com.netec.statictest;
import java.util.Date;
import static com.netec.util.Herramientas.*;

public class TestStatic {
 
 public static String nombre = "Juan";
   
 public static void main(String[] args) {
   StringBuilder con =  new StringBuilder("Nombre,Nombre,");
   
   while(true){
       con.append("Nombre").append(",Nombre");
       System.err.println(con);
   }
    }
}
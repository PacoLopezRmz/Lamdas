
package clase_4;


public class Clase_4 {

   
    public static void main(String[] args) {
    String [] nombres = {"Paco","Jose","Rous","Marga","Abraham"};
       try{
    for (int x=0; x<=5; x++) {
            System.err.println(nombres[x]);
        }
       }catch(Exception e){
           System.err.println(e.getMessage());  
           System.err.println(e.getCause()); 
           e.printStackTrace();
           
       }
        System.err.println("Contiua");
    }
    
}


package lamdasOperaciones;

public class OperacionNormal {
    public static void main(String[] args) {
    OperacionNormal test =  new OperacionNormal();
    test.calcular();
    }

    private void calcular() {
    Operacion operacion = (double x, double y)->((x+y)/2);
        System.out.println(operacion.calcularPromedio(34, 40));
    }
    //Prueba de subir cambioa GIT
}

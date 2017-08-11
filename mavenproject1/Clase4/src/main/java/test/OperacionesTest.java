
package test;

import Operaciones.Operaciones;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class OperacionesTest {
    
    @Test
    public void testOperaciones(){
    Operaciones op = new Operaciones();
    int resultado = op.sumar(5, 4);
    //Assert.assertArrayEquals(10, resultado);
    }
}

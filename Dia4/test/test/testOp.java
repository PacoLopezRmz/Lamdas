package test;
import Operaciones.Operaciones;
import org.junit.Test;
import org.junit.Assert;
          
public class testOp{

    public testOp() {
    }
    
    @Test
    public void test(){
        Operaciones op = new Operaciones();
        int sum = op.sumar(6, 5);
        Assert.assertEquals(11, sum);
    }
}

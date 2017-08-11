
package com.netec.pedidos;
import static com.netec.pedidos.Paises.*;

public class PedidoEspaña extends Pedidos{

    @Override
    protected void calcularIVA() {
   this.pais=ESPAÑA.toString();
        importeIVA = importeSinIVA * 0.21;   
    }
    
}

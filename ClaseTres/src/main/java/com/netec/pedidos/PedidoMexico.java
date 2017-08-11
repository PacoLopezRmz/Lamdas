
package com.netec.pedidos;
import static com.netec.pedidos.Paises.*;

public class PedidoMexico extends Pedidos{

    @Override
    protected void calcularIVA() {
    this.pais = MEXICO.toString();
        importeIVA = importeSinIVA * 0.16;
    }
    
}


package com.netec.pedidos;

public class Usuario {
    
    public static void main(String[] args) {
        Pedidos pedidoMexico = new PedidoMexico();
        pedidoMexico.setImporteSinIVA(10000);
        pedidoMexico.calcularPrecioConIVA();
        pedidoMexico.visualiza();
        
        Pedidos pedidoEspaña = new PedidoEspaña();
        pedidoEspaña.setImporteSinIVA(10000);
        pedidoEspaña.calcularPrecioConIVA();
        pedidoEspaña.visualiza();
    }
}


package com.netec.pedidos;

public abstract class Pedidos {
   
    protected String pais;
    protected double importeSinIVA;
    protected double importeIVA;
    protected double importeConIVA;
    
    protected abstract void calcularIVA();
    
    public void calcularPrecioConIVA(){
        this.calcularIVA();
        importeConIVA = importeSinIVA + importeIVA;
    }
    
    public void setImporteSinIVA(double importeSinIVA){
        this.importeSinIVA = importeSinIVA;
    }
    
    public void visualiza(){
        System.err.println("Pedido " + this.pais);
        System.err.println("Importe sin IVA: " + importeSinIVA);
        System.err.println("IVA: " + importeIVA);
        System.err.println("Importe con IVA: " + importeConIVA);
    }
}

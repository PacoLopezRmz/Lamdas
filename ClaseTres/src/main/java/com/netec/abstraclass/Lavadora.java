
package com.netec.abstraclass;

public class Lavadora extends LineaBlanca {

    @Override
    public void tareaDomestica() {
        System.err.println("Lavar Ropa");
    }

    @Override
    public void encender() {
        System.err.println("Encendido Automatico");
    }

    @Override
    public void apagar() {
        System.err.println("Apagar cuando termine de lavar"); 
    }
    
}

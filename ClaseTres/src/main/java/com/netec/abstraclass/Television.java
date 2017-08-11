
package com.netec.abstraclass;

public class Television extends LineaBlanca{

    public ControlRemotoUniversal controlRemoto;
    
    @Override
    public void tareaDomestica() {
        System.err.println("Ver Netflix"); }

    @Override
    public void encender() {
        System.err.println("Encender como Telvision");
    }

    @Override
    public void apagar() {
        System.err.println("Apagar como television"); 
    }

    
}

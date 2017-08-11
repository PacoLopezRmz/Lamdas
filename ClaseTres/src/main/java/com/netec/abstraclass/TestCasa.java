
package com.netec.abstraclass;

public class TestCasa {
    public static void main(String[] args) {
        Electrodomestico television = new Television();
        Electrodomestico lavadora = new Lavadora();
         
       LineaBlanca lavadoraMabe = new Lavadora();
       LineaBlanca televisionEkt = new Television();
       
       TestCasa.validar(television);
       
       television.encender();
       television.apagar();
       television.medirEnergiaElectrica();
       
       lavadoraMabe.encender();
       lavadoraMabe.apagar();
    }
    public static void validar(Electrodomestico electroD){
        if(electroD instanceof Lavadora){
            Lavadora easy = (Lavadora)electroD;
            System.err.println("Si es una lavadora");
        }else{
            System.err.println("No es una lavadora");
        }
    }
}

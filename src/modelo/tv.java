/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class tv extends aparato{
    
 private String tamano;

    public tv(String tamano, double precio, int voltaje, double descuento) {
        super(precio, voltaje, descuento);
        this.tamano = tamano;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    
 
 
}

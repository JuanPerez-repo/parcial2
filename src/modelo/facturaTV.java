/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class facturaTV extends factura{
    
    private tv articuloTV;

    public facturaTV(tv articuloTV, int numero, double descuento) {
        super(numero, descuento);
        this.articuloTV = articuloTV;
    }

    public tv getArticuloTV() {
        return articuloTV;
    }

    public void setArticuloTV(tv articuloTV) {
        this.articuloTV = articuloTV;
    }

    @Override
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public double getDescuento() {
        return descuento;
    }

    @Override
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class facturaIPod extends factura{
    
    private iPod articuloIPod;

    public facturaIPod(iPod articuloIPod, int numero, double descuento) {
        super(numero, descuento);
        this.articuloIPod = articuloIPod;
    }

    public iPod getArticuloIPod() {
        return articuloIPod;
    }

    public void setArticuloIPod(iPod articuloIPod) {
        this.articuloIPod = articuloIPod;
    }

    @Override
    public int getNumero() {
        return numero;
    }

    @Override
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class facturaEquipo extends factura{
    
    private equipo articuloEquipo;

    public facturaEquipo(equipo articuloEquipo, int numero, double descuento) {
        super(numero, descuento);
        this.articuloEquipo = articuloEquipo;
    }

    public equipo getArticuloEquipo() {
        return articuloEquipo;
    }

    public void setArticuloEquipo(equipo articuloEquipo) {
        this.articuloEquipo = articuloEquipo;
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

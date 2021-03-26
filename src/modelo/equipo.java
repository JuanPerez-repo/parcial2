/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author sport
 */
public class equipo extends aparato{
    
    private int cantidadCDs;

    public equipo(int cantidadCDs, double precio, int voltaje, double descuento) {
        super(precio, voltaje, descuento);
        this.cantidadCDs = cantidadCDs;
    }

    public int getCantidadCDs() {
        return cantidadCDs;
    }

    public void setCantidadCDs(int cantidadCDs) {
        this.cantidadCDs = cantidadCDs;
    }
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import javax.swing.*;
import javax.swing.JOptionPane;


public class facturaEquipo extends factura{
    
    private equipo articuloEquipo;

    public facturaEquipo() {
       
    }

    public equipo getArticuloEquipo() {
        return articuloEquipo;
    }

    public void setArticuloEquipo(equipo articuloEquipo) {
        this.articuloEquipo = articuloEquipo;
    }

    
    public void establecer (int voltaje, equipo equipo, double precio){
        
        articuloEquipo = equipo;
        
        articuloEquipo.setPrecio(precio);
        
        articuloEquipo.setVoltaje(voltaje);
        
    }
    
    
    @Override
    public void imprimir(){
        
        JOptionPane.showMessageDialog(null,"Descuento: "+super.getDescuento()+" % "
                + "\n precio original: "+ articuloEquipo.getPrecio()
                //+"\n precio final: "+(articuloTV.calcularDescuento(super.getDescuento())
                + "\n voltaje: "+articuloEquipo.getVoltaje()
                + "\n tamaño: "+articuloEquipo.getCantidadCDs());
        
    }
  
    
    @Override
    public void capturar(){
        
        
    }
    //no sé con exactitud qué retornar
    
    
}

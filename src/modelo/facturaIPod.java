/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.*;


public class facturaIPod extends factura{
    
    private iPod articuloIPod;

    public facturaIPod() {
       
    }

    public iPod getArticuloIPod() {
        return articuloIPod;
    }

    public void setArticuloIPod(iPod articuloIPod) {
        this.articuloIPod = articuloIPod;
    }

    public void establecer(int voltaje, iPod ipod, double precio){
        
        articuloIPod = ipod;
        
        articuloIPod.setPrecio(precio);
        
        articuloIPod.setVoltaje(voltaje);
        
    }
    
    
    @Override
    public void imprimir(){
        
        JOptionPane.showMessageDialog(null,"Descuento del Ipod: "+super.getDescuento()+" % "
                + "\n precio original: "+ articuloIPod.getPrecio()
                //+"\n precio final: "+(articuloTV.calcularDescuento(super.getDescuento())
                + "\n voltaje: "+articuloIPod.getVoltaje()
                + "\n capacidad: "+articuloIPod.getCapacidad());
        
    }
    //no sé con exactitud qué retornar
    
    @Override
    public void capturar(){
        
        
    }
    //no sé con exactitud qué retornar
    
   
    
}

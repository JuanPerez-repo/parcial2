
package modelo;
import javax.swing.*;
import javax.swing.JOptionPane;


public class facturaEquipo extends factura{
    
    private equipo articuloEquipo;

    public facturaEquipo() {
       
    }



    
    public void establecer (int voltaje, equipo equipo, double precio){
        
        articuloEquipo = equipo;
        
        articuloEquipo.setPrecio(precio);
        
        articuloEquipo.setVoltaje(voltaje);
        
    }
    
    
    @Override
    public void imprimir(){
        
        JOptionPane.showMessageDialog(null,"Aparato comprado: Equipo de sonidos\nNúmero de factura: "+super.getNumero()
                + "\n Descuento: "+super.getDescuento()+" % "
                + "\n precio original: "+ articuloEquipo.getPrecio()
                + "\n precio final: "+articuloEquipo.calcularDescuento(super.getDescuento())
                + "\n voltaje: "+articuloEquipo.getVoltaje()
                + "\n Cantidad de CD's: "+articuloEquipo.getCantidadCDs());
        
    }
  
    
    @Override
    public void capturar(){
        
        
    }
    
    
    
}

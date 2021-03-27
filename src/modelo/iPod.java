
package modelo;

import javax.swing.JOptionPane;

public class iPod extends aparato{
    
    private String capacidad;

    public iPod() {
       
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    

    @Override
    public void imprimir() {
        
        JOptionPane.showMessageDialog(null,"El Ipod tiene una capacidad de:"+capacidad);
        
    }
    //no sé con exactitud qué retornar

    @Override
    public void capturar() {
       
    }
    //no sé con exactitud qué retornar
    
     
    
}

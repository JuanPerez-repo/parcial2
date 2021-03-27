package modelo;
import javax.swing.*;
public class equipo extends aparato{
    
    private int cantidadCDs;

    public equipo() {
        
    }

    public int getCantidadCDs() {
        return cantidadCDs;
    }

    public void setCantidadCDs(int cantidadCDs) {
        this.cantidadCDs = cantidadCDs;
    }

    
    @Override
    public void imprimir() {
         
        JOptionPane.showMessageDialog(null,"El equipo de sonido puede almacenar"+cantidadCDs+" CDs ");
        
    }

    @Override
    public void capturar() {
       
    }
    
     
    
    
}

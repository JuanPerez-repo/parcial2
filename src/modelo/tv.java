
package modelo;
import javax.swing.*;

public class tv extends aparato{
    
 private String tamano;

    public tv() {
        
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }


    @Override
    public void imprimir() {
         
        JOptionPane.showMessageDialog(null,"El televisor tiene un tamaño de: "+tamano); 
        
    }
    

    @Override
    public void capturar() {
        
    }
    
    
     
    
    
    }

    

   
   

   
    
    

    
 


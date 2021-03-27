
package modelo;


public class factura {
    
    private int numero;
    private double descuento;

     public factura() {
       
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    public void establecer(int numero, double descuento){
        
        this.numero = numero;
        
        this.descuento = descuento;
        
    }
    
    public void capturar(){} //mucho ojo, puede que no agarre todos los tipos de datos por ser un metodo tipo String 
    
    public void imprimir(){} //mucho ojo, puede que no agarre todos los tipos de datos por ser un metodo tipo String 
    
   
    
}

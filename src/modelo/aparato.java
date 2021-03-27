
package modelo;


public class aparato {
    
    private double precio;
    private int voltaje;
    private double descuento;

    public aparato() {

    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    public double calcularDescuento (double descuento){ 
        
        if (descuento <= 0){
            return precio;
        } else {
        double desc = descuento/100;
        precio = precio * desc;
        
        return precio;
        }
        
    }
    
    public void establecer(int voltaje, double precio){
                
        this.voltaje = voltaje;
        
        this.precio = precio;
        
    }
    
    public void imprimir(){}; //mucho ojo, puede que no agarre todos los tipos de datos por ser un metodo tipo String 
        
    public void capturar(){}; //mucho ojo, puede que no agarre todos los tipos de datos por ser un metodo tipo String    
    
    
}


package modelo;


public abstract class aparato {
    
    private double precio;
    private int voltaje;
    private double descuento;

    public aparato(double precio, int voltaje, double descuento) {
        this.precio = precio;
        this.voltaje = voltaje;
        this.descuento = descuento;
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
    
    public double calcularDescuento (){ 
        
        if (descuento <= 0){
            return precio;
        } else {
        double desc = descuento/100;
        precio = precio / desc;
        
        return precio;
        }
        

    }
    
    
}

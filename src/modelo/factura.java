
package modelo;


public abstract class factura {
    
    protected int numero;
    protected double descuento;

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
    
    public abstract String capturar(); //mucho ojo, puede que no agarre todos los tipos de datos por ser un metodo tipo String 
    
    public abstract String imprimir(); //mucho ojo, puede que no agarre todos los tipos de datos por ser un metodo tipo String 
    
    public factura(int numero, double descuento) {
        this.numero = numero;
        this.descuento = descuento;
    }
    
}


package modelo;
import javax.swing.*;

public class facturaTV extends factura{
    
    private tv articuloTV;

    public facturaTV() {
        
    }
    
    public void establecer(int voltaje, tv tv , double precio){
        
        articuloTV = tv;
        
        articuloTV.setPrecio(precio);
        
        articuloTV.setVoltaje(voltaje);
        
        
        
    }
    
    @Override
    public void imprimir(){
        
        JOptionPane.showMessageDialog(null,"Descuento: "+super.getDescuento()+" % "
                + "\n precio original: "+ articuloTV.getPrecio()
                //+"\n precio final: "+(articuloTV.calcularDescuento(super.getDescuento())
                + "\n voltaje: "+articuloTV.getVoltaje()
                + "\n tamaño: "+articuloTV.getTamano());
    }

     @Override
    public void capturar(){
        
        
    } //no sé con exactitud qué retornar
    
    public tv getArticuloTV() {
        return articuloTV;
    }

    public void setArticuloTV(tv articuloTV) {
        this.articuloTV = articuloTV;
    }

}

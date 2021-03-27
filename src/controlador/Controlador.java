/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.*;
import vista.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controlador implements ActionListener{
    
    private View vista;
    private aparato aparato;
    private factura factura;
    private facturaEquipo facEq;
    private facturaIPod facIPod;
    private facturaTV facTV;
    private equipo equipo;
    private iPod iPod;
    private tv TV;

    public Controlador(View vista, aparato aparato, factura factura, facturaEquipo facEq, facturaIPod facIPod, facturaTV facTV, equipo equipo, iPod iPod, tv TV) {
        this.vista = vista;
        this.aparato = aparato;
        this.factura = factura;
        this.facEq = facEq;
        this.facIPod = facIPod;
        this.facTV = facTV;
        this.equipo = equipo;
        this.iPod = iPod;
        this.TV = TV;
        this.vista.jBotonComprar.addActionListener(this);
    }
    
        public void iniciar(){
        vista.setTitle("Venta de aparatos");
        vista.setLocationRelativeTo(null);
    }
        
        public void actionPerformed(ActionEvent e){
        
        if (e.getSource() == vista.jBotonComprar){ //ccambiarle aqui las acciones y los campos que hay que utilizar xdd
        modelo.setPesos(Double.parseDouble(vista.jTextPeso.getText()));
        modelo.convertirDolares();
        vista.jTextDolar.setText(String.valueOf(modelo.getDolares()));
        }else{
            
            switch(vista.jComboEquipo.getSelectedIndex()){
                
                case 0: 
                 
                    equipo.setCantidadCDs(Integer.parseInt(vista.));
                    
                
            }
            
        }


    }
    
}

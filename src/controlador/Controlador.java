
package controlador;

import modelo.*;
import vista.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

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

    public void iniciar() {
        vista.setTitle("Venta de aparatos");
        vista.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.jBotonComprar) {

            switch (vista.jComboEquipo.getSelectedIndex()) {

                case 0:

                    equipo.setCantidadCDs(Integer.parseInt(vista.jTextCantidadCDs.getText()));
                    facEq.setNumero((int) Math.floor(Math.random() * (1000) + 1));
                    facEq.setDescuento(Double.parseDouble(vista.jTextDescuento.getText()));
                    facEq.establecer(Integer.parseInt(vista.jComboVoltaje.getSelectedItem().toString()), equipo, Double.parseDouble(vista.jTextPrecio.getText()));
                    facEq.imprimir();
                    break;

                case 1:

                    iPod.setCapacidad(vista.jComboCapacidadipod.getSelectedItem().toString());
                    facIPod.setNumero((int) Math.floor(Math.random() * (1000) + 1));
                    facIPod.setDescuento(Double.parseDouble(vista.jTextDescuento.getText()));
                    facIPod.establecer(Integer.parseInt(vista.jComboVoltaje.getSelectedItem().toString()), iPod, Double.parseDouble(vista.jTextPrecio.getText()));
                    facIPod.imprimir();
                    break;

                case 2:

                    TV.setTamano(vista.jComboTamanoTV.getSelectedItem().toString());
                    facTV.setNumero((int) Math.floor(Math.random() * (1000) + 1));
                    facTV.setDescuento(Double.parseDouble(vista.jTextDescuento.getText()));
                    facTV.establecer(Integer.parseInt(vista.jComboVoltaje.getSelectedItem().toString()), TV, Double.parseDouble(vista.jTextPrecio.getText()));
                    facTV.imprimir();
                    break;
                

            }
        }

    }

}

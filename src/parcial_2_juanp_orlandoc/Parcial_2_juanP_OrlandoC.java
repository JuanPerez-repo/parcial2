
package parcial_2_juanp_orlandoc;

import modelo.*;
import vista.View;
import controlador.Controlador;


public class Parcial_2_juanP_OrlandoC {


    public static void main(String[] args) {
        
        View vista = new View();
        tv tv = new tv();
        iPod ipod = new iPod();
        equipo equipo = new equipo();
        facturaTV facTV = new facturaTV();
        facturaIPod facIPod = new facturaIPod();
        facturaEquipo facEquipo = new facturaEquipo();
        
        Controlador control = new Controlador(vista, equipo, facTV, facEquipo, facIPod, facTV, equipo, ipod, tv);
        control.iniciar();
        vista.setVisible(true);
        
        
        
    }
    
}

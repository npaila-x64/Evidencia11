package controlador;

import vista.MarcoPrincipal;
import vista.VentanaMenu;

public class ControladorTrabajador {

    private MarcoPrincipal vista;
    private VentanaMenu menu;

    public void iniciar() {
        vista = new MarcoPrincipal(this);
        menu = new VentanaMenu(this);
        vista.agregarMenu(menu);
        vista.setVisible(true);
    }

    public void salidaFueSolicitada() {
        this.vista.dispose();
    }

    public void editarTrabajadorFueSolicitada() {

    }

    public void mostrarTrabajadoresFueSolicitada() {

    }
}
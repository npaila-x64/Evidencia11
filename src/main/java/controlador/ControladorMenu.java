package controlador;

import vista.PanelMenu;

public class ControladorMenu {

    private final PanelMenu vista;
    private final ControladorAplicacion controlador;

    public ControladorMenu(ControladorAplicacion controlador) {
        this.controlador = controlador;
        vista = new PanelMenu(this);
        this.controlador.agregarMenu(vista);
    }

    public void iniciar() {
        controlador.mostrarMenu();
    }

    public void salidaFueSolicitada() {
        controlador.cerrar();
    }

    public void agregarTrabajadorFueSolicitada() {
        controlador.iniciarEditor();
    }

    public void mostrarTrabajadoresFueSolicitada() {
        controlador.iniciarMostrador();
    }
}

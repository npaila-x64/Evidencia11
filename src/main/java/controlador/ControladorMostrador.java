package controlador;

import vista.PanelEditor;
import vista.PanelMostrador;

public class ControladorMostrador {

    private final ControladorAplicacion controlador;
    private final PanelMostrador vista;

    public ControladorMostrador(ControladorAplicacion controlador) {
        this.controlador = controlador;
        vista = new PanelMostrador(this);
        this.controlador.agregarMostrador(vista);
    }

}

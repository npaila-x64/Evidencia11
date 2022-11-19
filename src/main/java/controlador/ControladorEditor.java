package controlador;

import vista.PanelEditor;

public class ControladorEditor {

    private final ControladorAplicacion controlador;
    private final PanelEditor vista;

    public ControladorEditor(ControladorAplicacion controlador) {
        this.controlador = controlador;
        vista = new PanelEditor(this);
        this.controlador.agregarEditor(vista);
    }

    public void iniciar() {
        controlador.mostrarEditor();
    }

    public void mostrarMenu() {
        controlador.mostrarMenu();
    }
}

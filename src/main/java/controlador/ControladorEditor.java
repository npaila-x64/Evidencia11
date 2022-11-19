package controlador;

import modelo.Trabajador;
import vista.PanelEditor;

public class ControladorEditor {

    private final ControladorAplicacion controlador;
    private final PanelEditor vista;
    private Trabajador trabajador;

    public ControladorEditor(ControladorAplicacion controlador) {
        this.controlador = controlador;
        vista = new PanelEditor(this);
        this.controlador.agregarEditor(vista);
    }

    public void iniciar() {
        controlador.mostrarEditor();
    }

    public void volverHaSidoSolicitado() {
        controlador.mostrarMenuPrincipal();
        vista.limpiar();
    }

    public void agregarTrabajadorHaSidoSolicitado() {
        if (vista.getNombre().isBlank()) {
            vista.mostrarNombreNoPuedeEstarVacio();
        } else {
            agregarNuevoTrabajador();
        }
    }

    private void agregarNuevoTrabajador() {
        trabajador = new Trabajador();
        trabajador.setNombre(vista.getNombre());
        trabajador.setApellido(vista.getApellido());
        trabajador.setRut(vista.getRut());
        trabajador.setIsapre(vista.getIsapre());
        trabajador.setFonasa(vista.getFonasa());

        controlador.agregarTrabajador(trabajador);

        vista.limpiar();
        vista.mostrarTrabajadorAgregadoConExito();
    }
}

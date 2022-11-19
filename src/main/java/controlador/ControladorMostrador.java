package controlador;

import modelo.Trabajador;
import vista.PanelMostrador;

public class ControladorMostrador {

    private final ControladorAplicacion controlador;
    private final PanelMostrador vista;

    public ControladorMostrador(ControladorAplicacion controlador) {
        this.controlador = controlador;
        vista = new PanelMostrador(this);
        this.controlador.agregarMostrador(vista);
    }

    public void iniciar() {
        controlador.mostrarMostrador();
        cargarListaDeTrabajadores();
    }

    private void cargarListaDeTrabajadores() {
        vista.cargarListaDeTrabajadores(controlador.getTrabajadores());
    }

    public void volverHaSidoSolicitado() {
        controlador.mostrarMenuPrincipal();
        vista.limpiar();
    }

    public void cargarTrabajadorHaSidoSolicitado(Object nombre) {
        vista.cargarTrabajador(controlador.getTrabajadores()
                .stream()
                .filter(t -> t.getNombre().equals(nombre))
                .findFirst().orElse(new Trabajador()));
    }
}

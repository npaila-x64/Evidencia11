package controlador;

import modelo.Trabajador;
import vista.Marco;
import vista.PanelEditor;
import vista.PanelMenu;
import vista.PanelMostrador;

import java.util.ArrayList;
import java.util.List;

public class ControladorAplicacion {

    private Marco vista;
    private ControladorMenu menu;
    private ControladorEditor editor;
    private ControladorMostrador mostrador;
    private List<Trabajador> listaDeTrabajadores;

    public ControladorAplicacion() {
        cargarTrabajadores();
    }

    private void cargarTrabajadores() {
        listaDeTrabajadores = new ArrayList<>();
    }

    public void agregarTrabajador(Trabajador trabajador) {
        listaDeTrabajadores.add(trabajador);
    }

    public void iniciar() {
        vista = new Marco();
        crearControladores();
        menu.iniciar();
        vista.setVisible(true);
    }

    private void crearControladores() {
        menu = new ControladorMenu(this);
        editor = new ControladorEditor(this);
        mostrador = new ControladorMostrador(this);
    }

    public void mostrarMenuPrincipal() {
        vista.mostrarMenu();
    }

    public void mostrarEditor() {
        vista.mostrarEditor();
    }

    public void mostrarMostrador() {
        vista.mostrarMostrador();
    }

    public void cerrar() {
        vista.dispose();
    }

    public void iniciarEditor() {
        editor.iniciar();
    }

    public void iniciarMostrador() {
        mostrador.iniciar();
    }

    public void agregarMenu(PanelMenu menu) {
        vista.agregarMenu(menu);
    }

    public void agregarEditor(PanelEditor editor) {
        vista.agregarEditor(editor);
    }

    public void agregarMostrador(PanelMostrador mostrador) {
        vista.agregarMostrador(mostrador);
    }

    public List<Trabajador> getTrabajadores() {
        return listaDeTrabajadores;
    }
}
package controlador;

import vista.Marco;
import vista.PanelEditor;
import vista.PanelMenu;
import vista.PanelMostrador;

public class ControladorAplicacion {

    private Marco vista;
    private ControladorMenu menu;
    private ControladorEditor editor;
    private ControladorMostrador mostrador;

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

    public void mostrarMenu() {
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

    public void agregarMenu(PanelMenu menu) {
        vista.agregarMenu(menu);
    }

    public void agregarEditor(PanelEditor editor) {
        vista.agregarEditor(editor);
    }

    public void agregarMostrador(PanelMostrador mostrador) {
        vista.agregarMostrador(mostrador);
    }
}
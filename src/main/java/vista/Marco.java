package vista;

import javax.swing.*;
import java.awt.*;

public class Marco extends JFrame {

    private Container panel;
    private final CardLayout cl;

    public Marco() {
        cl = new CardLayout();
        configurarMarco();
        configurarPanel();
    }

    private void configurarPanel() {
        panel = getContentPane();
        panel.setLayout(cl);
    }

    private void configurarMarco() {
        setTitle("Interfaz de Trabajador");
        setBounds(0, 0, 440, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void mostrarMenu() {
        cl.show(panel, "menu");
    }

    public void mostrarEditor() {
        cl.show(panel, "editor");
    }

    public void agregarEditor(PanelEditor editor) {
        panel.add("editor", editor);
    }

    public void agregarMenu(PanelMenu menu) {
        panel.add("menu", menu);
    }

    public void agregarMostrador(PanelMostrador mostrador) {
        panel.add("mostrador", mostrador);
    }

    public void mostrarMostrador() {
        cl.show(panel, "mostrador");
    }
}

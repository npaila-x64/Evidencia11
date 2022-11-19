package vista;

import controlador.ControladorTrabajador;

import javax.swing.*;
import java.awt.*;

public class MarcoPrincipal extends JFrame {

    private ControladorTrabajador controlador;
    private Container panel;
    private final CardLayout cl;

    public MarcoPrincipal(ControladorTrabajador controlador) {
        this.controlador = controlador;
        this.cl = new CardLayout();
        configurarMarco();
        configurarPanel();

    }

    private void configurarPanel() {
        panel = getContentPane();
        panel.setLayout(cl);
    }

    private void configurarMarco() {
        setTitle("Trabajadores");
        setBounds(0, 0, 440, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void agregarMenu(VentanaMenu menu) {
        panel.add("menu", menu);
        cl.show(this.panel, "menu");
    }
}

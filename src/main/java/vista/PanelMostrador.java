package vista;

import controlador.ControladorAplicacion;
import controlador.ControladorMostrador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelMostrador extends JPanel implements ActionListener {

    ControladorMostrador controlador;

    public PanelMostrador(ControladorMostrador controlador) {
        this.controlador = controlador;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

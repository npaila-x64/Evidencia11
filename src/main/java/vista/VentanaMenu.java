package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controlador.ControladorTrabajador;

public class VentanaMenu extends JPanel implements ActionListener {

    private JLabel titulo;
    private JButton salir;
    private JButton agregar;
    private JButton mostrar;
    private ControladorTrabajador controlador;

    public void setLoginVistaControlador(ControladorTrabajador controlador) {
        this.controlador = controlador;
    }

    public VentanaMenu(ControladorTrabajador controlador) {
        setLoginVistaControlador(controlador);
        crearComponentes();
        setVisible(true);
    }

    private void crearComponentes() {
        configurarPanel();
        crearTitulo();
        crearBotonAgregarTrabajador();
        crearBotonMostrarTrabajadores();
        crearBotonSalir();
    }

    private void configurarPanel() {
        this.setBackground(Color.WHITE);
        this.setLayout(null);
    }

    private void crearTitulo() {
        titulo = new JLabel("Menú Trabajador");
        titulo.setFont(new Font("Arial", Font.BOLD, 36));
        titulo.setSize(290, 41);
        titulo.setLocation(68, 70);
        this.add(titulo);
    }

    private void crearBotonMostrarTrabajadores() {
        mostrar = new JButton("Mostrar Trabajadores");
        mostrar.addActionListener(this);
        mostrar.setFont(new Font("Arial", Font.PLAIN, 15));
        mostrar.setLocation(120, 262);
        mostrar.setSize(186, 42);
        mostrar.setFocusable(false);

        mostrar.setBackground(Color.BLACK);
        mostrar.setForeground(Color.WHITE);

        this.add(mostrar);
    }

    private void crearBotonAgregarTrabajador() {
        agregar = new JButton("Agregar Trabajador");
        agregar.addActionListener(this);
        agregar.setFont(new Font("Arial", Font.PLAIN, 15));
        agregar.setLocation(120, 179);
        agregar.setSize(186, 42);
        agregar.setFocusable(false);

        agregar.setBackground(Color.BLACK);
        agregar.setForeground(Color.WHITE);

        this.add(agregar);
    }

    private void crearBotonSalir() {
        salir = new JButton("Salir");
        salir.addActionListener(this);
        salir.setFont(new Font("Arial", Font.PLAIN, 15));
        salir.setSize(110, 32);
        salir.setLocation(160, 373);
        salir.setFocusable(false);

        salir.setBackground(Color.BLACK);
        salir.setForeground(Color.WHITE);

        this.add(salir);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == salir) {
            this.controlador.salidaFueSolicitada();
        }
        if (e.getSource() == agregar) {
            this.controlador.editarTrabajadorFueSolicitada();
        }
        if (e.getSource() == mostrar) {
            this.controlador.mostrarTrabajadoresFueSolicitada();
        }
    }
}

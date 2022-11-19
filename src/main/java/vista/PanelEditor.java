package vista;

import controlador.ControladorEditor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelEditor extends JPanel implements ActionListener {

    private JLabel titulo;
    private JLabel enombre;
    private JLabel eapellido;
    private JLabel erut;
    private JLabel eisapre;
    private JLabel efonasa;
    private JTextField trut;
    private JTextField tnombre;
    private JTextField tapellido;
    private JTextField tisapre;
    private JTextField tfonasa;
    private JButton volver;
    private JButton agregar;
    private ControladorEditor controlador;

    public PanelEditor(ControladorEditor controlador) {
        this.controlador = controlador;
        crearComponentes();
    }

    private void crearComponentes() {
        configurarPanel();
        crearTitulo();
        crearBotonAgregarTrabajador();
        crearBotonVolver();
        crearEtiquetas();
        crearCamposDeTexto();
    }

    private void crearEtiquetas() {
        crearEtiquetaNombre();
        crearEtiquetaApellido();
        crearEtiquetaRut();
        crearEtiquetaIsapre();
        crearEtiquetaFonasa();
    }

    private void crearCamposDeTexto() {
        crearCampoDeTextoNombre();
        crearCampoDeTextoApellido();
        crearCampoDeTextoRut();
        crearCampoDeTextoIsapre();
        crearCampoDeTextoFonasa();
    }

    private void configurarPanel() {
        this.setBackground(Color.WHITE);
        this.setLayout(null);
    }

    private void crearTitulo() {
        titulo = new JLabel("Agregar Trabajador");
        titulo.setFont(new Font("Arial", Font.BOLD, 36));
        titulo.setLocation(46, 48);
        titulo.setSize(334, 41);
        this.add(titulo);
    }

    private void crearBotonAgregarTrabajador() {
        agregar = new JButton("Agregar");
        agregar.addActionListener(this);
        agregar.setFont(new Font("Arial", Font.PLAIN, 15));
        agregar.setLocation(220, 384);
        agregar.setSize(130, 28);
        agregar.setFocusable(false);

        agregar.setBackground(Color.BLACK);
        agregar.setForeground(Color.WHITE);

        this.add(agregar);
    }

    private void crearBotonVolver() {
        volver = new JButton("Volver");
        volver.addActionListener(this);
        volver.setFont(new Font("Arial", Font.PLAIN, 15));
        volver.setLocation(74, 384);
        volver.setSize(130, 28);
        volver.setFocusable(false);

        volver.setBackground(Color.BLACK);
        volver.setForeground(Color.WHITE);

        this.add(volver);
    }

    private void crearEtiquetaNombre() {
        enombre = new JLabel("Nombre:");
        enombre.setFont(new Font("Arial", Font.PLAIN, 16));
        enombre.setLocation(74, 130);
        enombre.setSize(99, 19);
        this.add(enombre);
    }

    private void crearEtiquetaApellido() {
        eapellido = new JLabel("Apellido:");
        eapellido.setFont(new Font("Arial", Font.PLAIN, 16));
        eapellido.setLocation(74, 175);
        eapellido.setSize(99, 19);
        this.add(eapellido);
    }

    private void crearEtiquetaRut() {
        erut = new JLabel("Rut:");
        erut.setFont(new Font("Arial", Font.PLAIN, 16));
        erut.setLocation(74, 222);
        erut.setSize(99, 19);
        this.add(erut);
    }

    private void crearEtiquetaIsapre() {
        eisapre = new JLabel("Isapre:");
        eisapre.setFont(new Font("Arial", Font.PLAIN, 16));
        eisapre.setLocation(74, 266);
        eisapre.setSize(99, 19);
        this.add(eisapre);
    }

    private void crearEtiquetaFonasa() {
        efonasa = new JLabel("Fonasa:");
        efonasa.setFont(new Font("Arial", Font.PLAIN, 16));
        efonasa.setLocation(74, 310);
        efonasa.setSize(99, 19);
        this.add(efonasa);
    }

    private void crearCampoDeTextoNombre() {
        tnombre = new JTextField();
        tnombre.setFont(new Font("Arial", Font.PLAIN, 15));
        tnombre.setLocation(178, 130);
        tnombre.setSize(174, 24);
        tnombre.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add(tnombre);
    }

    private void crearCampoDeTextoApellido() {
        tapellido = new JTextField();
        tapellido.setFont(new Font("Arial", Font.PLAIN, 15));
        tapellido.setLocation(178, 174);
        tapellido.setSize(174, 24);
        tapellido.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add(tapellido);
    }

    private void crearCampoDeTextoRut() {
        trut = new JTextField();
        trut.setFont(new Font("Arial", Font.PLAIN, 15));
        trut.setLocation(178, 221);
        trut.setSize(174, 24);
        trut.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add(trut);
    }

    private void crearCampoDeTextoIsapre() {
        tisapre = new JTextField();
        tisapre.setFont(new Font("Arial", Font.PLAIN, 15));
        tisapre.setLocation(178, 264);
        tisapre.setSize(174, 24);
        tisapre.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add(tisapre);
    }

    private void crearCampoDeTextoFonasa() {
        tfonasa = new JTextField();
        tfonasa.setFont(new Font("Arial", Font.PLAIN, 15));
        tfonasa.setLocation(178, 308);
        tfonasa.setSize(174, 24);
        tfonasa.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add(tfonasa);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == volver) {
            controlador.mostrarMenu();
        }
    }
}

package vista;

import controlador.ControladorMostrador;
import modelo.Trabajador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelMostrador extends JPanel implements ActionListener {

    private JComboBox ctrabajadores;
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
    ControladorMostrador controlador;

    public PanelMostrador(ControladorMostrador controlador) {
        this.controlador = controlador;
        crearComponentes();
    }

    private void crearComponentes() {
        configurarPanel();
        crearTitulo();
        crearBotonVolver();
        crearEtiquetas();
        crearCamposDeTexto();
        crearListaDeTrabajadores();
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
        titulo = new JLabel("Trabajadores");
        titulo.setFont(new Font("Arial", Font.BOLD, 36));
        titulo.setLocation(100, 31);
        titulo.setSize(226, 41);
        this.add(titulo);
    }

    private void crearBotonVolver() {
        volver = new JButton("Volver");
        volver.addActionListener(this);
        volver.setFont(new Font("Arial", Font.PLAIN, 15));
        volver.setLocation(148, 381);
        volver.setSize(130, 28);
        volver.setFocusable(false);

        volver.setBackground(Color.BLACK);
        volver.setForeground(Color.WHITE);

        this.add(volver);
    }

    private void crearListaDeTrabajadores() {
        ctrabajadores = new JComboBox<>();
        ctrabajadores.setFont(new Font("Arial", Font.PLAIN, 16));
        ctrabajadores.setLocation(103, 93);
        ctrabajadores.setSize(221, 25);
        ctrabajadores.setEditable(false);
        ctrabajadores.setFocusable(false);
        ctrabajadores.addActionListener(this);
        this.add(ctrabajadores);
    }

    private void crearEtiquetaNombre() {
        enombre = new JLabel("Nombre:");
        enombre.setFont(new Font("Arial", Font.PLAIN, 16));
        enombre.setLocation(75, 150);
        enombre.setSize(99, 19);
        this.add(enombre);
    }

    private void crearEtiquetaApellido() {
        eapellido = new JLabel("Apellido:");
        eapellido.setFont(new Font("Arial", Font.PLAIN, 16));
        eapellido.setLocation(74, 194);
        eapellido.setSize(99, 19);
        this.add(eapellido);
    }

    private void crearEtiquetaRut() {
        erut = new JLabel("Rut:");
        erut.setFont(new Font("Arial", Font.PLAIN, 16));
        erut.setLocation(74, 241);
        erut.setSize(99, 19);
        this.add(erut);
    }

    private void crearEtiquetaIsapre() {
        eisapre = new JLabel("Isapre:");
        eisapre.setFont(new Font("Arial", Font.PLAIN, 16));
        eisapre.setLocation(74, 285);
        eisapre.setSize(99, 19);
        this.add(eisapre);
    }

    private void crearEtiquetaFonasa() {
        efonasa = new JLabel("Fonasa:");
        efonasa.setFont(new Font("Arial", Font.PLAIN, 16));
        efonasa.setLocation(74, 328);
        efonasa.setSize(99, 19);
        this.add(efonasa);
    }

    private void crearCampoDeTextoNombre() {
        tnombre = new JTextField();
        tnombre.setFont(new Font("Arial", Font.PLAIN, 15));
        tnombre.setLocation(178, 148);
        tnombre.setSize(174, 24);
        tnombre.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        tnombre.setEditable(false);
        this.add(tnombre);
    }

    private void crearCampoDeTextoApellido() {
        tapellido = new JTextField();
        tapellido.setFont(new Font("Arial", Font.PLAIN, 15));
        tapellido.setLocation(178, 193);
        tapellido.setSize(174, 24);
        tapellido.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        tapellido.setEditable(false);
        this.add(tapellido);
    }

    private void crearCampoDeTextoRut() {
        trut = new JTextField();
        trut.setFont(new Font("Arial", Font.PLAIN, 15));
        trut.setLocation(178, 240);
        trut.setSize(174, 24);
        trut.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        trut.setEditable(false);
        this.add(trut);
    }

    private void crearCampoDeTextoIsapre() {
        tisapre = new JTextField();
        tisapre.setFont(new Font("Arial", Font.PLAIN, 15));
        tisapre.setLocation(178, 283);
        tisapre.setSize(174, 24);
        tisapre.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        tisapre.setEditable(false);
        this.add(tisapre);
    }

    private void crearCampoDeTextoFonasa() {
        tfonasa = new JTextField();
        tfonasa.setFont(new Font("Arial", Font.PLAIN, 15));
        tfonasa.setLocation(178, 327);
        tfonasa.setSize(174, 24);
        tfonasa.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        tfonasa.setEditable(false);
        this.add(tfonasa);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == volver) {
            controlador.volverHaSidoSolicitado();
        }
        if (e.getSource() == ctrabajadores) {
            controlador.cargarTrabajadorHaSidoSolicitado(ctrabajadores.getSelectedItem());
        }
    }



    public void cargarListaDeTrabajadores(java.util.List<Trabajador> trabajadores) {
        for (Trabajador t : trabajadores) {
            ctrabajadores.addItem(t.getNombre());
        }
    }

    public void cargarTrabajador(Trabajador trabajador) {
        tnombre.setText(trabajador.getNombre());
        tapellido.setText(trabajador.getApellido());
        trut.setText(trabajador.getRut());
        tfonasa.setText(trabajador.getFonasa());
        tisapre.setText(trabajador.getIsapre());
    }

    public void limpiar() {
        ctrabajadores.removeAllItems();
        trut.setText("");
        tnombre.setText("");
        tapellido.setText("");
        tisapre.setText("");
        tfonasa.setText("");
    }
}

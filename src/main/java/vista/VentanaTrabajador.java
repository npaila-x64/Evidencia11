package vista;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VentanaTrabajador {

    public void iniciar() {
        mostrarTitulo();
        pedirOpciones();
        mostrarSaliendo();
    }

    private void mostrarSaliendo() {
        System.out.println("Saliendo de la sesión...");
    }

    private void pedirOpciones() {
        while (true) {
            mostrarOpciones();
            int opcion = pedirOpcionHasta(4);
            switch (opcion) {
                case 0 -> {return;}
                case 1 -> mostrarNombre();
                case 2 -> mostrarRut();
                case 3 -> mostrarIsapre();
                case 4 -> mostrarFonasa();
            }
        }
    }

    private void mostrarFonasa() {

    }

    private void mostrarIsapre() {

    }

    private void mostrarRut() {

    }

    private void mostrarNombre() {

    }

    private void mostrarTitulo() {
        System.out.println("¡Bienvenido a la consola de edición del trabajador!");
    }

    private void mostrarOpciones() {
        System.out.println("Escriba");
        System.out.println("[1] para mostrar nombre y apellido");
        System.out.println("[2] para mostrar rut");
        System.out.println("[3] para mostrar isapre");
        System.out.println("[4] para mostrar fonasa");
        System.out.println("Para salir escriba [0]");
    }

    private static int pedirValorEnteroEnIntervalo(int limite) throws InputMismatchException {
        int valor = new Scanner(System.in).nextInt();
        if (valor < 0 || valor > limite) {
            throw new InputMismatchException("El parámetro dado sobrepasa el límite");
        }
        return valor;
    }

    private static int pedirOpcionHasta(int limite) {
        System.out.print("> ");
        try {
            return pedirValorEnteroEnIntervalo(limite);
        } catch (InputMismatchException e) {
            mostrarOpcionInvalida();
            return pedirOpcionHasta(limite);
        }
    }

    private static void mostrarOpcionInvalida() {
        System.out.print("Por favor, escoja una opción válida\n> ");
    }
}
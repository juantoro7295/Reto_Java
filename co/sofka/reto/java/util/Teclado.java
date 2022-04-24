package co.sofka.reto.java.util;

import java.util.Scanner;

public class Teclado {

    private final Scanner scanner;

    public Teclado() {
        scanner = new Scanner(System.in);
    }

    public int pedirRespuestaJugadorPorTeclado() {
        return scanner.nextInt();
    }

    public String pedirNombreJugadorPorTeclado() {
        return scanner.next();
    }

}

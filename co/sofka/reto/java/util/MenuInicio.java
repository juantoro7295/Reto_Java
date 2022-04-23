package co.sofka.reto.java.util;

public class MenuInicio extends Imprimir {
    private static final String TITULO_JUEGO = "*** JUEGO PREGUNTAS ***";
    private static final String JUGAR = "1) Jugar";
    private static final String HISTORIAL = "2) Historial";
    private static final String SALIR = "3) Salir";

    private static final String TITULO_DESEA_CONTINUAR = "*** ¿Desea continuar jugando? ***";
    private static final String SI = "1) SI";
    private static final String NO = "2) NO";

    private static final String FIN_JUEGO = "Gracias por jugar";


    public String mostrarMenuDeInicio() {
        StringBuilder texto = new StringBuilder();
        texto.append(TITULO_JUEGO + "\n" +
                "---------------------------" + "\n" + JUGAR + "\n" + HISTORIAL + "\n" + SALIR);
        return texto.toString();
    }

    public String mostrarDeseaContinuar() {
        StringBuilder texto = new StringBuilder();
        texto.append(TITULO_DESEA_CONTINUAR + "\n" +
                "---------------------------" + "\n" + SI + "\n" + NO);
        return texto.toString();
    }

    public String mostrarFinDelJuego() {
        return FIN_JUEGO;
    }


}

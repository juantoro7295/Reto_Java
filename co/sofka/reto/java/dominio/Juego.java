package co.sofka.reto.java.dominio;

import co.sofka.reto.java.util.Imprimir;
import co.sofka.reto.java.util.MenuInicio;
import co.sofka.reto.java.util.Teclado;


public class Juego extends Imprimir {
    private boolean continuo;

    PreguntasDatos preguntasDatos;
    Jugador jugador;
    Ronda ronda;

    MenuInicio menuInicio = new MenuInicio();

    public Juego() {
        this.continuo = true;
        this.continuarJugando = true;
        preguntasDatos = new PreguntasDatos();
        jugador = new Jugador("");
        ronda = new Ronda();

    }


    //  orden cronologico # parte 1
    public void continuarMenu(Teclado teclado) {

        do {
            imprimirMesaje(menuInicio.mostrarMenuDeInicio());
            queOpcionEligioEnElMenu(teclado);

        } while (continuo);

    }

    public void queOpcionEligioEnElMenu(Teclado teclado) {
        switch (teclado.pedirRespuestaJugadorPorTeclado()) {
            case 1:
                //pedir el nombre del jugador
                crearJugadorJuego(teclado);
                break;
            case 2:
                //mostrar puntaje y jugador
                break;
            case 3:
                this.continuo = false;
                break;
            default:
                imprimirMesaje("¡Parametro Invalido!");
                break;

        }

    }

    public void crearJugadorJuego(Teclado teclado) {
        imprimirMesaje("---------------------------\nIngresa tú nombre:");
        jugador.setNombre(teclado.pedirNombreJugadorPorTeclado());
    }

    public boolean validarPreguntaMostradaJuego(Teclado teclado) {
        boolean respuestaCorrectaJugador = false;
        if (preguntasDatos.getPreguntas().get(ronda.getEscogerPregunta()).getCorrecta() == teclado.pedirRespuestaJugadorPorTeclado()) {
            //aqui podemos subir puntaje
            //gatillo para salirnos del juego
            return respuestaCorrectaJugador = true;
        }
        return respuestaCorrectaJugador;
    }


    private boolean continuarJugando;

    public void opcionDelMenuContinuar(Teclado teclado) {
        switch (teclado.pedirRespuestaJugadorPorTeclado()) {
            case 1:
                //seguir en juego
                //pasar siguiente ronda
                break;
            case 2:
                this.continuarJugando = false;
                //guardar puntaje jugador en el historial
                break;
            default:
                imprimirMesaje("¡Parametro Invalido!");
                break;

        }

    }

    public void deseaContinuarMenu(Teclado teclado) {

        do {
            imprimirMesaje(menuInicio.mostrarDeseaContinuar());
            opcionDelMenuContinuar(teclado);
        } while (continuarJugando);
    }


}

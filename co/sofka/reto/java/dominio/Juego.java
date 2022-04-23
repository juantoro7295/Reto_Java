package co.sofka.reto.java.dominio;

import co.sofka.reto.java.util.Imprimir;
import co.sofka.reto.java.util.MenuInicio;
import co.sofka.reto.java.util.Teclado;


public class Juego extends Imprimir {
    private int respuestaJugadorPregunta;
    private boolean continuo;
    private boolean continuarJugando;
    private boolean respondioBien;

    PreguntasDatos preguntasDatos;
    Jugador jugador;
    Ronda ronda;

    Historial historial;

    MenuInicio menuInicio = new MenuInicio();

    public Juego() {
        this.continuo = true;
        this.continuarJugando = true;
        this.respondioBien = true;
        this.respuestaJugadorPregunta = -1;
        preguntasDatos = new PreguntasDatos();
        jugador = new Jugador("", 0);
        ronda = new Ronda();
        historial = new Historial();

    }



    public boolean crearJugadorJuego(Teclado teclado) {
        imprimirMesaje("---------------------------\nIngresa tú nombre:");
        jugador.setNombre(teclado.pedirNombreJugadorPorTeclado());
        return true;
    }

    public void queOpcionEligioEnElMenu(Teclado teclado) {
        switch (teclado.pedirRespuestaJugadorPorTeclado()) {
            case 1:
                //jugar
                deseaContinuarMenu(teclado);
                this.continuo = false;
                break;
            case 2:
                //historial
                imprimirMesaje(historial.toString());
                break;
            case 3:
                //Salir
                this.continuo = false;
                break;
            default:
                //Parametro invalido
                imprimirMesaje("¡Parametro Invalido!");
                break;

        }
    }
    public void continuarMenu(Teclado teclado) {

        do {
            imprimirMesaje(menuInicio.mostrarMenuDeInicio());
            queOpcionEligioEnElMenu(teclado);

        } while (continuo);

    }

    // pedir y guardar el jugador

    //valida la pregunta mostrada
    public boolean validarPreguntaMostradaJuego(Teclado teclado) {
        boolean respuestaCorrectaJugador = false;
        if (preguntasDatos.getPreguntas().get(ronda.getEscogerPregunta()).getCorrecta() == respuestaJugadorPregunta) {
            return respuestaCorrectaJugador = true;
        }
        return respuestaCorrectaJugador;
    }

    //imprime el menu  desea continuar y verifica
    //sale despues de responder una pregunta correctamente
   // private boolean continuarJugando;

    public void opcionDelMenuContinuar(Teclado teclado) {
        switch (teclado.pedirRespuestaJugadorPorTeclado()) {
            case 1:
                //jugador responde SI
                this.continuarJugando = true;

                break;
            case 2:
                //Jugador responde NO
                this.continuarJugando = false;
                this.respondioBien = false;
                historial.getHistorialJugadores().add(jugador);
                imprimirMesaje(historial.toString());
                arranqueYControlDelJuego(teclado);
                break;
            default:
                //Jugador responde un parametro invalido
                imprimirMesaje("¡Parametro Invalido!");
                break;

        }

    }
    //boolean respondioBien = true;
    public void deseaContinuarMenu(Teclado teclado) {

        do {
            pedirMostrarYvalidarOpciones(teclado);
            if (this.respondioBien) {
                imprimirMesaje(menuInicio.mostrarDeseaContinuar());
                opcionDelMenuContinuar(teclado);
            }
            arranqueYControlDelJuego(teclado);

        } while (continuarJugando);
    }

    public void arranqueYControlDelJuego(Teclado teclado){
        if(!(this.respondioBien)){
            this.continuo = true;
            this.continuarJugando = true;
            this.respondioBien = true;
            continuarMenu(teclado);
        }



    }

    public void laPreguntaSeRespondeCorrectamente(Teclado teclado) {
        if (validarPreguntaMostradaJuego(teclado)) {
            jugador.setPuntaje(jugador.getPuntaje() + 100);
            imprimirMesaje("muy bien, respuesta correcta");
        }
    }


    public void laPreguntaSeRepondeIncorrectamente(Teclado teclado) {
        if (!validarPreguntaMostradaJuego(teclado)) {
            this.respondioBien = false;
            jugador.setPuntaje(0);
            imprimirMesaje(" UPSS, Respuesta incorrecta");
        }
    }

    public void pedirMostrarYvalidarOpciones(Teclado teclado) {
        ronda.mostrarPreguntaJuego();
        this.respuestaJugadorPregunta = teclado.pedirRespuestaJugadorPorTeclado() - 1;
        laPreguntaSeRespondeCorrectamente(teclado);
        laPreguntaSeRepondeIncorrectamente(teclado);
        //larespuestaNoConcuerdaConLasOpciones();
    }


//    public void larespuestaNoConcuerdaConLasOpciones() {
//        if (this.respuestaJugadorPregunta != 0 || this.respuestaJugadorPregunta != 1 || this.respuestaJugadorPregunta != 2 || this.respuestaJugadorPregunta != 3) {
//            imprimirMesaje("joven recuerda utilizar como respuesta 1 2 3 4 ");
//
//        }

//    }


}

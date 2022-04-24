package co.sofka.reto.java.dominio;
import co.sofka.reto.java.util.Imprimir;
import co.sofka.reto.java.util.MenuInicio;
import co.sofka.reto.java.util.Teclado;
import java.io.IOException;

public class Juego extends Imprimir {

    //clases necesarias
    MenuInicio menuInicio;
    Teclado teclado;
    Ronda ronda;
    PreguntasDatos preguntasDatos;
    Jugador jugador;
    Historial historial;

    //variables necesarias
    private int respuestaDelJugador;
    private int puntaje;
    private int contadorPreguntas;
    private boolean deseaContinuar;

    public Juego() throws IOException {
        //instancias
        menuInicio = new MenuInicio();
        teclado = new Teclado();
        ronda = new Ronda();
        preguntasDatos = new PreguntasDatos();
        jugador = new Jugador("", 0);
        historial = new Historial();
        //variables

    }

    //Menu Principal
    public void menuInicioJuego()  {
        imprimirMesaje(menuInicio.mostrarMenuDeInicio());
        switch (teclado.pedirRespuestaJugadorPorTeclado()) {
            case 1:
                //Jugar
                //pide el nombre del jugador
                crearJugadorJuego(teclado);
                //iniciar a pedir preguntas
                unificadorDeMostraryvalidarRondaPreguntas();
                unificadorFinalizaElJuego();
                break;
            case 2:
                //Historial
                mostrarElHistorial();
                break;
            case 3:
                //Salir
                System.exit(0);
                break;
            default:
                //Parámetro no valido
                break;
        }
    }

    //Menu preguntando si desea continuar jugando
    public void menuDeseaContinuarJugando() {
        imprimirMesaje(menuInicio.mostrarDeseaContinuar());
        switch (teclado.pedirRespuestaJugadorPorTeclado()) {
            case 1:
                //Respuesta SI
                this.deseaContinuar = true;
                break;
            case 2:
                //Respuesta No
                this.deseaContinuar = false;
                break;
            default:
                //Parámetro no valido
                break;
        }
    }

    //Pedir respuesta correcta

    public int obtenerRespuestaCorrecta() {
        return preguntasDatos.getPreguntas().get(ronda.getEscogerPregunta()).getCorrecta();
    }

    //Pedir respuesta jugador
    public int obtenerRespuestaDelJugador() {
        this.respuestaDelJugador = teclado.pedirRespuestaJugadorPorTeclado();
        return this.respuestaDelJugador;
    }

    //Verifica si la respuesta del jugador es correcta, si es verdadero le suma puntaje
    public boolean verificarSiLaRespuestaDelJugadorEsCorrecta() {
        if (obtenerRespuestaCorrecta() == obtenerRespuestaDelJugador() - 1) {
            //subir puntaje
            this.puntaje = puntaje + 100;
            return true;
        } else {
            return false;
        }
    }
    //solicita un jugador y lo guarda
    public void crearJugadorJuego(Teclado teclado) {
        imprimirMesaje("---------------------------\nIngresa tú nombre:");
        jugador.setNombre(teclado.pedirNombreJugadorPorTeclado());
    }

    //le agrega el puntaje que gano durante la ronda
    public void agregaElPuntajeQueObtuvoEnElJuego() {
        jugador.setPuntaje(this.puntaje);
    }
    //Este método permite unificar el mostrar pregunta, validar preguntas y validar la ronda
    public void unificadorDeMostraryvalidarRondaPreguntas(){
        do {
            //pinta la pregunta en la consola
            ronda.mostrarPreguntaJuego();
            //validación y acción de la respuesta del jugador
            if (verificarSiLaRespuestaDelJugadorEsCorrecta()) {
                this.contadorPreguntas += 1;
                imprimirMesaje(menuInicio.notificarRespuestaCorrecta());
                if (this.contadorPreguntas <= 4) {
                    menuDeseaContinuarJugando();
                }
            } else {
                imprimirMesaje(menuInicio.notificarRespuestaIncorrecta());
                imprimirMesaje(menuInicio.notificarFinDelJuego());
                System.exit(0);
            }
        } while (this.contadorPreguntas <= 4 && this.deseaContinuar);

    }

    //Este método me imprime un mensaje, me le agrega el puntaje al usuario y le muestra sun nombre con su puntaje
    public void unificadorFinalizaElJuego(){
        imprimirMesaje("*** Ganaste ***");
        agregaElPuntajeQueObtuvoEnElJuego();
        imprimirMesaje(jugador.getNombre() + " tu puntaje es: " + jugador.getPuntaje());
        historial.almacenarHistorial(jugador.getNombre(),jugador.getPuntaje());
    }

    //lee archivo y pinta historial
    public void mostrarElHistorial(){
        imprimirMesaje(menuInicio.notificarHistorial());
        historial.leerHistorial();
    }
}

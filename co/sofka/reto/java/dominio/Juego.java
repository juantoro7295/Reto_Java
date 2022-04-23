package co.sofka.reto.java.dominio;

import co.sofka.reto.java.util.Imprimir;
import co.sofka.reto.java.util.MenuInicio;
import co.sofka.reto.java.util.Teclado;


public class Juego extends Imprimir {
    private boolean continuo;

    private int respuestaJugadorPregunta;

    PreguntasDatos preguntasDatos;
    Jugador jugador;
    Ronda ronda;

    MenuInicio menuInicio = new MenuInicio();

    public Juego() {
        this.continuo = true;
        this.continuarJugando = true;
        this.respuestaJugadorPregunta = -1;
        preguntasDatos = new PreguntasDatos();
        jugador = new Jugador("");
        ronda = new Ronda();

    }


    //  orden cronologico # parte 1
    public void queOpcionEligioEnElMenu(Teclado teclado) {
        switch (teclado.pedirRespuestaJugadorPorTeclado()) {
            case 1:
                //pedir el nombre del jugador

                   //crearJugadorJuego(teclado);
                pedirMostrarYvalidarOpciones(teclado);
                this.continuo = false;

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

    public void continuarMenu(Teclado teclado) {

        do {
            imprimirMesaje(menuInicio.mostrarMenuDeInicio());
            queOpcionEligioEnElMenu(teclado);

        } while (continuo);

    }
    // pedir y guardar el jugador

    public boolean crearJugadorJuego(Teclado teclado) {
        imprimirMesaje("---------------------------\nIngresa tú nombre:");
         jugador.setNombre(teclado.pedirNombreJugadorPorTeclado());
         return true;
    }

    //valida la pregunta mostrada
    public boolean validarPreguntaMostradaJuego(Teclado teclado) {
        boolean respuestaCorrectaJugador = false;
        if (preguntasDatos.getPreguntas().get(ronda.getEscogerPregunta()).getCorrecta() == respuestaJugadorPregunta ) {
            //aqui podemos subir puntaje
            //gatillo para salirnos del juego
            return respuestaCorrectaJugador = true;
        }
        return respuestaCorrectaJugador;
    }
    //imprime el menu  desea continuar y verifica
    //sale despues de responder una pregunta correctamente
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

    public void laPreguntaSeRespondeCorrectamente(Teclado teclado){
        if(validarPreguntaMostradaJuego(teclado)){
           imprimirMesaje("muy bien, respuesta correcta");
            //se le pasa el menu si desea continuar
        }
    }
    public void laPreguntaSeRepondeIncorrectamente(Teclado teclado){
        if(!validarPreguntaMostradaJuego(teclado)){
            imprimirMesaje(" UPSS , Respuesta incorrecta");
        }
    }

    public void larespuestaNoConcuerdaConLasOpciones(){
        if(this.respuestaJugadorPregunta!= 1 || this.respuestaJugadorPregunta!= 2 || this.respuestaJugadorPregunta!= 3 || this.respuestaJugadorPregunta!= 4){
            imprimirMesaje("joven recuerda utilizar como respuesta 1 2 3 4 ");

        }
    }

    public void  pedirMostrarYvalidarOpciones(Teclado teclado){
        ronda.mostrarPreguntaJuego();
        this.respuestaJugadorPregunta = teclado.pedirRespuestaJugadorPorTeclado()-1;
        laPreguntaSeRespondeCorrectamente(teclado);
        laPreguntaSeRepondeIncorrectamente(teclado);
        larespuestaNoConcuerdaConLasOpciones();
    }


}

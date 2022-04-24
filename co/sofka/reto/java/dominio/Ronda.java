package co.sofka.reto.java.dominio;

import co.sofka.reto.java.util.Imprimir;

public class Ronda extends Imprimir {
    //clases necesarias
    PreguntasDatos preguntasDatos;

    private int escogerPregunta;

    public Ronda() {
        //instancia
        preguntasDatos = new PreguntasDatos();
    }

    public int getEscogerPregunta() {
        return escogerPregunta;
    }

    //Entrega un numero aleatorio del tamaño de la lista de preguntas datos
    public int escogerPreguntaAleatoria() {
        return this.escogerPregunta = (int) (Math.random() * preguntasDatos.getPreguntas().size());
    }

    //Muestra la pregunta en el juego
    public void mostrarPreguntaJuego() {
        imprimirMesaje("" + preguntasDatos.getPreguntas().get(escogerPreguntaAleatoria()));
    }

}

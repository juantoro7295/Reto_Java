package co.sofka.reto.java.dominio;

import co.sofka.reto.java.util.Imprimir;
import co.sofka.reto.java.util.Teclado;

import java.util.ArrayList;
import java.util.Map;

public class Ronda extends Imprimir {
    //clases necesarias
    PreguntasDatos preguntasDatos;
    //variables necesarias;
    private int ronda;
    private int escogerPregunta;

    public Ronda() {
        //instancia
        preguntasDatos = new PreguntasDatos();


    }

    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }

    public int getEscogerPregunta() {
        return escogerPregunta;
    }

    public void setEscogerPregunta(int escogerPregunta) {
        this.escogerPregunta = escogerPregunta;
    }

    public int escogerPreguntaAleatoria() {
        return this.escogerPregunta = (int) (Math.random() * ((26 + 1) - 0) + 0);
    }

    public void mostrarPreguntaJuego() {
        imprimirMesaje("" + preguntasDatos.getPreguntas().get(escogerPreguntaAleatoria()));
    }



}

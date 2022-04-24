package co.sofka.reto.java.dominio;

import co.sofka.reto.java.util.Imprimir;
import co.sofka.reto.java.util.Teclado;

import java.util.ArrayList;
import java.util.Map;

public class Ronda extends Imprimir {
    private int ronda;
    private int escogerPregunta;


    private ArrayList<Integer> preguntaYaUsadas;


    PreguntasDatos preguntasDatos;

    public Ronda() {
        preguntasDatos = new PreguntasDatos();
        preguntaYaUsadas = new ArrayList<Integer>();

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
        return this.escogerPregunta =  (int) (Math.random() * preguntasDatos.getPreguntas().size()+1);
        //((25 + 1) - 0) + 0)
    }
    public void imprimirRandom(){
        imprimirMesaje(""+escogerPreguntaAleatoria());
    }

    public void mostrarPreguntaJuego() {
        imprimirMesaje("" + preguntasDatos.getPreguntas().get(escogerPreguntaAleatoria()));
        preguntasDatos.eliminarPregunta(this.escogerPregunta);
        //imprimirMesaje("" + preguntasDatos.getPreguntas().get(numeroAletorioDefinitivo()));
    }

    public void test(){
        for (int i = 0; i < 23;i++){
            mostrarPreguntaJuego();
        }
    }



}

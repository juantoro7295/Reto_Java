package co.sofka.reto.java.app;

import co.sofka.reto.java.dominio.Juego;
import co.sofka.reto.java.dominio.PreguntasDatos;
import co.sofka.reto.java.dominio.Ronda;
import co.sofka.reto.java.util.Imprimir;
import co.sofka.reto.java.util.MenuInicio;
import co.sofka.reto.java.util.Teclado;


public class App {
    public static void main(String[] args) {
        Juego juego = new Juego();
        Teclado teclado = new Teclado();
        MenuInicio menu = new MenuInicio();
        Imprimir imprimir = new Imprimir();
        Ronda ronda = new Ronda();
        PreguntasDatos preguntasDatos = new PreguntasDatos();

        //orden cronologico real



        //juego.continuarMenu(teclado);

        //imprimir.imprimirMesaje(""+preguntasDatos.getPreguntas().get(ronda.escogerPreguntaAleatoria()).toString());
        //ronda.mostrarPreguntaJuego();
        //preguntasDatos.getPreguntas().get(ronda.escogerPreguntaAleatoria()).getCorrecta();
        //imprimir.imprimirMesaje(menu.mostrarDeseaContinuar());
        //juego.deseaContinuarMenu(teclado);
        //juego.continuarMenu(teclado);
        juego.menuInicioJuego();


    }
}

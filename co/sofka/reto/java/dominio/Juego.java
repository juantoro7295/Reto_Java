package co.sofka.reto.java.dominio;

import co.sofka.reto.java.util.Imprimir;
import co.sofka.reto.java.util.MenuInicio;
import co.sofka.reto.java.util.Teclado;


public class Juego extends Imprimir {
    
   //clases necesarias
    MenuInicio menuInicio;
    Teclado teclado;

    //variables necesarias

    public Juego(){
        //instancias
        menuInicio = new MenuInicio();
        teclado = new Teclado();
        //variables
    }

    public void menuInicioJuego(){
      imprimirMesaje(menuInicio.mostrarMenuDeInicio());
        switch(teclado.pedirRespuestaJugadorPorTeclado()){
            case 1:
                //Jugar
                break;
            case 2:
                //Historial
                break;
            case 3:
                //Salir

                System.exit(0);
                break;
        }
    }
}

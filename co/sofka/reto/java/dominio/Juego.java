package co.sofka.reto.java.dominio;

import co.sofka.reto.java.util.Imprimir;
import co.sofka.reto.java.util.MenuInicio;
import co.sofka.reto.java.util.Teclado;


public class Juego extends Imprimir {

   //clases necesarias
    MenuInicio menuInicio;
    Teclado teclado;
    Ronda ronda;
    PreguntasDatos preguntasDatos;

    //variables necesarias
    private int respuestaDelJugador;
    private int puntaje;
    private int contadorPreguntas;
    private boolean deseaContinuar;

    public Juego(){
        //instancias
        menuInicio = new MenuInicio();
        teclado = new Teclado();
        ronda = new Ronda();
        preguntasDatos = new PreguntasDatos();
        //variables

    }
//Menu Principal
    public void menuInicioJuego(){
      imprimirMesaje(menuInicio.mostrarMenuDeInicio());
        switch(teclado.pedirRespuestaJugadorPorTeclado()){
            case 1:
                //Jugar
                do{
                    ronda.mostrarPreguntaJuego();
                    if(verificarSiLaRespuestaDelJugadorEsCorrecta()){
                        this.contadorPreguntas +=1;
                        imprimirMesaje("Respuesta Correcta");
                        if(this.contadorPreguntas <= 4){
                            menuDeseaContinuarJugando();
                        }



                    }else{
                        imprimirMesaje("Perdiste");
                        System.exit(0);
                    }
                }while(this.contadorPreguntas <=4 && this.deseaContinuar);
                imprimirMesaje("tu puntaje es: "+ puntaje);






                break;
            case 2:
                //Historial
                //manejarlo con texto plano
                break;
            case 3:
                //Salir
                System.exit(0);
                break;
            default:
                //Parametro no valido
                break;
        }
    }
    //Menu preguntando si desea continuar jugando
    public void menuDeseaContinuarJugando(){
        imprimirMesaje(menuInicio.mostrarDeseaContinuar());
        switch(teclado.pedirRespuestaJugadorPorTeclado()){
            case 1:
                //Respuesta SI
                this.deseaContinuar = true;

                break;
            case 2:
                //Respuesta No
                this.deseaContinuar = false;
                //pide nombre y guarda
                break;
            default:
                //Parametro no valido
                break;
        }
    }

    //Pedir respuesta correcta

    public int obtenerRespuestaCorrecta(){
        return preguntasDatos.getPreguntas().get(ronda.getEscogerPregunta()).getCorrecta();

    }
    //Pedir respuesta jugador
    public int obtenerRespuestaDelJugador(){
        this.respuestaDelJugador = teclado.pedirRespuestaJugadorPorTeclado();
        return this.respuestaDelJugador;
    }

    public boolean verificarSiLaRespuestaDelJugadorEsCorrecta(){
        if(obtenerRespuestaCorrecta() == obtenerRespuestaDelJugador()-1){
            //subir puntaje
            this.puntaje = puntaje +100;

            return true;

        }else{

            return false;

        }
    }
}

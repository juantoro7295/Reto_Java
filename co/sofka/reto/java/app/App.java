package co.sofka.reto.java.app;
import co.sofka.reto.java.dominio.Juego;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws InterruptedException, IOException {
        //Instancia
        Juego juego = new Juego();
        //iniciar el juego
        juego.menuInicioJuego();
    }
}

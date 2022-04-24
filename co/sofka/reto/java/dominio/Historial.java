package co.sofka.reto.java.dominio;

import co.sofka.reto.java.util.Imprimir;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Historial extends Imprimir {

    //clases
    FileWriter datosHistorial;
    FileReader leerHistorial;
    BufferedReader contenido;
    private String textoHistorial;

    public Historial() throws IOException {
        //instancias
        datosHistorial = new FileWriter("historial.txt", true);
        leerHistorial = new FileReader("historial.txt");
        contenido = new BufferedReader(leerHistorial);
    }

    //Almacena en el fichero y cierra el fichero
    public void almacenarHistorial(String nombre, int puntaje) {
        try {
            datosHistorial.append("* " + nombre + " ");
            datosHistorial.append(" -> Puntaje: " + Integer.toString(puntaje) + "\n"); //la hizo la juanes
            datosHistorial.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //Lee y pinta el historial que hay en el fichero
    public void leerHistorial() {
        try {
            while ((textoHistorial = contenido.readLine()) != null)

                imprimirMesaje(textoHistorial + " \n");


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}




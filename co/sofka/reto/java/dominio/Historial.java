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
    //FileWriter fw = new FileWriter("myfile.txt", true
    //BufferedWriter bw = new BufferedWriter(fw);
    // PrintWriter out = new PrintWriter(bw)
    //        out.println("the text");
    //        //more code
    //        out.println("more text");
    //        //more code

    //variables
    private String textoHistorial;

    public Historial() throws IOException {
        //instancias
        datosHistorial = new FileWriter("historial.txt", true);
        leerHistorial = new FileReader("historial.txt");
        contenido = new BufferedReader(leerHistorial);
    }


    public void almacenarHistorial(String nombre, int puntaje){
        try {
            //datosHistorial.append("---------------------------" + "\n" + "*** Historial ***" + "\n" );
            datosHistorial.append("* "+nombre+ " ");
            datosHistorial.append(" -> Puntaje: "+ Integer.toString(puntaje)+"\n"); //la hizo la juanes
            datosHistorial.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void leerHistorial() {
        try {
            while ((textoHistorial = contenido.readLine()) != null)

                imprimirMesaje(textoHistorial +" \n");


        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    //    private List<Jugador> historialJugadores;
//
//    public Historial() {
//        historialJugadores = new ArrayList<Jugador>();
//    }
//
//    public List<Jugador> getHistorialJugadores() {
//        return historialJugadores;
//    }
//
//    @Override
//    public String toString() {
//
//        StringBuilder texto = new StringBuilder();
//
//        texto.append("---------------------------" + "\n" + "*** Historial ***" + "\n" + "PUNTAJE: " + "\n");
//        for (int i = 0; i < this.historialJugadores.size(); i++) {
//            texto.append("  ").append(i + 1).append(") ");
//            texto.append(this.historialJugadores.get(i).getNombre()).append(" -> ").append(this.historialJugadores.get(i).getPuntaje());
//            texto.append("\n");
//
//        }
//        texto.append("-----------------------------");
//        return texto.toString();
//    }
}




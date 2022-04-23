package co.sofka.reto.java.dominio;


import java.util.ArrayList;
import java.util.List;

public class Historial {

    private List<Jugador> historialJugadores;

    public Historial() {
        historialJugadores = new ArrayList<Jugador>();
    }

    public List<Jugador> getHistorialJugadores() {
        return historialJugadores;
    }

    @Override
    public String toString() {

        StringBuilder texto = new StringBuilder();

        texto.append("---------------------------"+"\n"+"*** Historial ***"+"\n"+"PUNTAJE: " +  "\n");
        for (int i = 0; i < this.historialJugadores.size(); i++) {
            texto.append("  ").append(i + 1).append(") ");
            texto.append(this.historialJugadores.get(i).getNombre()).append(" -> ").append(this.historialJugadores.get(i).getPuntaje());
            texto.append("\n");

        }
        texto.append("-----------------------------");
        return texto.toString();
    }
}




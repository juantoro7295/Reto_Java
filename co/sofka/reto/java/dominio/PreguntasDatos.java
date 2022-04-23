package co.sofka.reto.java.dominio;

import java.util.ArrayList;
import java.util.List;

public class PreguntasDatos {
    List<Pregunta> preguntas;

    public PreguntasDatos() {
        preguntas = new ArrayList<Pregunta>();


        String[] respuestas = new String[]{"1492", "1520", "1898", "1710"};
        Pregunta pregunta = new Pregunta("¿En qué año se descubrió América?", respuestas, 0);
        preguntas.add(pregunta);

        String[] respuestas1 = new String[]{"1492", "1520", "1914", "1939"};
        Pregunta pregunta1 = new Pregunta("¿En que año fue la primera guerra mundial?", respuestas1, 3);
        preguntas.add(pregunta1);

        String[] respuestas2 = new String[]{"1492", "1939", "1914", "1945"};
        Pregunta pregunta2 = new Pregunta("¿En que año fue la segunda guerra mundial?", respuestas2, 1);
        preguntas.add(pregunta2);


        String[] respuestas3 = new String[]{"J Wallaby 36 Sydney", "Bajo Californio", "P Sherman 42 Wallaby Way Sidney", "La CA2"};
        Pregunta pregunta3 = new Pregunta("¿Cual es la direcion con la que Dori estaba buscando a Nemo?", respuestas3, 3);
        preguntas.add(pregunta3);

        String[] respuestas4 = new String[]{"Iron Man", "The Hulk", "the Avengers", "Spiderman"};
        Pregunta pregunta4 = new Pregunta("¿Qué película inició el Universo Cinematográfico de Marvel?", respuestas4, 0);
        preguntas.add(pregunta4);

        String[] respuestas5 = new String[]{"Avengers Endgame", "Titanic", "Avatar", "Harry Potter y las Reliquias de la Muerte - Parte 2"};
        Pregunta pregunta5 = new Pregunta("¿Cual es la pelicula mas taquillera?", respuestas5, 2);
        preguntas.add(pregunta5);

        String[] respuestas6 = new String[]{"Jugadores de Fútbol", "Pintores Renacentistas", "Presidentes de Estados Unidos", "Dioses griegos"};
        Pregunta pregunta6 = new Pregunta("¿Qué inspiró los nombres de las Tortugas Ninja?", respuestas6, 1);
        preguntas.add(pregunta6);

        String[] respuestas7 = new String[]{"Blanca Nieves y los 7 enanitos", "Pinocho", "Fantasía", "La Bella durmiente"};
        Pregunta pregunta7 = new Pregunta("¿Cuál fue la primer película animada de Disney?", respuestas7, 0);
        preguntas.add(pregunta7);

        String[] respuestas8 = new String[]{"5", "6", "7", "4"};
        Pregunta pregunta8 = new Pregunta("¿Cuántos océanos hay en la tierra?", respuestas8, 0);
        preguntas.add(pregunta8);

        String[] respuestas9 = new String[]{"El Nilo", "El Amazonas", "El Danubio", "El Rin"};
        Pregunta pregunta9 = new Pregunta("¿Cuál es el río más largo del mundo?", respuestas9, 1);
        preguntas.add(pregunta9);

        String[] respuestas10 = new String[]{"España y Marruecos", "Portugal y Marruecos", "España y Gran Bretaña", "Italia y Túnez"};
        Pregunta pregunta10 = new Pregunta("¿Qué paises disputan la soberanía sobre Gibraltar?", respuestas10, 2);
        preguntas.add(pregunta10);

        String[] respuestas11 = new String[]{"Estambul", "Ciudad de Panamá", "Moscú", "Asjabad"};
        Pregunta pregunta11 = new Pregunta("¿Qué ciudad se ubica en dos continentes?", respuestas11, 0);
        preguntas.add(pregunta11);

        String[] respuestas12 = new String[]{"Nuuk", "Oslo", "Estocolmo", "Raikiavik"};
        Pregunta pregunta12 = new Pregunta("¿Cuál es la capital más al norte del mundo?", respuestas12, 3);
        preguntas.add(pregunta12);

        String[] respuestas13 = new String[]{"Estados Unidos", "Japón", "Francia", "Gran Bretaña"};
        Pregunta pregunta13 = new Pregunta("¿Cuál de los siguentes paises no integró a los Aliados durente la Segunda Guerra Mundial?", respuestas13, 1);
        preguntas.add(pregunta13);

        String[] respuestas14 = new String[]{"La llegada al poder de Hitler", "El bombardeo a Pearl Harbor", "La Muerte de Franz Ferdinand", "El desarrollo de la bomba atómica"};
        Pregunta pregunta14 = new Pregunta("¿Qué desencadenó el inicio de la Primera Guerra Mundial?", respuestas14, 2);
        preguntas.add(pregunta14);

        String[] respuestas15 = new String[]{"1810", "1819", "1814", "1805"};
        Pregunta pregunta15 = new Pregunta("¿En qué año se firmó la declaración de la independencia de Colombia?", respuestas15, 0);
        preguntas.add(pregunta15);

        String[] respuestas16 = new String[]{"Bucéfalo", "Babieca", "Marengo", "Rocinante"};
        Pregunta pregunta16 = new Pregunta("¿Cómo se llamaba el legendario caballo de Alejandro Magno?", respuestas16, 0);
        preguntas.add(pregunta16);

        String[] respuestas17 = new String[]{"Santa Marta", "Cartagena", "Bogotá", "Tunja"};
        Pregunta pregunta17 = new Pregunta("¿Cuál es la ciudad más antigua de Colombia?", respuestas17, 0);
        preguntas.add(pregunta17);

        String[] respuestas18 = new String[]{"Un Virus", "Una Bacteria", "Un Protozoo", "Una Pandemia"};
        Pregunta pregunta18 = new Pregunta("¿Qué es el COVID?", respuestas18, 0);
        preguntas.add(pregunta18);

        String[] respuestas19 = new String[]{"Los Pistilos", "La Clorofila", "Los Estomas", "La Salvia"};
        Pregunta pregunta19 = new Pregunta("¿Qué le da el color verde a las hojas de las plantas?", respuestas19, 1);
        preguntas.add(pregunta19);

        String[] respuestas20 = new String[]{"Martillo", "Yunque", "Estribo", "Semilunar"};
        Pregunta pregunta20 = new Pregunta("¿Cuál de estos no es un huesesillo del oido?", respuestas20, 3);
        preguntas.add(pregunta20);

        String[] respuestas21 = new String[]{"Albert Einstein", "Erwin Schrödinger", "Robbert Oppenhaimer", "Nikola Tesla"};
        Pregunta pregunta21 = new Pregunta("¿A quén se atribuyen los principales aportes al desarollo de la bomba atómica?", respuestas21, 2);
        preguntas.add(pregunta21);

        String[] respuestas22 = new String[]{"J", "K", "Z", "W"};
        Pregunta pregunta22 = new Pregunta("¿Cuál de las siguientes letras no identifica ningún elemento en la tabla periódica?", respuestas22, 0);
        preguntas.add(pregunta22);


        String[] respuestas23 = new String[]{"1","9", "11", "10"};
        Pregunta pregunta23 = new Pregunta("¿Con qué número jugaba Carlos 'El Pibe' Valderrama en la selección Colombia?", respuestas23, 3);
        preguntas.add(pregunta23);

        String[] respuestas24 = new String[]{"64","60", "56", "58"};
        Pregunta pregunta24 = new Pregunta("¿Cuántos cuadros componen el tablero de ajedréz?", respuestas24, 0);
        preguntas.add(pregunta24);

        String[] respuestas25 = new String[]{"Pete Sampras","Roger Federer", "Novak Djokovic", "John McEnroe"};
        Pregunta pregunta25 = new Pregunta("¿Cuál es el jugador de tenis con más títulos del torneo de Wimbledon?", respuestas25, 1);
        preguntas.add(pregunta25);
    }


    public List<Pregunta> getPreguntas() {
        return preguntas;
    }


}

package co.sofka.reto.java.dominio;

public class Pregunta {
    private String enunciadoPregunta;
    private String[] respuestas;
    private int correcta;

    public Pregunta(String enunciadoPregunta, String[] respuestas, int correcta) {
        this.enunciadoPregunta = enunciadoPregunta;
        this.respuestas = respuestas;
        this.correcta = correcta;
    }

    public String getEnunciadoPregunta() {
        return enunciadoPregunta;
    }

    public void setEnunciadoPregunta(String enunciadoPregunta) {
        this.enunciadoPregunta = enunciadoPregunta;
    }

    public String[] getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(String[] respuestas) {
        this.respuestas = respuestas;
    }

    public int getCorrecta() {
        return correcta;
    }

    @Override
    public String toString() {
        StringBuilder texto = new StringBuilder();

        texto.append("PREGUNTA: " + this.enunciadoPregunta + "\n");

        for (int i = 0; i < this.respuestas.length; i++) {
            texto.append("  ").append(i + 1).append(") ");
            texto.append(this.respuestas[i]);
            texto.append("\n");
        }
        return texto.toString();
    }
}

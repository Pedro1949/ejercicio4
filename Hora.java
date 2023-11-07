package Pregunta4;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    // Constructor
    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    // Métodos de acceso
    public int obtenerHoras() {
        return horas;
    }

    public int obtenerMinutos() {
        return minutos;
    }

    public int obtenerSegundos() {
        return segundos;
    }

    // Método para avanzar la hora
    public void avanzar() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }
    }

    // Método para poner a cero la hora
    public void ponerACero() {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    // Método para visualizar la hora
    public void visualizar() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }
}
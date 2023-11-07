package Pregunta4;


public class Pregunta_4 {
    public static void main(String[] args) {
        Hora hora = new Hora(12, 30, 45); // Crear un objeto Hora con una hora inicial

        System.out.println("Hora actual:");
        hora.visualizar();

        hora.avanzar(); // Avanzar la hora en un segundo
        System.out.println("Hora después de avanzar un segundo:");
        hora.visualizar();

        hora.ponerACero(); // Poner la hora a cero
        System.out.println("Hora después de ponerla a cero:");
        hora.visualizar();
    }
}

package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;

public class App {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Raul", "123", "321", 32);
        Reserva reserva1 = new Reserva("Cartagena", LocalDate.of(2024,12,12) , LocalTime.of(10, 23), 3, 100, persona1);
        System.out.println(reserva1);
    }

}

package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    public String nombreTour;
    public LocalDate fecha;
    public LocalTime hora;
    public int numeroPersonas;
    public int precio;
    public Persona personaQueReserva;

    public Reserva(String nombreTour, LocalDate fecha, LocalTime hora, int numeroPersonas, int precio, Persona personaQueReserva) {
        this.nombreTour = nombreTour;
        this.fecha = fecha;
        this.hora = hora;
        this.numeroPersonas = numeroPersonas;
        this.precio = precio;
        this.personaQueReserva = personaQueReserva;
    }

    public String getNombreTour() {
        return nombreTour;
    }

    public void setNombreTour(String nombreTour) {
        this.nombreTour = nombreTour;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Persona getPersonaQueReserva() {
        return personaQueReserva;
    }

    public void setPersonaQueReserva(Persona personaQueReserva) {
        this.personaQueReserva = personaQueReserva;
    }

    @Override
    public String toString() {
        return "Reserva [nombreTour=" + nombreTour + ", fecha=" + fecha + ", hora=" + hora + ", numeroPersonas="
                + numeroPersonas + ", precio=" + precio + ", personaQueReserva=" + personaQueReserva + "]";
    }
}

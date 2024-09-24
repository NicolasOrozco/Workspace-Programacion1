
package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;
import java.util.LinkedList;

public class Reunion {
    String descripcion;
    LocalDate fecha;
    LocalTime hora;
    public Collection<Contacto> asistentes;

    /**
     * Método constructor de la clase Reunión
     * @param descripccion
     * @param fecha
     * @param hora
     */
    public Reunion(String descripcion, LocalDate fecha, LocalTime hora ){
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        asistentes = new LinkedList<>();
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    /**
     * Método que verifica que no se permitan duplicados en una reunión
     */
   public boolean verificarAsistente(String telefono, String nombre) {
      boolean centinela = false;
      for (Contacto contacto : asistentes) {
         if (contacto.getTelefono().equals(telefono) && contacto.getNombre().equals(nombre)) {
            centinela = true;
         }
      }
      return centinela;
   }

    /**
     * Método para agregar asistentes a una reunión
     */
    public void agregarContactoAsistente(Contacto contacto) {
        if (!verificarAsistente(contacto.getTelefono(), contacto.getNombre())) {
            asistentes.add(contacto);
         }
   }

    /**
     * Método para eliminar asistentes de una reunión
     */
    public void eliminarContactoAsistente(String telefono){
        for (Contacto contacto : asistentes){
            if(contacto.getTelefono().equals(telefono)){
                asistentes.remove(contacto);
            }
        }
    }

    //Método ToString de la clase Reunión
    @Override
    public String toString() {
        return "\t\tReunion \nDescripcion=" + descripcion + "\nFecha=" + fecha + "\nHora=" + hora + "\nContactos="
                + asistentes + "\n\n";
    }
    
    
    
    
}

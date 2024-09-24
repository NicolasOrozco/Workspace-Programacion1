package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Entrenador {
    private String nombre;
    private String especialidad;
    private String telefono;
    private String correo;
    private LinkedList<Miembro> miembros;

    /**
     * Método constructor de la clase Entrenador
     * @param nombre del entrenador
     * @param especialidad del entrenador
     * @param telefono del entrenador
     * @param correo del entrenador
     */
    public Entrenador(String nombre, String especialidad, String telefono, String correo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.correo = correo;
        miembros = new LinkedList<>();
    }

    /**
     * Método que vincula los miembros a un entrenador
     * @param miembros
     */
    public void agregarMiembroAEntrenador(Miembro miembro) {
        miembros.add(miembro);
    }

    /**
     * Método para obtener el nombre de un entrenador
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para modificar el nombre de un entrenador
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la especialidad de un entrenador
     * @return especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Método parta modificar la especialidad de un entrenador
     * @param especialidad
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Método para obtener el teléfono de un entrenador
     * @return telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Método parta modificar el teléfono de un entrenador
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Método para obtener el correo de un entrenador
     * @return correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Método parta modificar el correo de un entrenador
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Método para obtener la lista de miembros asociados a un entrenador
     * @return miembros
     */
    public LinkedList<Miembro> getMiembros() {
        return miembros;
    }

    /**
     * Método parta modificar la lista de miembros de un entrenador
     * @param miembros
     */
    public void setMiembros(LinkedList<Miembro> miembros) {
        this.miembros = miembros;
    }

    /**
     * Método toString de la clase Entrenador
     */
    @Override
    public String toString() {
        return "Entrenador [nombre=" + nombre + ", especialidad=" + especialidad + ", telefono=" + telefono
                + ", correo=" + correo + ", miembros=" + miembros + "]";
    }

    

}
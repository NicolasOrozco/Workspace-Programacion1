package co.edu.uniquindio.poo;

public class Miembro {
    private String nombre;
    private int edad;
    private String genero;
    private String cedula;
    private Membresia membresia;

    /**
     * Método constructor de la clase miembro
     * 
     * @param nombre del miembro
     * @param edad del miembro
     * @param genero del miembro
     * @param cedula del miembro
     * @param membresia del miembro
     */
    public Miembro(String nombre, int edad, String genero, String cedula, Membresia membresia) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.cedula = cedula;
        this.membresia = membresia;
    }

    /**
     * Método toString de la clase miembro
     */
    @Override
    public String toString() {
        return "Miembro [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", cedula=" + cedula
                + ", membresia=" + membresia + "]";
    }

    /**
     * Método para obtener el nombre de un miembro
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para modificar el nombre de un miembro
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la edad de un miembro
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método para modificar la edad de un miembro
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método para obtener el género de un miembro
     * @return genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Método para modificar el género de un miembro
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Método para obtener la cédula de un miembro
     * @return cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Método para modificar la cédula de un miembro
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Método para obtener el tipo de membresía de un miembro
     * @return membresia
     */
    public Membresia getMembresia() {
        return membresia;
    }

    /**
     * Método para modificar el tipo de membresía de un miembro
     * @param membresia
     */
    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

}
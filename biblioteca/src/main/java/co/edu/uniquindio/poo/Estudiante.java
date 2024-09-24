package co.edu.uniquindio.poo;

public class Estudiante extends Persona {
    private String id;

    /**
     * Método constructor de la clase Estudiante
     * 
     * @param nombre   del estudiante
     * @param cedula   del estudiante
     * @param telefono del estudiante
     * @param correo   del estudiante
     * @param id       del estudiante
     */
    public Estudiante(String nombre, String cedula, String telefono, String correo, String id) {
        super(nombre, cedula, telefono, correo);
        this.id = id;
    }

    /**
     * Método para
     * 
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * Método para
     * 
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Método toString de la clase Estudiante
     */
    @Override
    public String toString() {
        return "Estudiante [" + super.toString() + "Id=" + id + "]";
    }

}

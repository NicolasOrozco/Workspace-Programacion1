package co.edu.uniquindio.poo;

public class Proveedor {
    public String nombre;
    public String id;
    public String direccion;
    public String telefono;

    /**
     * Método constructor de la clase Proveedor
     * @param nombre
     * @param id
     * @param direccion
     * @param telefono
     */
    public Proveedor(String nombre, String id, String direccion, String telefono){
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /*
     * Getters y Setters de la clase Proveedor
     */

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    /**
     * Método toString de la clase Proveedor
     */
    @Override
    public String toString() {
        return "Proveedor [nombre=" + nombre + ", id=" + id + ", direccion=" + direccion + ", telefono=" + telefono
                + "]";
    }
}

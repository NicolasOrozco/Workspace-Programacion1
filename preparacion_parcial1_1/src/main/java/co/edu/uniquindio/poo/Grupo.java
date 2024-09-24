package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Grupo {
    public String nombre;
    public Categoria categoria;
    public LinkedList<Contacto> contactos;

    public Grupo(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        contactos = new LinkedList<>();
    }

    public boolean verificarContactoEnGrupo(String nombre, String telefono){
        boolean centinela = false;
        for(Contacto contacto: contactos){
            if(contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)){
                centinela = true;
            }
        }
        return centinela;
    }

    public void agregarContactoAGrupo(Contacto contacto){
        if(!verificarContactoEnGrupo(contacto.getNombre(), contacto.getTelefono())){
            contactos.add(contacto);
        }
    }

    public void eliminarContactoDeGrupo(String nombre, String telefono){
        for(Contacto contacto : contactos){
            if(contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)){
                contactos.remove(contacto);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public LinkedList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(LinkedList<Contacto> contactos) {
        this.contactos = contactos;
    }

    @Override
    public String toString() {
        return "Grupo [nombre=" + nombre + ", categoria=" + categoria + ", contactos=" + contactos + "]";
    }

    
}

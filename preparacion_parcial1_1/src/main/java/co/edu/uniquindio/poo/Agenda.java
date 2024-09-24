package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Agenda {
    public String nombre;
    public LinkedList<Contacto> contactos;
    public LinkedList<Grupo> grupos;

    public Agenda(String nombre){
        this.nombre = nombre;
        contactos = new LinkedList<>();
        grupos = new LinkedList<>();
    }

    public boolean verificarContacto(String nombre, String telefono){
        boolean centinela = false;
        for(Contacto contacto : contactos){
            if(contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)){
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public void añadirContacto(Contacto contacto){
        if(!verificarContacto(contacto.getNombre(), contacto.getTelefono())){
            contactos.add(contacto);
        }
    }

    public void eliminarContacto(String nombre, String telefono){
        for(Contacto contacto : contactos){
            if(contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)){
                contactos.remove(contacto);
                break;
            }
        }
    }
    
    public void crearGrupo(Grupo grupo){
        grupos.add(grupo);
    }

    public void eliminarGrupo(String nombre){
        for(Grupo grupo : grupos){
            if(grupo.getNombre().equals(nombre)){
                grupos.remove(grupo);
            }
        }
    }

    public LinkedList<Contacto> contactosMayoresDeEdad(){
        LinkedList<Contacto> mayores = new LinkedList<>();
        for(Contacto contacto : contactos){
            if(contacto.getEdad()>=18){
                mayores.add(contacto);
            }
        }
        return mayores;
    }

    public void nombresContactosMayoresDeEdad(){
        for(int i = 0; i >= contactos.size(); i++){
            Contacto contacto = contactos.get(i);
            if(contacto.getEdad()>=18){
                System.out.println(contacto.getNombre());
                System.out.println("\n");
            }
        }
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public LinkedList<Contacto> getContactos(){
        return contactos;
    }

    public void setContactos(LinkedList<Contacto> contactos){
        this.contactos = contactos;
    }

    public LinkedList<Grupo> getGrupos(){
        return grupos;
    }

    public void setGrupos(LinkedList<Grupo> grupos){
        this.grupos = grupos;
    }

    @Override
    public String toString(){
        return "Agenda[Nombre = " + nombre + ", Contactos = " + contactos + ", Grupos = " + grupos + "]";   
    }
}

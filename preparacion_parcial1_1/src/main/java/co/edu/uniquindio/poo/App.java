package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {

        //Se crea una nueva agenda
        Agenda agenda = new Agenda("Agenda");

        //Se crean los contactos
        Contacto contacto1 = new Contacto("Jaime", "Jaimito", "Barrio1", "123", "jaime@gmail", 34);
        Contacto contacto2 = new Contacto("Ismael", "Chucho", "Barrio2", "124", "isma@gmail", 22);
        Contacto contacto3 = new Contacto("Juana", "Jota", "Barrio3", "125", "juanita@gmail", 11);

        //Creación de los grupos
        Grupo grupo = new Grupo("Cantina", Categoria.AMIGOS);
        Grupo grupo2 = new Grupo("Oficina", Categoria.OFICINA);

        //Se añaden los contactos a la agenda
        agenda.añadirContacto(contacto1);
        agenda.añadirContacto(contacto2);
        agenda.añadirContacto(contacto3);

        //Se agregan los grupos
        agenda.crearGrupo(grupo);
        agenda.crearGrupo(grupo2);

        //Verificación de contactos duplicados
        agenda.añadirContacto(contacto2);

        //Se añaden miembros a los grupos
        grupo.agregarContactoAGrupo(contacto1);
        grupo.agregarContactoAGrupo(contacto2);
        grupo2.agregarContactoAGrupo(contacto1);
        grupo2.agregarContactoAGrupo(contacto3);

        //Imprimir contactos mayores de edad
        System.out.println("Lista de contactos mayores de edad:");
        System.out.println(agenda.contactosMayoresDeEdad());

        //Imprimir SOLO NOMBRES de los contactos mayores de edad
        System.out.println("Lista de contactos mayores de edad SOLO NOMBRES:");
        agenda.nombresContactosMayoresDeEdad();



        //System.out.println(agenda);

    }
}

package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        
        // Se crea el gimnasio
        Gimnasio gimnasio = new Gimnasio("Bodytech");

        // Se crean los miembros
        Miembro miembro1 = new Miembro("Carlos", 20, "Masculino", "12345", Membresia.MENSUAL);
        Miembro miembro2 = new Miembro("Mario", 17, "Masculino", "123456", Membresia.ANUAL);
        Miembro miembro3 = new Miembro("Murcielago", 17, "Masculino", "1234567", Membresia.ANUAL);

        // Se crean los entrenadores
        Entrenador entrenador = new Entrenador("Jorge", "Pesas", "1234", "jorge@gmail.com");

        // Se agregan los miembros al gimnasio
        gimnasio.agregarMiembro(miembro1);
        gimnasio.agregarMiembro(miembro2);
        gimnasio.agregarMiembro(miembro3);

        // Se agregan los entrenadores al gimnasio
        gimnasio.agregarEntrenador(entrenador);

        // Se vinculan los miembros al entrenador
        entrenador.agregarMiembroAEntrenador(miembro2);

        // Devolver lista con nombre invertidos
        gimnasio.mostrarMensaje("Lista Nombres Invertidos:");
        gimnasio.listaNombresInverso();
        gimnasio.mostrarMensaje("\n");

        // Obtener los miembros menores de edad
        LinkedList<Miembro> menores = gimnasio.miembrosMenoresEdad();

        // Imprimir los miembros menores de edad
        System.out.println("Miembros menores de edad:");
        for (Miembro miembro : menores) {
            System.out.println(miembro);
        }
        gimnasio.mostrarMensaje("\n");

        // Imprimir el promedio de edades de los miembros
        gimnasio.mostrarMensaje("Promedio de edades de los miembros del gimnasio:");
        System.out.println(gimnasio.calcularPromedioEdad());
        gimnasio.mostrarMensaje("\n");

        // Eliminar miembros cuyo nombre tenga al menos 3 vocales
        gimnasio.eliminarNombreVocales();
        System.out.println(gimnasio);

        
    }
}
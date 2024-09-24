package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Gimnasio {
    private String nombre;
    private LocalDate fechaInscripcion;
    private LinkedList<Miembro> miembros;
    private LinkedList<Entrenador> entrenadores;

    /**
     * Método constructor de la clase Gimnasio
     * @param nombre
     */
    public Gimnasio(String nombre) {
        this.nombre = nombre;
        miembros = new LinkedList<>();
        entrenadores = new LinkedList<>();
    }

    /**
     * Método para evitar miembros duplicados
     * @param cedula del miembro
     * @return centinela
     */
    public boolean verificarMiembro(String cedula) {
        boolean centinela = false;
        for (Miembro miembro : miembros) {
            if (miembro.getCedula().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Método para agregar un miembro al gimnasio
     * @param miembro
     */
    public void agregarMiembro(Miembro miembro) {
        if (!verificarMiembro(miembro.getCedula())) {
            miembros.add(miembro);
        }
    }

    /**
     * Método para eliminar un miembro del gimnasio
     * @param cedula del miembro
     */
    public void eliminarMiembro(String cedula) {
        for (Miembro miembro : miembros) {
            if (miembro.getCedula().equals(cedula)) {
                miembros.remove(miembro);
                break;
            }
        }
    }

    /**
     * Método para evitar entrenadores duplicados
     * @param correo del entrenador
     * @return centinela
     */
    public boolean verificarEntrenador(String correo) {
        boolean centinela = false;
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getCorreo().equals(correo)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Método para agregar un entrenador al gimnasio
     * @param entrenador
     */
    public void agregarEntrenador(Entrenador entrenador) {
        if (!verificarEntrenador(entrenador.getCorreo())) {
            entrenadores.add(entrenador);
        }
    }

    /**
     * Método para eliminar un entrenador del gimnasio
     * @param correo del entrenador
     */
    public void eliminarEntrenador(String correo) {
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getCorreo().equals(correo)) {
                entrenadores.remove(entrenador);
                break;
            }
        }
    }

    /**
     * Método para imprimir un mensaje
     * @param mensaje
     */
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // --------------------------------------------------------------
    // Requisitos solicitados en el taller

    /**
     * Método que muestra los nombres de los miembros de la lista en orden inverso
     */
    public void listaNombresInverso() {
        for (int i = miembros.size() - 1; i >= 0; i--) {
            Miembro miembro = miembros.get(i);
            mostrarMensaje(miembro.getNombre());
        }
    }

    /**
     * Método que crea una lista de miembros que son menores de 18 años.
     * @return Una lista de objetos cuya edad es menor de 18 años.
     */
    public LinkedList<Miembro> miembrosMenoresEdad() {
        LinkedList<Miembro> menores = new LinkedList<>();
        for (Miembro miembro : miembros) {
            if (miembro.getEdad() < 18) {
                menores.add(miembro);
            }
        }
        return menores;
    }
    // --------------------------------------------------------------



    // --------------------Métodos a completar---------------------

    /**
     * Método para calcular el promedio de edad de los miembros del gimnasio
     * @return promedio
     */
    public double calcularPromedioEdad(){
        double total = 0;
        for(Miembro miembro : miembros){
            total += miembro.getEdad();
        }
        double promedio = total/miembros.size();
        return promedio;
    }

    /**
     * Método para determinar si una letra es una vocal
     */
    public boolean determinarVocal(char letra){
        boolean vocal = false;
        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            vocal = true;
        }
        return vocal;
    }

    /**
     * Método para eliminar los miembros cuyo nombre contenga 3 vocales o más
     */
    public void eliminarNombreVocales(){
        for (int i = miembros.size() - 1; i >= 0; i--) {
            Miembro miembro = miembros.get(i);
            int cantidadVocales = 0;
            char[] chars = miembro.getNombre().toCharArray();
            for (char letra : chars){
                if(determinarVocal(letra)){
                    cantidadVocales += 1;
                }
            }
            if(cantidadVocales>=3){
                miembros.remove(i);
            }
        }
    }

    /**
     * Método para calcular la moda de las edades de los miembros
     * @return moda
     */
    public int modaEdades() {
        int moda = -1;
        int maxFrecuencia = 0;

        for (int i = 0; i < miembros.size(); i++) {
            int edadActual = miembros.get(i).getEdad();
            int frecuencia = 0;

            // Contar cuántas veces aparece la edad actual
            for (int j = 0; j < miembros.size(); j++) {
                if (miembros.get(j).getEdad() == edadActual) {
                    frecuencia++;
                }
            }

            // Actualizar la moda si la frecuencia actual es mayor que la anterior
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                moda = edadActual;
            }
        }

        return moda;
    }

    // --------------------Métodos a completar---------------------

    /**
     * Método para obtener el nombre del gimnasio
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para modificar el nombre del gimnasio
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la fecha de inscripción al gimnasio (?)
     * @return fechaInscripcion
     */
    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    /**
     * Método para modificar la fecha de inscripción al gimnasio (?)
     * @param fechaInscripcion
     */
    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    /**
     * Método para obtener la lista de miembros del gimnasio
     * @return miembros
     */
    public LinkedList<Miembro> getMiembros() {
        return miembros;
    }

    /**
     * Método para modificar la lista de miembros del gimnasio
     * @param miembros
     */
    public void setMiembros(LinkedList<Miembro> miembros) {
        this.miembros = miembros;
    }

    /**
     * Método para obtener la lista de entrenadores del gimnasio
     * @return entrenadores
     */
    public LinkedList<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    /**
     * Método para modificar la lista de entrenadores del gimnasio
     * @param entrenadores
     */
    public void setEntrenadores(LinkedList<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }

    /**
     * Método toString de la clase Gimnasio
     */
    @Override
    public String toString() {
        return "Gimnasio [nombre=" + nombre + ", fechaInscripcion=" + ", miembros=" + miembros
                + ", entrenadores=" + entrenadores + "]";
    }

}
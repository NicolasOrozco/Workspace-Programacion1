package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Curso {
    private String nombre;
    private double notaDef;
    public Profesor profesor;
    public Collection<Estudiante> estudiantes;

    /**
     * Método constructor de la clase Curso
     * @param nombre
     * @param notaDef
     * @param profesor
     */
    public Curso(String nombre, Profesor profesor){
        this.nombre=nombre;
        this.profesor=profesor;
        estudiantes = new LinkedList<>();
    }

    //Verificar que un no se reciban estudiantes duplicados
    public boolean verificarEstudiante(String id){
        boolean centinela = false;
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.getId().equals(id)){
                centinela = true;
            }
        }
        return centinela;
    }

    //Agregar un estudiante
    public void agregarEstudiante(Estudiante estudiante){
        if(!verificarEstudiante(estudiante.getId())){
            estudiantes.add(estudiante);
        }
    }

    //Calcular la nota definitiva de los estudiantes
    public String calcularDefinitiva(String cod, double nota1, double nota2, double nota3){
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.getId().equals(cod)){
                estudiante.setNota1(nota1);
                estudiante.setNota2(nota2);
                estudiante.setNota3(nota3);

                double resultado = (nota1+nota2+nota3)/3;
                String mensaje = "La nota definitiva de " + estudiante.getNombre() + " es: " + resultado;
                return mensaje;
            }
        }
        return "No se encontró el estudiante";
    }

    //Eliminar un estudiante
    public void eliminarEstudiante(String id){
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.getId().equals(id)){
                estudiantes.remove(estudiante);
                break;
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaDef() {
        return notaDef;
    }

    public void setNotaDef(double notaDef) {
        this.notaDef = notaDef;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }


    @Override
    public String toString() {
        return "Curso [nombre=" + nombre + ", notaDef=" + notaDef + ", profesor=" + profesor + ", estudiantes="
                + estudiantes + "]";
    }

}
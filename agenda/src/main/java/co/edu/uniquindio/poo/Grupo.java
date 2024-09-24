
package co.edu.uniquindio.poo;

import java.util.Collection;

import java.util.LinkedList;

public class Grupo {
   String nombre;
   Categoria categoria;
   public Collection<Contacto> participantes;

   /**
    * Método constructor de la clase grupo
    * @param nombre
    * @param categoria
    * @param participantes 
    */
   public Grupo(String nombre, Categoria categoria) {
      this.nombre = nombre;
      this.categoria = categoria;
      this.participantes = new LinkedList<>();
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

   public Collection<Contacto> getParticipantes() {
      return participantes;
   }

   public void setParticipantes(Collection<Contacto> contactos) {
      this.participantes = contactos;
   }

   //Método para verificar que no se permitan participantes duplicados en un grupo
   public boolean verificarParticipante(String telefono, String nombre) {
      boolean centinela = false;
      for (Contacto contacto : participantes) {
         if (contacto.getTelefono().equals(telefono) && contacto.getNombre().equals(nombre)) {
            centinela = true;
         }
      }
      return centinela;
   }

   //Método que limita el número de integrantes de un grupo a 5
   public boolean limiteIntegrantes(Collection<Contacto> contactos) {
      boolean superaLimite = false;
      if (contactos.size() >= 5) {
         superaLimite = true;
      }
      return superaLimite;
   }

   //Método para agregar paticipantes a un grupo
   public void agregarContactoParticipante(Contacto contacto) {
      if (!limiteIntegrantes(participantes)) {
         if (!verificarParticipante(contacto.getTelefono(), contacto.getNombre())) {
            participantes.add(contacto);
         }
      }
   }

   //Método para eliminar participantes de un grupo
   public void eliminarContactoParticipante(String telefono) {
      for (Contacto contacto : participantes) {
         if (contacto.getTelefono().equals(telefono)) {
            participantes.remove(contacto);
         }
      }

   }

   //Método ToString de la clase Grupo
   @Override
   public String toString() {
      return "\t\tGrupo \nNombre=" + nombre + " \nCategoria=" + categoria + " \nParticipante=" + participantes + "\n\n";
   }

 

}

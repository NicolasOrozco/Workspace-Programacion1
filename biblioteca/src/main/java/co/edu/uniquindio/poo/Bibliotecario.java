package co.edu.uniquindio.poo;

public class Bibliotecario extends Persona {
    private double salario;

    /**
     * Método constructor de la clase Bibliotecario
     * 
     * @param nombre   del bibliotecario
     * @param cedula   del bibliotecario
     * @param telefono del bibliotecario
     * @param correo   del bibliotecario
     * @param salario  del bibliotecario
     */
    public Bibliotecario(String nombre, String cedula, String telefono, String correo, double salario) {
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
    }

    /**
     * Método para obtener el salario de un bibliotecario
     * 
     * @return salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Método para modificar el salario de un bibliotecario
     * 
     * @param salario del bibliotecario
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Método toString de la clase Bibliotecario
     */
    @Override
    public String toString() {
        return "Bibliotecario [" + super.toString() + "salario=" + salario + "]";
    }
}

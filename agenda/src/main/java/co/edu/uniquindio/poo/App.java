
package co.edu.uniquindio.poo;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        //Creación de la Agenda
        Agenda agenda = new Agenda();
        //Boolean que permite repetir la ejecución del código hasta que el programa finalice
        boolean continuar = true;

        while (continuar) {
            String[] opciones = {"Contactos", "Reuniones", "Grupos", "Salir"};
            String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Menú Principal", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            //Casos en los que el programa finaliza
            if (seleccion == null || seleccion.equals("Salir")) {
                continuar = false;
            } 
            //Llamada al método que determina las acciones según la opción elegida
            else {
                agenda.manejarSeleccion(seleccion, agenda);
            }
        }
    }

    
}

package co.edu.uniquindio.poo;
import java.util.Scanner;

public class suma {
    /**
     * Método main para ingresar un arreglo de valores y sumarlos
     * @param args
     */
    public static void main(String[] args) {
        int tamaño = ingresarEntero("Ingrese el tamaño del arreglo: ");
        int[] arreglo = ingresarValores(tamaño);
        int suma = sumarValores(arreglo);
        mostrarMensaje(suma);
    }
    /**
     * Método para ingresar el tamaño del arreglo
     * @param mensaje
     * @return tamaño
     */
    public static int ingresarEntero(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextInt();
    }
    /**
     * Método para ingresar los valores a sumar
     * @param tamaño
     * @return arreglo
     */
    public static int[] ingresarValores(int tamaño) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[tamaño];
        System.out.println("Ingrese los valores a sumar: ");
       
        for(int i = 0; i < tamaño; i++){
            System.out.print("Elemento " + (i+1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        return arreglo;
    }

    /**
     * Método para sumar los valores del arreglo
     * @param arreglo
     * @return suma
     */
    public static int sumarValores(int[] arreglo) {
        int suma = 0;
        for (int i : arreglo) {
            suma += i;
        }
        return suma;
    }

    /**
     * Método para mostrar un mensaje con la suma de los valores
     * @param suma
     */
    public static void mostrarMensaje(int suma) {
        System.out.println("La suma de los elementos dados es: " + suma);
    }
}
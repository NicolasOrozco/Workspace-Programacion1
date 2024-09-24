package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int entero = ingresarEntero("Ingrese un número entero: ");
        int factorial = calcular_factorial(entero);
        mostrarMensaje(entero, factorial);
    }
    /**
     * Método que calcula el factorial del número ingresado
     * @param entero
     * @return factorial
     */
    public static int calcular_factorial(int entero) {
        int factorial = 1;
        while (entero >= 2) {
            factorial = factorial * entero;
            entero--;
        }
        return factorial;
    }
    /**
     * Método que permite ingresar un entero
     * @param mensaje
     * @return entero
     */
    public static int ingresarEntero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextInt();
    }
    /**
     * Método que imprime un mensaje con el número ingresado y el factorial del mismo
     * @param entero
     * @param factorial
     */
    public static void mostrarMensaje(int entero, int factorial) {
        System.out.println("El factorial de " + entero + " es " + factorial);
    }

}
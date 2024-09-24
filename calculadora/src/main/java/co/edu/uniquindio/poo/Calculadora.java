package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int a = ingresarEntero("Ingrese el primer número:");
        int b = ingresarEntero("Ingrese el primer número:");
        int opcion = ingresarEntero("Ingrese la operación que desea realizar \n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir)");
        int resultado = calcular(opcion,a,b);
        mostrarMensaje(resultado);
    }

    public static int ingresarEntero(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextInt();
    }


    public static int sumar(int numA, int numB) {
        int resultado = numA + numB;
        return resultado;
    }

    public static int restar(int numA, int numB) {
        int resultado = numA - numB;
        return resultado;
    }

    public static int multiplicar(int numA, int numB) {
        int resultado = numA * numB;
        return resultado;
    }

    public static int dividir(int numA, int numB) {
        int resultado = numA / numB;
        return resultado;
    }

    public static int calcular(int opcion, int numA, int numB) {
        switch (opcion) {
            case 1:
                return sumar(numA, numB);
            case 2:
                return restar(numA, numB);
            case 3:
                return multiplicar(numA, numB);
            case 4:
                return dividir(numA, numB);
            default:
                System.out.println("Ingrese una opción válida");
                return 0;
        }
    }

    public static void mostrarMensaje(int resultado){
        System.out.println("El resultado es" + resultado);
    }

}

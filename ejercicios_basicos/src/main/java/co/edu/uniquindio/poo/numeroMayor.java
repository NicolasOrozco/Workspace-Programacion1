package co.edu.uniquindio.poo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class numeroMayor {
    public static void main(String[] args) {
        int entero1 = ingresarEntero("Ingrese el primer número: ");
        int entero2 = ingresarEntero("Ingrese el segundo número: ");
        int entero3 = ingresarEntero("Ingrese el tercer número: ");
        int mayor = calcularMayor(entero1, entero2, entero3);
        mostrarMensaje(mayor);
    }

    public static int ingresarEntero(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public static int calcularMayor(int entero1, int entero2, int entero3){
        if(entero1>entero2 && entero1>entero3){
            return entero1;
        }
        else if(entero2>entero1 && entero2>entero3){
            return entero2;
        }
        else{
            return entero3;
        }
    }

    public static void mostrarMensaje(int mayor){
        String mensaje = "El número mayor es " + mayor;
        System.out.println(mensaje);
    }
}

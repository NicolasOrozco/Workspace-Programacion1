package co.edu.uniquindio.poo;

import java.util.Scanner;

public class identificarEntero {
    public static void main(String[] args) {
        int entero = ingresarEntero("Ingrese un número entero: ");
        String identificar = identificar(entero);
        mostrarMensaje(identificar);
    }

    public static int ingresarEntero(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    public static String identificar(int entero){
        String mensaje;
        if(entero<0){
            mensaje = "negativo";
        }
        else if(entero==0){
            mensaje = "cero";
        }
        else{
            mensaje = "positivo";
        }
        return mensaje;
    }

    public static void mostrarMensaje(String identificar){
        String mensaje = "El número ingresado es " + identificar;
        System.out.println(mensaje);
    }
}

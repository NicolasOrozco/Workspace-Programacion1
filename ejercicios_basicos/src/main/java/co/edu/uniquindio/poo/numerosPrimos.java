package co.edu.uniquindio.poo;

import java.util.Scanner;

public class numerosPrimos {
    public static void main(String[] args) {
        int entero = ingresarEntero("Ingrese un número entero: ");
        String comprobacion = comprobar(entero);
        mostrarMensaje(comprobacion);
    }

    public static int ingresarEntero(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    public static String comprobar(int entero){
        boolean primo = true;
        for(int i = 2; i < entero; i++){
            if(entero%i==0){
                primo = false;
                break;
            }
        }
        if(primo == true){
            return "si";
        }
        else{
            return "no";
        }
    }

    public static void mostrarMensaje(String comprobacion){
        System.out.println("El número ingresado " + comprobacion + " es primo.");
    }
}
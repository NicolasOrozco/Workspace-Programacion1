package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        int[] arreglo = {1,2,3,4};
        int[] invertido = invertirArreglo(arreglo);
        System.out.println(invertido);
    }

    public static int[] invertirArreglo(int[] arreglo){
        int[] invertido = new int[4];
        arreglo[i] = 3;
        for(int i=0; i<4; i++){
            invertido[i] = arreglo[i];
            arreglo[i]--;
        }
        return invertido;
    }
}

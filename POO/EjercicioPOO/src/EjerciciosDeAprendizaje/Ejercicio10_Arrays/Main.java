package EjerciciosDeAprendizaje.Ejercicio10_Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int longitudArreglo;
        double[] arregloA = new double[50];

        longitudArreglo = arregloA.length;
        arregloA = llenarArreglo(longitudArreglo);
        Arrays.sort(arregloA);
        //imprimirArreglo(arregloA);

        //LLENAR ARREGLO B
        double[] arregloB = new double[20];
        for (int i = 0; i < arregloB.length; i++) {
            if (i < 10) {
                arregloB[i] = arregloA[i];
            } else {
                arregloB[i] = 0.5;
            }
        }

        imprimirArreglo(arregloB);
    }

    //Método para llenar arreglo
    public static double[] llenarArreglo(int longArreglo) {
        double[] arreglo = new double[longArreglo];
        for (int i = 0; i < longArreglo; i++) {
            double num = Math.floor(Math.random() * 100 + 1);// con el metodo math.floor
            // quitamos los decimales y con math.random creamos número aleatorio
            arreglo[i] = num;
        }
        return arreglo;
    }

    //Método para imprimir el arreglo
    public static void imprimirArreglo(double[] arreglo) {
        int longitudArreglo = arreglo.length;
        System.out.print("{ ");
        for (int i = 0; i < longitudArreglo; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println(" }");
    }
}

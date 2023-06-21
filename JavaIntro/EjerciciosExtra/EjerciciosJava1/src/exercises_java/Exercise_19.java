/*
 Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package exercises_java;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Exercise_19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean comparar;
        int longArreglo1;
        System.out.println("Ingrese la longitud del vector Nº1");
        longArreglo1 = leer.nextInt();

        int[] vector1 = new int[longArreglo1];

        llenarVector(vector1, longArreglo1, leer);

        System.out.println("Ingrese la longitud del vector Nº2");
        int longArreglo2 = leer.nextInt();

        int[] vector2 = new int[longArreglo2];
        llenarVector(vector2, longArreglo2, leer);
        
        comparar = compararVectores(vector1, vector2, longArreglo1, longArreglo2);
        
        if (comparar) {
            System.out.println("Los arreglos son iguales");
        }else{
            System.out.println("Los arrglos son diferentes");
        }
        
    }

    //FUNCIÓN PARA LLENAR LOS VECTORES
    public static void llenarVector(int vector[], int longVector, Scanner leer) {
        int numero;
        for (int i = 0; i < longVector; i++) {
            System.out.println("Ingrese el elemento de su vector en la posición Nº" + i);
            numero = leer.nextInt();
            vector[i] = numero;
        }
    }

    //FUNCIÓN PARA COMPARAR LA IGUALDAD DE LOS VECTORES
    public static boolean compararVectores(int vector1[], int vector2[], int longVector1, int longVector2) {

        if (longVector1 != longVector2) { // la longitud de los vectores no son iguales por lo tanto los vectores no son iguales
            return false;
        }
        for (int i = 0; i < longVector1; i++) {
            if (vector1[i] != vector2[i]) {
                return false; // Los elementos en la posición i no son iguales, por lo tanto los vectores no son iguales
            }
        }
        return true;
    }
}

/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package exercises_java;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Exercise_18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int longArreglo;
        int numero;
        int suma;

        System.out.println("Ingrese la longitud de su arreglo");
        longArreglo = leer.nextInt();

        int[] numeros = new int[longArreglo];

        for (int i = 0; i < longArreglo; i++) {
            System.out.println("Ingrese el elemento Nº" + (i + 1));
            numero = leer.nextInt();
            numeros[i] = numero;            
        }
        
        suma = sumarVector(numeros, longArreglo);
        System.out.println("La suma de todos los elementos de su arreglo es: "+ suma);
    }
    
    public static int sumarVector(int vector[],int longArreglo ){
        int suma = 0;
        for (int i = 0; i < longArreglo; i++) {
            suma += vector[i];
        }
        return suma;
    }
}

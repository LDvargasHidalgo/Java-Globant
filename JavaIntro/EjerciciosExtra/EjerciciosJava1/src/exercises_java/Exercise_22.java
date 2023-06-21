/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises_java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Exercise_22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        int matriz[][], nFilas, nColumnas;
        int sumaElementos = 0;

        System.out.println("Ingrese el número de filas");
        nFilas = leer.nextInt();
        System.out.println("Ingrese el número de columnas");
        nColumnas = leer.nextInt();
        matriz = new int[nFilas][nColumnas];

        //LLENAR LA MATRIZ CON ELEMENTOS RANDOM
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                matriz[i][j] = random.nextInt(9);
            }
        }
        // IMPRIMIR LA MATRIZ
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        // SUMAR LOS ELEMENTOS
        
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                sumaElementos += matriz[i][j];
            }
        }
        System.out.println("Suma = " + sumaElementos);
    }
}

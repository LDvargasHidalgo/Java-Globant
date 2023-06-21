/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package exercises_java;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Exercise_4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero;
        System.out.println("Escriba un número entre 1 - 10");
        numero = leer.nextInt();

        if (numero <= 10) {
            if (numero <= 3) {
                for (int i = 0; i < numero; i++) {
                    System.out.print("I");
                }
                System.out.println(" ");
            } else if (numero == 4) {
                System.out.println("IV");
            } else if (numero <= 8) {
                System.out.print("V");
                for (int i = 0; i < numero - 5; i++) {
                    System.out.print("I");
                }
                System.out.println(" ");
            } else if (numero == 9) {
                System.out.println("IX");
            } else if (numero == 10) {
                System.out.println("X");
            }
        } else {
            System.out.println("El número no esta dentro del rango");
        }
    }
}

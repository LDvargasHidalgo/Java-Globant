/*
 Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package exercises_java;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Exercise_6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int nPersonas;
        double sumTotal = 0;
        double sumEstMenor = 0;
        double promedioTotal;
        double promedioEstMenor;
        int countEstaturaMenor = 0;
        int estatura;

        System.out.println("A que cantidad de personas le vas a pedir la altura");
        nPersonas = leer.nextInt();

        for (int i = 0; i < nPersonas; i++) {
            System.out.println("Escriba la estatura de la persona Nº " +  (i+1)+" en cm");
            estatura = leer.nextInt();
            sumTotal += estatura;
            if (estatura < 160) {
                countEstaturaMenor += 1;
                sumEstMenor += estatura;
            }
        }

        promedioEstMenor = sumEstMenor / countEstaturaMenor;
        System.out.println("Tenemos " + countEstaturaMenor + " personas con una estatura menor a 1.60, el promedio en "
                          + "estatura es de " + promedioEstMenor );
        promedioTotal = sumTotal/nPersonas;
        System.out.printf("El promedio total es: %.2f%n", promedioTotal);

    }

}

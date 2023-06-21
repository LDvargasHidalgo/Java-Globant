/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises_java;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Exercise_17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        boolean numeroPrimo;
       
        System.out.println("Ingrese un número nosotros le diremos si es primo o no");
        numero = leer.nextInt();
        
        numeroPrimo = numeroPrimo(numero);
        System.out.println(numeroPrimo);
    }

    public static boolean numeroPrimo(int numero) {
        int count = 0;
        int residuo;
        for (int i = 1; i <= numero; i++) {
            residuo = numero % i;
            if (residuo == 0) {
                count++;
            }
        }
        if (count <= 2) {
            return true;
        } else {
            return false;
        }       
    }
}

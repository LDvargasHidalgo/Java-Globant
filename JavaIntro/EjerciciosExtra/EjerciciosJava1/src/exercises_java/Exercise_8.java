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
public class Exercise_8 {
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
          
         int numero;
         int count = 0;
         int cantPares= 0;
         int cantImpares = 0;
        
         do { 
             System.out.println("Escriba un número");
             numero = leer.nextInt();
             count += 1;
             if (numero % 2 == 0) {
                 cantPares +=1;
             }else{
                 cantImpares += 1;
             }             
        } while (numero % 5 != 0);
         System.out.println("La cantidad de números leidos es: "+ count);
         System.out.println("Cantidad de numeros pares: " + cantPares);
         System.out.println("Cantidad de números impares :" + cantImpares);
    }
}

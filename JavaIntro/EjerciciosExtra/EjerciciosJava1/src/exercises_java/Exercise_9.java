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
public class Exercise_9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1;
        int num2;
        int residuo;
        int cociente = 0;

        do {
            System.out.println("Escriba valor para el dividendo");
            num1 = leer.nextInt();
            System.out.println("Escriba valor para el divisor");
            num2 = leer.nextInt();

        } while (num1 <= 1 || num2 <= 1);

        residuo = num1;
       

        do {
            System.out.print(residuo + "-" + num2 + "=");
            residuo = residuo - num2;            
            cociente += 1;
            System.out.println(residuo);
           
            
        } while (residuo >= num2);

        System.out.println("residuo: " + residuo);
        System.out.println("cociente: " + cociente);

    }

}

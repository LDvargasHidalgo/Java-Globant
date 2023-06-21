/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String
 */
package exercises_java;

import java.util.Scanner;

public class Exercise_3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String vocal;
        System.out.println("Ingrese una letra");
        vocal = scan.nextLine();

        if (vocal.equalsIgnoreCase("a") || vocal.equalsIgnoreCase("e") || vocal.equalsIgnoreCase("i") || vocal.equalsIgnoreCase("o")
                          || vocal.equalsIgnoreCase("u")) {
            System.out.println("Su letra es una vocal");
        } else {
            System.out.println("Su letra no es una vocal");
        }  
       
                     
    }

}

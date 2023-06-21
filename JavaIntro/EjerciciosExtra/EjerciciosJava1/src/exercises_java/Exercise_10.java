/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package exercises_java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Exercise_10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Random random = new Random();

        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);

        int mult = num1 * num2;
        System.out.println("num1 "+ num1);
        System.out.println("num2 "+ num2);
        int respuesta;
        System.out.println("Adivina el valor de la multiplicación");
        respuesta = leer.nextInt();

        while (respuesta != mult) {
            System.out.println("Adivina el valor de la multiplicación");
            respuesta = leer.nextInt();
        }

        System.out.println("Felicitaciones " + num1 +"*" + num2 + "=" + respuesta);

    }

}

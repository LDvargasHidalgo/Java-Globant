/*
 Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package exercises_java;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Exercise_15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        int num1;
        int num2;
        double resultado;

        System.out.println("Ingrese un número");
        num1 = leer.nextInt();

        System.out.println("Ingrese un número");
        num2 = leer.nextInt();

        do {
            System.out.println("****MENU***");
            System.out.println("Escoje la opcion");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 0:                   
                    System.out.println("Hasta pronto.. =) ");
                    break;
                case 1:
                    resultado = sumar(num1, num2);
                    System.out.println(num1 + " + " + num2 + " = " + resultado);
                    break;
                case 2:
                    resultado = restar(num1, num2);
                    System.out.println(num1 + " - " + num2 + " = " + resultado);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    System.out.println(num1 + " * " + num2 + " = " + resultado);
                    break;
                case 4:
                    resultado = dividir(num1, num2);
                    System.out.println(num1 + " / " + num2 + " = " + resultado);
                    break;
                default:
                    System.out.println("Opción invalida");
            }
            
        } while (opcion != 0);

    }

    //Funcion sumar
    public static int sumar(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    // Función restar
    public static int restar(int num1, int num2) {
        int resultado = num1 - num2;
        return resultado;
    }

    //Función multiplicar
    public static int multiplicar(int num1, int num2) {
        int resultado = num1 * num2;
        return resultado;
    }

    //Función dividir    
    public static int dividir(int num1, int num2) {
        int resultado = num1 / num2;
        return resultado;
    }

}

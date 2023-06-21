/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random(). 

 */
package exercises_java;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Exercise_23 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //Leer las 5 palabras y guardarlas en un array
        String[] palabras = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la palabra " + (i + 1) + ": ");
            palabras[i] = leer.nextLine();

            // verificar que la palabra tenga entre 3-5 caracteres
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres");
                System.out.print("Ingrese la palabra " + (i + 1) + ": ");
                palabras[i] = leer.nextLine();
            }
        }

        //Crear la matriz de la sopa de letras
        char[][] sopa = new char[20][20];

        
        

        //Ubicar las palabras en la fila seleccionada
        int columnaActual = 0;
        for (String palabra : palabras) {
            // seleccionar una fila aleatoria para ubicar las palabras horizontales
            int filaAleatoria = (int) (Math.random() * 20);
            int longitudPalabra = palabra.length();
            String subcadena = palabra.substring(0, longitudPalabra);
            for (int i = 0; i < longitudPalabra; i++) {
                sopa[filaAleatoria][columnaActual + i] = subcadena.charAt(i);
            }
            columnaActual += longitudPalabra;
        }

        // Rellenar los espacios no utilizados con números aleatorios del 0 al 9
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == 0) {
                    int numeroAleatorio = (int) (Math.random() * 10);
                    sopa[i][j] = (char) (numeroAleatorio + '0');
                }
            }
        }
        // Imprimir la sopa de letras por pantalla
        System.out.println("Sopa de letras:");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }

    }
}

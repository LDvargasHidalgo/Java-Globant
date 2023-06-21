/*
 Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados
 */
import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = leer.nextInt();

        int cantidadDigitos = contarDigitos(numero);
        System.out.println("La cantidad de dígitos es: " + cantidadDigitos);
    }

    public static int contarDigitos(int numero) {
        if (numero == 0) {
            return 1;
        }
        
        int contador = 0;
        // Aplicar el operador de división hasta que el número se convierta en 0
        while (numero != 0) {
            numero /= 10;  // Dividir el número entre 10 para eliminar el último dígito
            contador++;   // Incrementar el contador de dígitos
        }

        return contador;
    }
}



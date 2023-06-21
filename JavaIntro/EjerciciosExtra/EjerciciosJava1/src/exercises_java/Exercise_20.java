/*
 Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector
 */
package exercises_java;

import java.util.Random;

/**
 *
 * @author Daniela
 */
public class Exercise_20 {
    public static void main(String[] args) {
        int[] vector = new int[4];
        
        llenarVector(vector);
        mostrarVector(vector);
        
    }
    
    //FUNCION RELLENAR VECTOR
    public static void llenarVector(int vector[]){
        Random random = new Random();        
        for (int i = 0; i < 4; i++) {
            int numero = random.nextInt(20);
            vector[i] = numero;
        }
    }
    
    //FUNCIÓN MOSTRAR VECTOR
    public static void mostrarVector(int vector[]){
        int numero;
        System.out.print("[");
        for (int i = 0; i < 4; i++) {
            numero = vector[i];
            System.out.print(numero + "-" );
        }
        System.out.println("]");
    }
}

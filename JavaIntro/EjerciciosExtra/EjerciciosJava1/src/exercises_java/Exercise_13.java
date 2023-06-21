/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package exercises_java;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Exercise_13 {
    public static void main(String[] args) {
        
        Scanner leer = new  Scanner(System.in);
        
        int nEscalones;
        String escalera= "";
        
        System.out.println("Ingrese la cantidad de escalones");
        nEscalones = leer.nextInt();
        
        for (int i = 1; i <= nEscalones; i++) {
            String iString = Integer.toString(i);
            escalera = escalera.concat(iString);
            System.out.println(escalera);
        }
    }    
}

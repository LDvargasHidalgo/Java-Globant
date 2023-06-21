/*
 *Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package exercises_java;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Exercise_14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidadFamilias;
        int cantidadHijos;
        int edad;
        int count= 0;
        double sumaEdades = 0;
        double promedio;

        System.out.println("Esriba la cantidad de familias encuestadas");
        cantidadFamilias = leer.nextInt();

        for (int i = 0; i < cantidadFamilias; i++) {
            System.out.println("FAMILIA Nº" + (i + 1));
            System.out.println("Cuantos hijos tienen");
            cantidadHijos = leer.nextInt();

            for (int j = 0; j < cantidadHijos; j++) {
                System.out.println("Edad del hijo Nº " + (j + 1));
                edad = leer.nextInt();
                sumaEdades += edad;
                count +=1;                
            }
        }
        
        promedio = sumaEdades / count;
        System.out.println("suma" + sumaEdades);
        System.out.println("Tenemos en total " + count + " niños " + " y su promedio de edad"
                          + "es de " + promedio + " Años ");
    }
}

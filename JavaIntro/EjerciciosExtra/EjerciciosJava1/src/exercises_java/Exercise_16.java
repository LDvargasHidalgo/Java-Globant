/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”. en ja
 */
package exercises_java;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Exercise_16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int edad= 0;
        String nombre = "";
        
        
        mayorEdad(nombre, edad, leer);
    }
    
    
    //FUNCIÓN MAYOR DE EDAD Y DATOS
    public static void mayorEdad(String nombre, int edad, Scanner leer){
        String opcion = "si";
        
        // si el valor de la variable opcion es diferente a NO ignorando mayus y minus
        while (!opcion.equalsIgnoreCase("No")) {            
            System.out.println("Ingrese el nombre de la persona");
            nombre = leer.nextLine();
           
            
            System.out.println("Ingrese la edad de la persona");
            edad = leer.nextInt();
            leer.nextLine(); // Consumir el salto de línea pendiente
            
            //Operador ternario, condicional para asignar un valor a una variable
            String mensaje = (edad >= 18) ? "mayor de edad" : "menor de edad";
            
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Es " + mensaje);

            System.out.println("¿Desea ingresar otra persona? (Si/No):");
            opcion = leer.nextLine();
        }
    }
    
}

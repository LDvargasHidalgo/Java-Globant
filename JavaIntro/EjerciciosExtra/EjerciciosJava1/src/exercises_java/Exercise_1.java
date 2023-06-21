/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package exercises_java;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Exercise_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int minutesTotals, hours, minute;
        System.out.println("Type the minutes you want to convert to hours");
        minutesTotals = leer.nextInt();
        
        hours = minutesTotals / 60;
        minute = minutesTotals % 60;
        
        System.out.println("In " + minutesTotals + " minutes, there are "+ hours + " hours and  " + minute + " minutes");
        
        
      
        
    }
    
}

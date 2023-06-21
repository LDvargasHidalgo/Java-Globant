/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises_java;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Exercise_7 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int cantidadNumeros;
        int count = 1;
        int num;       
        int sumatoria;
        double promedio;
             
        
        System.out.println("Cantidad de números que vas a utilizar");
        cantidadNumeros = leer.nextInt();
        
        System.out.println(count + ". Escriba el número");
        num = leer.nextInt();
        int numMenor = num;
        int numMayor = num;
        sumatoria = num;
        System.out.println("sumatoria" + sumatoria);
        
        while (count < cantidadNumeros) { 
            System.out.println((count+1) + ". Escriba el número");
            num = leer.nextInt();
            sumatoria += num;
            System.out.println("sumatoria" + sumatoria);
            count += 1;           
            if (num > numMayor) {
                numMayor = num;
            }else if (num < numMenor) {
                numMenor = num;
            }            
        }
        System.out.println("Número mayor " + numMayor);
        System.out.println("Número menor " + numMenor);
        promedio = sumatoria/cantidadNumeros;
        System.out.println("suma " + sumatoria);
        System.out.println("Promedio = " + promedio);
    }
    
}

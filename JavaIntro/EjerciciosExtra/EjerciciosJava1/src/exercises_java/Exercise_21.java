/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
package exercises_java;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Exercise_21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Double[] promedioAlumnos = new Double[3];
        int countAprobados=0;
        int countDesaprobados=0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota del primer trabajo práctico evaluativo"
                              + " para el alumno Nº" + (i + 1));
            Double notaPracticoEvaluativo = leer.nextDouble();

            System.out.println("Ingrese la nota del segundo trabajo práctico evaluativo"
                              + " para el alumno Nº" + (i + 1));
            Double notaPracticoEvaluativo2 = leer.nextDouble();

            System.out.println("Ingrese la nota del primer integrador"
                              + " para el alumno Nº" + (i + 1));
            Double primerIntegrador = leer.nextDouble();

            System.out.println("Ingrese la nota del segundo integrador"
                              + " para el alumno Nº" + (i + 1));
            Double segundoIntegrador = leer.nextDouble();

            // Calcular el promedio ponderado
            Double promedio = notaPracticoEvaluativo * 0.10
                              + notaPracticoEvaluativo2 * 0.15
                              + primerIntegrador * 0.25
                              + segundoIntegrador * 0.50;

            promedioAlumnos[i] = promedio;
        }

        // Mostrar los promedios de los alumnos
        System.out.println("Promedios de los alumnos:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Alumno Nº" + (i + 1) + ": " + promedioAlumnos[i]);
            
            if(promedioAlumnos[i]>=7){
                countAprobados+=1;
            }else{
                countDesaprobados+=1;
            }
        }
        System.out.println(countAprobados + " alumnos aprobaron");
        System.out.println(countDesaprobados + " Alumnos desaprobaron");
    }
}

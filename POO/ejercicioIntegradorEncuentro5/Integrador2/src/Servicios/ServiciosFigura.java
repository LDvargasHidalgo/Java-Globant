package Servicios;

import Entidades.Figura;

import java.util.Scanner;

public class ServiciosFigura {

    Scanner scan  = new Scanner(System.in);
    public Figura PerimetroArea(){
        Figura f1 = new Figura();
        int opcion;
        do {
            System.out.println("Calculadora Geométrica");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Círculo");
            System.out.println("5. Hexágono");
            System.out.println("6. Pentágono");
            System.out.println("7. Rombo");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
             opcion = scan.nextInt();

             switch (opcion){
                 case 1:

             }
        }while (opcion !=0);



    }
}

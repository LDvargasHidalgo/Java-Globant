package Ejercicio6;

import Ejercicio6.Entidades.Cafetera;
import Ejercicio6.Servicios.ServicioCafetera;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Cafetera cafetera = new Cafetera(500, 300);
        ServicioCafetera servicioCafetera = new ServicioCafetera();
        int opcion;
        do {
            System.out.println("Bienvenido a Nespresso");
            System.out.println("Elija una opción");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar cafe");
            System.out.println("0. SALIR");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    servicioCafetera.llenarCafetera(cafetera);
                    break;
                case 2:
                    servicioCafetera.ServirTaza(cafetera);
                    break;
                case 3:
                    servicioCafetera.VaciarCafetera(cafetera);
                    break;
                case 4:
                    servicioCafetera.AgregarCafe(cafetera);
                    break;
                case 0:
                    System.out.println("Regresa pronto");
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (opcion != 0);
    }
}

package EjerciciosDeAprendizaje.Ejercicio6.Servicios;

import EjerciciosDeAprendizaje.Ejercicio6.Entidades.Cafetera;

import java.util.Scanner;

public class ServicioCafetera {
    Scanner scan = new Scanner(System.in);

    //Metodo para llenar la cafetera
    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }

    //Metodo servir taza
    public void ServirTaza(Cafetera cafetera) {
        int tamañoTaza;
        System.out.println("Cual es el tamaño de la taza");
        tamañoTaza = scan.nextInt();

        if (cafetera.getCantidadActual() < tamañoTaza) {
            System.out.println("No logramos llenar tu taza");
            System.out.println("tu taza quedo llena con " + cafetera.getCantidadActual() + " onz ");
            cafetera.setCantidadActual(0);
            System.out.println("La cafetera esta vacia");

        } else {
            System.out.println("Tu taza esta llena");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamañoTaza);
            System.out.println("Aun tenemos disponible en la cafetera: " + cafetera.getCantidadActual() + " onz");
        }
    }

    //Vaciar cafetera
    public void VaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
    }

    //Agregar cafe
    public void AgregarCafe(Cafetera cafetera) {
        System.out.println("Que cantidad de cafe desea agregar a la cafetera");
        int cantidadCafe = scan.nextInt();

        //tomamos la cantidad de cafe y sumamos la cantidad que tiene la cafetera
        int cantidad = cantidadCafe + cafetera.getCantidadActual();

        //si el valor cantidad en mayor a nuestra capacidad maxima no podemos agregar todo el cafe
        if (cantidad > cafetera.getCapacidadMaxima()) {
            System.out.println("Es demasiado cafe solo podemos agregar "+ (cafetera.getCapacidadMaxima()-cafetera.getCantidadActual()) + " onz" );
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        }else {
            cafetera.setCantidadActual(cantidadCafe+ cafetera.getCantidadActual());
            System.out.println("La cafetera tiene: "+ cafetera.getCantidadActual()+ " onz ");
        }

    }
}

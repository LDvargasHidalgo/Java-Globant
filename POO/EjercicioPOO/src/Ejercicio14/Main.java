package Ejercicio14;

import Ejercicio14.Entidades.Movil;
import Ejercicio14.Srvicios.ServicioMovil;

public class Main {
    public static void main(String[] args) {
        char codigo[] = new char[7];
        ServicioMovil servicioMovil = new ServicioMovil();
        Movil movil = servicioMovil.cargarCelular();
        System.out.println(movil.toString());

    }
}

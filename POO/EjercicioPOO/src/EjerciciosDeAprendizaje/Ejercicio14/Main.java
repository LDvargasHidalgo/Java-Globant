package EjerciciosDeAprendizaje.Ejercicio14;

import EjerciciosDeAprendizaje.Ejercicio14.Entidades.Movil;
import EjerciciosDeAprendizaje.Ejercicio14.Srvicios.ServicioMovil;

public class Main {
    public static void main(String[] args) {
        char codigo[] = new char[7];
        ServicioMovil servicioMovil = new ServicioMovil();
        Movil movil = servicioMovil.cargarCelular();
        System.out.println(movil.toString());

    }
}

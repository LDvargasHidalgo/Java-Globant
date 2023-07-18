package EjerciciosDeAprendizaje.Ejercicio1;

import EjerciciosDeAprendizaje.Ejercicio1.Entidades.Libro;
import EjerciciosDeAprendizaje.Ejercicio1.Servicios.ServicioLibro;

public class Main {
    public static void main(String[] args) {
        ServicioLibro sl = new ServicioLibro();
        Libro l1 = sl.cargarLibro();
        sl.MostrarDatos(l1);
    }
}

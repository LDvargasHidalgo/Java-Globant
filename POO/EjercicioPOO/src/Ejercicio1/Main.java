package Ejercicio1;

import Ejercicio1.Entidades.Libro;
import Ejercicio1.Servicios.ServicioLibro;

public class Main {
    public static void main(String[] args) {
        ServicioLibro sl = new ServicioLibro();
        Libro l1 = sl.cargarLibro();
        sl.MostrarDatos(l1);
    }
}

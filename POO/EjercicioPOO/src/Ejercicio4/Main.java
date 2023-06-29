package Ejercicio4;

import Ejercicio4.Entidades.Rectangulo;
import Ejercicio4.Servicios.ServicioRectangulo;

public class Main {
    public static void main(String[] args) {
        ServicioRectangulo sRectangulo = new ServicioRectangulo();
        double perimetro;
        double superficie;

        Rectangulo r1 = sRectangulo.CrearRectangulo();
        sRectangulo.DibujarRectangulo(r1);
        perimetro = sRectangulo.Perimetro(r1);
        superficie = sRectangulo.Superficie(r1);
        System.out.println(" Perimetro:" + perimetro + "\n Superficie: "+superficie);

    }
}

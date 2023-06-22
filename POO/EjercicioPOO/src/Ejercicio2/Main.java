package Ejercicio2;

import Ejercicio2.Entidades.Circunferencia;
import Ejercicio2.Servicios.ServicioCircunferencia;

public class Main {
    public static void main(String[] args) {
        Double area;
        Double perimetro;

        ServicioCircunferencia serCircunferencia = new ServicioCircunferencia();
        Circunferencia c1 = serCircunferencia.CrearCircunferencia();

        area = serCircunferencia.AreaCircunferencia(c1);
        perimetro = serCircunferencia.Perimetro(c1);
        System.out.println("Radio Circunferencia:"+ c1.getRadio()+"\n Area:" + area  + "\n Perimetro: " +
                perimetro);
    }
}

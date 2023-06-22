package Ejercicio2.Servicios;

import Ejercicio2.Entidades.Circunferencia;

import java.util.Scanner;

public class ServicioCircunferencia {
    Scanner scan = new Scanner(System.in);
    public Circunferencia CrearCircunferencia(){
        Circunferencia circunferencia = new Circunferencia();
        System.out.println("Ingrese el radio de la circunferencia");
        circunferencia.setRadio(scan.nextDouble());
        return circunferencia;
    }

    public Double AreaCircunferencia(Circunferencia circun){
        Double area = Math.PI * (circun.getRadio()* circun.getRadio());
        return area;
    }

    public Double Perimetro(Circunferencia circun){
        Double perimetro = 2*Math.PI* circun.getRadio();
        return perimetro;
    }
}

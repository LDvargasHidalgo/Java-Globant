package EjerciciosExtra.ejercicio2;

import java.util.Scanner;

public class Puntos {

    private int x1;
    private int y1;
    private int x2;
    private int y2;


    public Puntos() {
    }

    Scanner scan = new Scanner(System.in);

    public void crearPuntos() {
        System.out.println("PUNTO DE ORIGEN");
        System.out.println("Ingrese el punto X");
        x1 = scan.nextInt();
        System.out.println("Ingrese el punto Y");
        y1 = scan.nextInt();

        System.out.println("PUNTO DE ACTUAL");
        System.out.println("Ingrese el punto X");
        x2 = scan.nextInt();
        System.out.println("Ingrese el punto Y");
        y2 = scan.nextInt();
    }

    public void calcularDistancia(){
        double  distancia = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("La distancia entre los dos puntos es de:" + distancia);
    }
}
 //MATH
//1. sqrt = raiz cuadrada
//2.pow = alevado ala x potencia
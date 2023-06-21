/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio
 */
package exercises_java;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Exercise_5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String tipoSocio;
        double aporte;
        double valorPagar;

        System.out.println("Que tipo de socio eres A - B o C");
        tipoSocio = leer.nextLine();

        System.out.println("Cual fue el valor del servicio");
        aporte = leer.nextDouble();

        if (tipoSocio.equalsIgnoreCase("a") || tipoSocio.equalsIgnoreCase("b")
                          || tipoSocio.equalsIgnoreCase("c")) {

            if (tipoSocio.equalsIgnoreCase("a")) {
                valorPagar = aporte - (aporte * 0.50);
                System.out.println("Su valor a pagar es " + valorPagar);
            } else if (tipoSocio.equalsIgnoreCase("b")) {
                valorPagar = aporte - (aporte * 0.35);
                System.out.println("Su valor a pagar es " + valorPagar);
            } else if (tipoSocio.equalsIgnoreCase("c")) {
                valorPagar = aporte;
                System.out.println("Su valor a pagar es " + valorPagar);
            }
        } else {
            System.out.println("Tipo de socio equivocado vuelva a correr el programa");
        }
    }
}

package Date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ejercicio11_localDate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();

        LocalDate fechaIngresada = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();

        System.out.println("Fecha ingresada: " + fechaIngresada);
        System.out.println("Fecha actual: " + fechaActual);

        Period periodo = Period.between(fechaIngresada, fechaActual);
        int años = periodo.getYears();

        System.out.println("Diferencia de años: " + años);
    }
}

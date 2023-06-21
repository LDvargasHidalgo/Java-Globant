package Servicios;

import Entidades.Vendedor;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class VendedorServicio {
    Scanner scan = new Scanner(System.in);

    //Vamos a crear un metodo que retorne un onjeto de tipo vendedor
    public Vendedor altaVendedor() {
        //Instanciar un objeto de tipo vendedor
        Vendedor v1 = new Vendedor();
        //Llenar los atributos
        System.out.println("Ingrese el nombre del vendedor");
        v1.setNombre(scan.next());
        System.out.println("Ingrese el DNI del vendedor");
        v1.setDni(scan.nextInt());
        System.out.println("Ingrese el sueldo básico del vendedor");
        v1.setSueldoBasico(scan.nextDouble());
        System.out.println("Ingrese el día que comenzo a trabajar ");
        int dia = scan.nextInt();
        System.out.println("Ingrese el mes en que entro a trabajar");
        int mes = scan.nextInt();
        System.out.println("Ingrese el año en el que entro a trabajar ");
        int anio = scan.nextInt();
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        v1.setFechaInicio(fecha);
        return v1;
        //No seteamos ni sueldo mensual ni comisiones ya que para ello
        // vamos a preguntarle al ususario cual es la cantidad de ventas del vendedor
    }

    //Metodo para calcualar las comisiones por mes y el sueldo que se debe pagar
    public void SueldoMensual(Vendedor vendedor) {
        System.out.println("Cuales fueron las ventas totales del vendedor");
        Double ventas = scan.nextDouble();
        vendedor.setComisiones(ventas * 0.15);
        vendedor.setSueldoMensual(vendedor.getSueldoBasico() + vendedor.getComisiones());
        System.out.println("El sueldo mensual del vendedor" + vendedor.getNombre() +
                " es de $" + vendedor.getSueldoMensual());
    }

    //Metodo que calcula la antiguedad del vendedor para saber cuantos días de vacaciones le corresponde
    public void vacaciones(Vendedor vendedor) {
        //calcular la antiguedad del empleado
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(vendedor.getFechaInicio(), fechaActual);
        long aniosTranscurridos = periodo.get(ChronoUnit.YEARS);
        System.out.println("Este es el periodo transcurrido desde la fecha " +
                "de inicio hasta hoy " + aniosTranscurridos + " años");

        if (aniosTranscurridos < 5) {
            System.out.println("Le corresponden 14 días de vacaciones");
        } else if (aniosTranscurridos < 10) {
            System.out.println("Le corresponden 21 días de vacaciones");
        } else if (aniosTranscurridos < 20) {
            System.out.println("Le corresponden 28 dias de vacaciones");
        } else if (aniosTranscurridos > 20) {
            System.out.println("Le corresponden 35 días de vacaciones");
        } else {
            System.out.println("El empleado tiene vacaciones proporcionales");
        }
    }
}

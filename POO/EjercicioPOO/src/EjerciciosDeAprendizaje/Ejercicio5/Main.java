package EjerciciosDeAprendizaje.Ejercicio5;

import EjerciciosDeAprendizaje.Ejercicio5.Entidades.CuentaBancaria;
import EjerciciosDeAprendizaje.Ejercicio5.Servicios.ServicioCuentaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ServicioCuentaBancaria cuentaSer = new ServicioCuentaBancaria();
        CuentaBancaria cuentaBancaria = cuentaSer.CrearCuenta();
        int opcion;

        do {
            System.out.println("BIENVENIDO A SU BANCO AMIGO");
            System.out.println("Ingrese una opción");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Retiro extracción rapida");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Consultar datos");
            System.out.println("0. SALIR");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    cuentaSer.Consignar(cuentaBancaria);
                    break;
                case 2:
                    cuentaSer.Retirar(cuentaBancaria);
                    break;
                case 3:
                    cuentaSer.ExtraccionRapida(cuentaBancaria);
                    break;
                case 4:
                    cuentaSer.ConsultarSaldo(cuentaBancaria);
                    break;
                case 5:
                    cuentaSer.DatosCuenta(cuentaBancaria);
                    break;
                case 0:
                    System.out.println("Hasta pronto =)");
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (opcion != 0);
    }
}

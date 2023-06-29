package Ejercicio5.Servicios;

import Ejercicio5.Entidades.CuentaBancaria;

import java.util.Scanner;

public class ServicioCuentaBancaria {
    Scanner scan = new Scanner(System.in);

    //METODO PARA CREAR CUENTA BANCARIA
    public CuentaBancaria CrearCuenta() {
        CuentaBancaria c1 = new CuentaBancaria();
        System.out.println("Ingrese el número de cuenta");
        c1.setNumeroCuenta(scan.nextInt());

        System.out.println("Ingrese el DNI del cliente");
        c1.setDNI(scan.nextLong());

        System.out.println("Ingrese el saldo actual");
        c1.setSaldoActual(scan.nextInt());

        return c1;
    }

    //METODO PARA INGRESAR DINERO
    public void Consignar(CuentaBancaria c1) {
        int saldo = c1.getSaldoActual();
        System.out.println("Cuanto dinero desea consignar");
        int valor = scan.nextInt();
        c1.setSaldoActual(saldo + valor);
        System.out.println("Su nuevo saldo es: " + c1.getSaldoActual());
    }

    //METODO RETIRAR DINERO
    public void Retirar(CuentaBancaria c1) {
        int saldo = c1.getSaldoActual();
        System.out.println("Cuanto dinero desea retirar");
        int valor = scan.nextInt();
        c1.setSaldoActual(saldo - valor);

        if (valor > saldo) {
            c1.setSaldoActual(0);
            System.out.println("la cantidad de dinero es insuficiente para realizar tu retiro");
        } else {
            c1.setSaldoActual(saldo - valor);
        }

        System.out.println("Su nuevo saldo es: " + c1.getSaldoActual());
    }

    //METODO EXTRACCION RAPIDA
    public void ExtraccionRapida(CuentaBancaria c1) {
        int saldo = c1.getSaldoActual();
        double porcetanje = saldo * 0.20;
        System.out.println("El saldo maximo que puede retirar es de:" + porcetanje);

        System.out.println("Cuanto dinero desea retirar por extraccion rapida");
        int valor = scan.nextInt();

        if (valor > porcetanje) {
            System.out.println("Lo sentimos excede el valor de extraccion rapida");
        } else {
            saldo -= porcetanje;
            c1.setSaldoActual(saldo);
        }
    }

    //METODO CONSULTAR SALDO
    public void ConsultarSaldo(CuentaBancaria c1){
        System.out.println("Su saldo actual es: " + c1.getSaldoActual());
    }

    //CONSULTAR DATOS
    public void DatosCuenta(CuentaBancaria c1){
        System.out.println("Número de cuenta" + c1.getNumeroCuenta()+
        "\n DNI: "+ c1.getDNI() + "\n Saldo actual: " + c1.getSaldoActual());
    }
}

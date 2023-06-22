package Ejercicio3.Servicios;

import Ejercicio3.Entidades.Operacion;

import java.util.Scanner;

public class ServiceOperacion {
    Scanner scan = new Scanner(System.in);

    public Operacion CrearOperacion() {
        Operacion operacion = new Operacion();
        System.out.println("Ingrese el primer número");
        operacion.setNum1(scan.nextInt());
        System.out.println("Ingrese el segundo número");
        operacion.setNum2(scan.nextInt());
        return operacion;
    }

    //Metodo sumar
    public int suma(Operacion operacion) {
        int resultado;
        resultado = operacion.getNum1() + operacion.getNum2();
        return resultado;
    }

    //Metodo restar
    public int restar(Operacion operacion) {
        int resultado;
        resultado = operacion.getNum1() - operacion.getNum2();
        return resultado;
    }

    //Metodo multiplicar
    public int multiplicar(Operacion operacion) {
        int resultado;
        resultado = operacion.getNum1() * operacion.getNum2();
        return resultado;
    }

    //Metodo dividir
    public int dividir(Operacion operacion) {
        int resultado;
        if (operacion.getNum1() == 0 || operacion.getNum2() == 0) {
            resultado = 0;
            System.out.println("No podemos dividir por cero");
        } else {
            resultado = operacion.getNum1() / operacion.getNum2();
        }
        return resultado;
    }
}

package Ejercicio3;

import Ejercicio3.Entidades.Operacion;
import Ejercicio3.Servicios.ServiceOperacion;

public class Main {
    public static void main(String[] args) {
        int resultadoSuma, resultadoResta, resultadoMultiplicacion, resultadoDivision;

        ServiceOperacion sOperacion = new ServiceOperacion();
        Operacion op = sOperacion.CrearOperacion();
        resultadoSuma = sOperacion.suma(op);
        resultadoResta = sOperacion.restar(op);
        resultadoMultiplicacion = sOperacion.multiplicar(op);
        resultadoDivision = sOperacion.dividir(op);

        System.out.println(op.getNum1() +" + "+ op.getNum2()+" = "+ resultadoSuma);
        System.out.println(op.getNum1() +" - "+ op.getNum2()+" = "+ resultadoResta);
        System.out.println(op.getNum1() +" * "+ op.getNum2()+" = "+ resultadoMultiplicacion);
        System.out.println(op.getNum1() +" / "+ op.getNum2()+" = "+ resultadoDivision);

    }
}

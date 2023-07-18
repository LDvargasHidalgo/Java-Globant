package EjerciciosDeAprendizaje.Ejercicio9;

import EjerciciosDeAprendizaje.Ejercicio9.Entidades.Matematica;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Para utilizar el random primero debemos crear una instancia de la clase Random
        Random random = new Random();
        double numeroMayor;
        double potencia;

        Matematica mate1 = new Matematica();

        double num1 = random.nextDouble() * 99;// ajusto el numero al rango del 1-100
        mate1.setNum1(num1);
        double num2 = random.nextDouble() * 99;
        mate1.setNum2(num2);
        System.out.println("Número 1 = " + num1 + ", Número 2 = " + num2);

        //Llamando método para saber que número es mayor
        numeroMayor = devolverMayor(mate1);
        System.out.println("El número mayor es " + numeroMayor);

        //Llamando al método Potencia
        calcularPotencia(mate1);

        //Llamamos al metodo statico Raiz cuadrada
        calcularRaiz(mate1);


    }

    //Método para devolver número mayor
    public static double devolverMayor(Matematica matematica) {
        if (matematica.getNum1() > matematica.getNum2()) {
            return matematica.getNum1();
        } else {
            return matematica.getNum2();
        }
    }


    //Método para calcular la potencia del mayor número de la clase elevado al menor numero
    public static void calcularPotencia(Matematica matematica) {
        double resultado;
        int numero1 = (int) Math.round(matematica.getNum1());
        int numero2 = (int) Math.round(matematica.getNum2());
        if (numero1 > numero2) {
            resultado = Math.pow(numero1, numero2);
            System.out.println(numero1 + " elevado a " + numero2 + " = " + resultado);
        } else {
            resultado = Math.pow(numero2, numero1);
            System.out.println(numero2 + " elevado a " + numero1 + " = " + resultado);
        }
    }

    //Método Calcular raiz

    public static void calcularRaiz(Matematica matematica) {
        int numero1 = (int) Math.round(matematica.getNum1());
        int numero2 = (int) Math.round(matematica.getNum2());
        if (numero1<numero2){
            double raizCuadrada = Math.sqrt(numero1);
            System.out.println("La raiz cuadrada de " + numero1 + " = " + raizCuadrada);
        }else {
            double raizCuadrada = Math.sqrt(numero2);
            System.out.println("La raiz cuadrada de " + numero2 + " = " + raizCuadrada);
        }

    }
}

package EjerciciosDeAprendizaje.Ejercicio7.Servicios;

import EjerciciosDeAprendizaje.Ejercicio7.Entidades.Persona;

import java.util.Scanner;

public class ServicePerson {
    Scanner scan = new Scanner(System.in);


    //METODO CREAR PERSONA
    public Persona CrearPersona() {
        System.out.println("Ingrese su nombre");
        String nombre = scan.next();

        System.out.println("Ingrese su edad");
        int edad = scan.nextInt();
        String sexo;

        //Condicional para pedir y verificar el sexo de la persona sea correcto
        boolean sexoB = false;
        do {

            System.out.println("Ingrese su sexo");
            System.out.println("H = hombre");
            System.out.println("M = mujer");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("H")) {
                sexoB = true;
            } else {
                System.out.println("El dato ingresado no corresponde");
                sexoB = false;

            }
        } while (!sexoB);

        System.out.println("Escriba su peso en kg");
        double peso = scan.nextDouble();

        System.out.println("Escriba su altura en cm");
        int altura = scan.nextInt();

        Persona persona = new Persona(nombre, edad, peso, sexo, altura);
        return persona;
    }

    //METODO MOSTRAR PERSONA
    public void MostrarDatosPersona(Persona persona) {
        System.out.println("Nombre :" + persona.getNombre());
        System.out.println("Edad :" + persona.getEdad());
        System.out.println("Sexo :" + persona.getSexo());
        System.out.println("Peso :" + persona.getPeso());
        System.out.println("Altura :" + persona.getAltura());
    }

    //METODO CALCULAR IMC
    public int CalcularIMC(Persona persona) {
        double alturaMetros = (double) persona.getAltura() / 100;
        int resultIMC = 0;
        double IMC = persona.getPeso() / (alturaMetros * alturaMetros);

        System.out.println("Resultado IMC " + IMC + "AlturaMetros "+ alturaMetros + " peso " + persona.getPeso());
        if (IMC < 20) {
            System.out.println("Su peso esta por debajo del peso ideal ");
            resultIMC = -1;
        } else if (IMC >= 20 && IMC <= 25) {
            System.out.println("Usted está en su peso ideal");
            resultIMC = 0;
        } else if (IMC > 25) {
            System.out.println("Estas en sobrepeso");
            resultIMC = 1;
        }
        return resultIMC;
    }

    public boolean MayorEdad(Persona persona){
        boolean mayorEdad = false;
        if (persona.getEdad()<18){
            System.out.println("Eres menor de edad");
        }else {
            System.out.println("Ya puedes salir a bailar");
            mayorEdad = true;
        }
        return mayorEdad;
    }
}

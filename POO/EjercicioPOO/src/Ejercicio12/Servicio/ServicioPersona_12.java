package Ejercicio12.Servicio;

import Ejercicio12.Entidad.Persona;

import java.util.Date;
import java.util.Scanner;

public class ServicioPersona_12 {

    Scanner scan = new Scanner(System.in);


    //METODO PARA CREAR PERSONA
    public Persona crearPersona(){

        Persona persona = new Persona();

        System.out.println("Ingrese su nombre");
        persona.setNombre(scan.next());

        System.out.println("Ingrese su dia de nacimiento");
        int dia = scan.nextInt();

        System.out.println("Ingrese su mes de nacimiento");
        int mes = scan.nextInt();

        System.out.println("Ingrese su año de nacimiento");
        int anio = scan.nextInt();

        Date fechaDeNacimiento = new Date(anio+1900,mes+1,dia);
        persona.setFechaNacimiento(fechaDeNacimiento);

        return persona;
    }

    //METODOO PARA MOSTRAR PERSONA
     public void mostrarPersona (Persona persona){
         System.out.println("Nombre: "+ persona.getNombre());
         System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
     }
}

package EjerciciosDeAprendizaje.Ejercicio12.Servicio;

import EjerciciosDeAprendizaje.Ejercicio12.Entidad.Persona;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ServicioPersona_12 {

    Scanner scan = new Scanner(System.in);


    //METODO PARA CREAR PERSONA
    public Persona crearPersona() {

        Persona persona = new Persona();

        System.out.println("Ingrese su nombre");
        persona.setNombre(scan.next());

        System.out.println("Ingrese su dia de nacimiento");
        int dia = scan.nextInt();

        System.out.println("Ingrese su mes de nacimiento");
        int mes = scan.nextInt();

        System.out.println("Ingrese su año de nacimiento");
        int anio = scan.nextInt();

        Date fechaDeNacimiento1 = new Date(anio - 1900, mes - 1, dia);
        persona.setFechaNacimiento(fechaDeNacimiento1);

        return persona;
    }

    //METODOO PARA MOSTRAR PERSONA
    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        // Formatear fecha de nacimiento
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MMM/yyyy");
        String fechaNacimientoFormateada = formatoFecha.format(persona.getFechaNacimiento());
        System.out.println("Fecha de nacimiento: " + fechaNacimientoFormateada);
    }

    //MÉTODO PARA CALCULAR EDAD
    public int calcularEdad(Date fechaNacimiento) {
        Date fechaActual = new Date();
        int edad;
        edad = fechaActual.getYear()-fechaNacimiento.getYear();
        return edad;
    }
    //Método menor que (edad)
    public boolean menorQue(int edad, int edadUsuario){
        boolean menor = false;
        if (edad>edadUsuario){
           menor = true;
            System.out.println("El usuario es menor que la edad ingresada");
        }else {
            System.out.println("El usuario es mayor que la edad ingresada");
        }
        return menor;
    }
}

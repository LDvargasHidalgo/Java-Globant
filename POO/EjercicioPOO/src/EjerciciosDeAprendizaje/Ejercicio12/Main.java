package EjerciciosDeAprendizaje.Ejercicio12;


import EjerciciosDeAprendizaje.Ejercicio12.Entidad.Persona;
import EjerciciosDeAprendizaje.Ejercicio12.Servicio.ServicioPersona_12;

public class Main {
    public static void main(String[] args) {
        int edad;
        ServicioPersona_12 servicioPersona = new ServicioPersona_12();
        Persona persona1 = servicioPersona.crearPersona();

        servicioPersona.mostrarPersona(persona1);
        edad = servicioPersona.calcularEdad(persona1.getFechaNacimiento());
        System.out.println("Su edad es " + edad +" años");
        servicioPersona.menorQue(15,edad);

    }
}

package Ejercicio12;


import Ejercicio12.Entidad.Persona;
import Ejercicio12.Servicio.ServicioPersona_12;

public class Main {
    public static void main(String[] args) {
        ServicioPersona_12 servicioPersona = new ServicioPersona_12();
        Persona persona1 = servicioPersona.crearPersona();

        servicioPersona.mostrarPersona(persona1);

    }
}

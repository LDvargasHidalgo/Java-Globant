package ArrayList.DesafiosGrupales;

import ArrayList.DesafiosGrupales.entidades.Cliente;
import ArrayList.DesafiosGrupales.entidades.Rutina;
import ArrayList.DesafiosGrupales.servicios.ServicioCliente;
import ArrayList.DesafiosGrupales.servicios.ServicioRutina;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cliente> ALC = new ArrayList<>();
        ArrayList<Rutina> ALR = new ArrayList<>();
        ServicioRutina SR = new ServicioRutina();
        ServicioCliente SC = new ServicioCliente();

        // Crear Clientes
        Cliente c1 = new Cliente(1, 25, "Daniela", "Bajar de peso", 1.60, 70);
        Cliente c2 = new Cliente(02, 35, "Claudia", "Masa corporal", 1.80, 85);
        Cliente c3 = new Cliente(03, 65, "Eduar", "sacar Musculo", 1.90, 95);
        Cliente c4 = new Cliente(04, 20, "Daniel", "Masa corporal", 1.30, 50);

        //Crear Rutinas
        Rutina r1 = new Rutina(1, 90,"Alto",  "Rutina Intensa Total", "Trabaja todos los músculos.");
        Rutina r2 = new Rutina(2,45, "Medio",  "High Intensity", "Ejercicios Intensos pero cortos");
        Rutina r3 = new Rutina(3, 30, "Bajo", "Light Cardio", "Ejercicios de cardio ligeros");
        Rutina r4 = new Rutina(15,20,  "Media", "Moderna Abs", "Rutina corta de abdominales de intensidad media");
        Rutina r5 = new Rutina(99,60, "Pesadilla",  "La rutina del diablo", "90 Minutos de los ejercicios más duros. Solo para expertos.");

        //REGISTRAR CLIENTES EN LA LISTA
        SC.registrarCliente(c1, ALC);
        SC.registrarCliente(c2, ALC);
        SC.registrarCliente(c3, ALC);
        SC.registrarCliente(c4, ALC);

        //REGISTRAR RUTINAS EN LA LISTA
        SR.crearRutina(r1,ALR);
        SR.crearRutina(r2,ALR);
        SR.crearRutina(r3,ALR);
        SR.crearRutina(r4,ALR);
        SR.crearRutina(r5,ALR);

        //ACTUALIZAR DATOS DE UN CLIENTE
        SC.actualizarCliente(5, "Carlos", 45, 1.70, 75, "Ganar masa", ALC);

        //ELIMINAR CLIENTES
        SC.eliminarCliente(2,ALC);

        System.out.println("******************");
        System.out.println("LISTA DE CLIENTES");
        System.out.println("******************");
        SC.obtenerCliente(ALC);

        System.out.println("******************");
        System.out.println("LISTA DE RUTINAS");
        System.out.println("******************");
        SR.obtenerRutinas(ALR);
    }
}


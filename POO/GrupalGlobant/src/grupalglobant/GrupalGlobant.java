/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupalglobant;

import entidades.Cliente;
import entidades.Rutina;
import java.util.ArrayList;
import serv.ServicioCliente;
import serv.ServicioRutina;



/**
 *
 * @author "J"
 */
public class GrupalGlobant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      ArrayList<Cliente> ALC = new ArrayList();
      ArrayList<Rutina> ALR = new ArrayList();
      ServicioCliente SC = new ServicioCliente();
      ServicioRutina SR = new ServicioRutina();
      
      Cliente c1 = new Cliente(124, 27, 1.70, 90.1, "Gustavo", "Ser el mas sexy del mundo");
      Cliente c2 = new Cliente(89, 42, 1.50, 70.6, "Rodolfo", "Ser musculoso");
      Cliente c3 = new Cliente(999, 90, 2.10, 200, "El Eterno", "Vida Eterna");
      Cliente c4 = new Cliente(1782, 12, 1.40, 67, "Paco", "Filmar películas");
      Cliente c5 = new Cliente(5, 28, 1.76, 74.4, "Juliana", "Tonificar biceps");
      
      Rutina r1 = new Rutina(1, "Alto", 90, "Rutina Intensa Total", "Trabaja todos los músculos.");
      Rutina r2 = new Rutina(2, "Medio", 45, "High Intensity", "Ejercicios Intensos pero cortos");
      Rutina r3 = new Rutina(3, "Bajo", 30, "Light Cardio", "Ejercicios de cardio ligeros");
      Rutina r4 = new Rutina(15, "Media", 20, "Moderna Abs", "Rutina corta de abdominales de intensidad media");
      Rutina r5 = new Rutina(99, "Pesadilla", 60, "La rutina del diablo", "90 Minutos de los ejercicios más duros. Solo para expertos.");
      
      SC.registrarCliente(c1, ALC);
      SC.registrarCliente(c2, ALC);
      SC.registrarCliente(c3, ALC);
      SC.registrarCliente(c4, ALC);
      SC.registrarCliente(c5, ALC);
      
      SR.crearRutina(r1, ALR);
      SR.crearRutina(r2, ALR);
      SR.crearRutina(r3, ALR);
      SR.crearRutina(r4, ALR);
      SR.crearRutina(r5, ALR);
      
      SC.obtenerClientes(ALC);
      SR.obtenerRutinas(ALR);
      
      SC.actualizarCliente(999, "El viejo", 99, 2.05, 150, "No morirse", ALC);
      SC.obtenerClientes(ALC);
      
      SR.actualizarRutina(15, "Moderna Piernas", 45, "Baja", "Un trabajo ligero en las piernas", ALR);
      SR.obtenerRutinas(ALR);
      
      SC.eliminarCliente(89, ALC);
      SC.obtenerClientes(ALC);
      
      SR.eliminarRutina(2, ALR);
      SR.obtenerRutinas(ALR);
      
      SR.eliminarRutina(15000, ALR);
      
    }
    
}

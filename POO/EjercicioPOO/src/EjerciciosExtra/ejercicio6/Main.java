package EjerciciosExtra.ejercicio6;

import EjerciciosExtra.ejercicio6.Entidades.JuegoAhorcado;
import EjerciciosExtra.ejercicio6.Servicios.ServicioJuegoAhorcado;

public class Main {
    public static void main(String[] args) {
        ServicioJuegoAhorcado servicioJuegoAhorcado = new ServicioJuegoAhorcado();
        JuegoAhorcado juegoAhorcado = servicioJuegoAhorcado.crearJuego();
        servicioJuegoAhorcado.buscarLetra(juegoAhorcado);
    }
}

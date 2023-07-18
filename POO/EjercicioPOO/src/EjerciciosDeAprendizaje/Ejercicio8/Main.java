package EjerciciosDeAprendizaje.Ejercicio8;

import EjerciciosDeAprendizaje.Ejercicio8.Entidades.Cadena;
import EjerciciosDeAprendizaje.Ejercicio8.Servicios.CadenaService;

public class Main {
    public static void main(String[] args) {

        CadenaService cadenaService = new CadenaService();
        Cadena cadena = cadenaService.CrearCadena();
        cadenaService.CantidadVocales(cadena);
        cadenaService.FraseInversa(cadena);
        cadenaService.VecesRepetido(cadena);
        cadenaService.CompararLongitud(cadena);
        cadenaService.UnirFrases(cadena);
        cadenaService.RemplazarLetra(cadena);
        cadenaService.ContieneLetra(cadena);

    }
}

package EjerciciosExtra.ejercicio4;

public class Main {
    public static void main(String[] args) {
        ServicioNIF servicioNIF = new ServicioNIF();
        NIF nif = servicioNIF.crearNif();
        servicioNIF.mostrar(nif);

    }
}

//pruebas 12345678  = 14
// 56895423 = 1
//https://www.mathway.com/es/Algebra

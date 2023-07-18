package EjerciciosExtra.ejercicio6.Servicios;

import EjerciciosExtra.ejercicio6.Entidades.JuegoAhorcado;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioJuegoAhorcado {
    Scanner scan = new Scanner(System.in);

    //CREAR JUEGO
    public JuegoAhorcado crearJuego() {
        JuegoAhorcado juegoAhorcado = new JuegoAhorcado();
        System.out.println("Ingrese la palabra");
        String palabra = scan.nextLine();
        int cantidadLetras = palabra.length();
        char letras[] = new char[cantidadLetras];
        letras = palabra.toCharArray();
        juegoAhorcado.setPalabra(letras);

        System.out.println("Ingrese la cantidad de jugadas maximas");
        juegoAhorcado.setJugadasMaximas(scan.nextInt());

        juegoAhorcado.setLetrasEncontradas(0);
        return juegoAhorcado;
    }


    //lONGITUD DE LA PALABRA
    public void longitudPalabra(JuegoAhorcado juegoAhorcado) {
        int longitud;
        longitud = juegoAhorcado.getPalabra().length;
        System.out.println("La longitud de la palabra es de: " + longitud + " letras");
    }

    //METODO BUSCAR
    public boolean buscarLetra(JuegoAhorcado juegoAhorcado) {

        char letra = ' ';
        int vecesEncontrada = 0;
        int letrasEncontradas = 0;
        int oportunidades = juegoAhorcado.getJugadasMaximas();
        char[] letras = juegoAhorcado.getPalabra();
        int longitud = letras.length;
        boolean encontrado = false ;

        while (!(oportunidades ==0)|| letrasEncontradas == longitud){
            System.out.println("Ingrese una letra");
            letra = scan.next().charAt(0);
            encontrado = false;
            for (char letraV : letras) {
                vecesEncontrada = 0;
                if (letraV == letra) {
                    encontrado = true;
                    vecesEncontrada++;
                    letrasEncontradas++;
                    System.out.println("la letra si se encuentra " + vecesEncontrada + " veces");
                    break;
                }
            }
            if (!(encontrado)) {
                oportunidades--;
                System.out.println("la letra no se encuentra");
            }

            System.out.println("Te quedan " + oportunidades + " oportunidades");
        }

        return encontrado;
    }
}

// letras = palabra.toCharArray(); "del string palabra asigna cada una de las letras
// un un indice del vector"
package Ejercicio11_claseDate;

import java.util.Date;
import java.util.Scanner;

public class Main_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dia, mes, anio, aniosTranscurridos;
        Date fechaActual = new Date();

        System.out.println("Ingresa un día");
        dia = scan.nextInt();
        System.out.println("Ingresa un mes");
        mes = scan.nextInt();
        System.out.println("Ingresa un año");
        anio = scan.nextInt();

        int anioActual = fechaActual.getYear()+1900;
        int mesActual = fechaActual.getMonth()+1;
        int diaActual = fechaActual.getDate();

        aniosTranscurridos = anioActual- anio;

        if (mesActual<mes){
            aniosTranscurridos--;
        } else if (mesActual<=mes && diaActual<dia) {
            aniosTranscurridos--;
        }

        System.out.println("Han transcurrido  "+aniosTranscurridos + " años");
    }

}

package EjerciciosExtra.ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] mesesAño = new String[12];
        String mesSecreto;
        String mesSecretoUsuario;
        Meses meses = new Meses();
        mesesAño =  meses.llenarMeses();
        mesSecreto = mesesAño[5];

        System.out.println("Intenta adivinar el mes secreto");
        mesSecretoUsuario = scan.next();
        mesSecretoUsuario = mesSecretoUsuario.toLowerCase();
        while (!(mesSecreto.equals(mesSecretoUsuario))){
            System.out.println("Lo siento no adivinaste intenta nuevamente: ");
            mesSecretoUsuario = scan.next();
            mesSecretoUsuario = mesSecretoUsuario.toLowerCase();
        }
        System.out.println("===FELICITACIONES === el mes secreto es " + mesSecreto);
    }
}

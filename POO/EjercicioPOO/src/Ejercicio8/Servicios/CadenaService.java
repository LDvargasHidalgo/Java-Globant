package Ejercicio8.Servicios;

import Ejercicio8.Entidades.Cadena;

import java.util.Scanner;

public class CadenaService {
    Scanner scan = new Scanner(System.in);

    //Método crear cadena
    public Cadena CrearCadena() {
        Cadena cadena = new Cadena();
        System.out.println("Ingrese una frase");
        cadena.setFrase(scan.nextLine());
        cadena.setLongitud(cadena.getFrase().length());
        return cadena;
    }

    //MÉTODO MOSTRAR VOCALES
    public void CantidadVocales(Cadena cadena) {
        int countVocales = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            char letra = cadena.getFrase().charAt(i);
            letra = Character.toLowerCase(letra);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                countVocales++;
            }
        }
        System.out.println("La frase " + cadena.getFrase() + " tiene " + countVocales + " vocales");
    }

    //METODO INVERTIR FRASE


    public void FraseInversa(Cadena cadena) {
        StringBuilder fraseInversal = new StringBuilder();
        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {
            fraseInversal.append(cadena.getFrase().charAt(i));
        }
        String fraseInversaF = fraseInversal.toString();
        System.out.println("La frase inversa es: " + fraseInversaF);
    }

    //MÉTODO VECES REPETIDO
    public void VecesRepetido(Cadena cadena) {
        int countLetraRepetida = 0;
        System.out.println("Ingresa la letra que desea saber cuantas veces esta repetida");
        char letraRepetida = scan.next().charAt(0);
        int countVocales = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            char letra = cadena.getFrase().charAt(i);
            letra = Character.toLowerCase(letra);
            if (letra == letraRepetida) {
                countLetraRepetida++;
            }
        }
        System.out.println("letra " + letraRepetida + " se repite  " + countLetraRepetida + " veces en" +
                " la palabra " + cadena.getFrase());
    }

    // COMPARAR LONGITUD
    public void CompararLongitud(Cadena cadena) {
        System.out.println("Ingrese una nueva frase a comparar ");
        scan.nextLine();
        String newFrase = scan.nextLine();
        int cantidadLetrasNewFrase = newFrase.length();
        System.out.println("Esta es la nueva frase "+newFrase);

        if (cadena.getLongitud() == newFrase.length()) {
            System.out.println("La longitud de las dos frases es de " + newFrase.length() + " letras ");
        } else {
            System.out.println("La longitud de la frase " + cadena.getFrase() + " es de " + cadena.getLongitud()
                    + " letras y la longitud de la nueva frase  " + newFrase + " es de: " + cantidadLetrasNewFrase + " letras");
        }
    }

    //MÉTODO PARA UNIR DOS FRASES
    public void UnirFrases(Cadena cadena){
        System.out.println("Ingrese una nueva frase para unirlas ");
        String newFrase = scan.nextLine();
        String mergeFrases = cadena.getFrase().concat(newFrase);
        System.out.println("La union de las dos frases es: "+ mergeFrases);
    }


    //MÉTODO REMPLAZAR
    public void RemplazarLetra(Cadena cadena){
        System.out.println("Escribe la letra por la cual desea remplazar la vocal 'a' en la frase ");
        String letra = scan.next();
        String palabraReplace = cadena.getFrase().replace("a", letra);
        System.out.println("Palabra remplazando la letra 'a' por la letra '"+ letra +"': "+ palabraReplace);
    }

    //MÉTODO CONTIENE
    public boolean ContieneLetra(Cadena cadena){
        System.out.println("Escriba la letra que desea saber si esta contenida en nuestra frase");
        String letraC = scan.next();
        boolean contieneLetra = cadena.getFrase().contains(letraC);
        if (contieneLetra){
            System.out.println("La letra "+ letraC + "si está en nuestra frase " + cadena.getFrase());
        }else {
            System.out.println("lo sentimos la letra '"+ letraC + "' No está en nuestra frase "+ cadena.getFrase());
        }
        return contieneLetra;
    }




}

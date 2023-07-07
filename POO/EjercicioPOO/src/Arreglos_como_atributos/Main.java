package Arreglos_como_atributos;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Competidores competidores = new Competidores(10);
        String[] nombresCompetidores = new String[10];
        nombresCompetidores[0]="Juan";
        nombresCompetidores[1]="Camilo";
        nombresCompetidores[2]="Andres";
        nombresCompetidores[3]="Daniel";
        nombresCompetidores[4]="Santiago";
        nombresCompetidores[5]="Wilson";
        nombresCompetidores[6]="Carlos";
        nombresCompetidores[7]="Rafa";
        nombresCompetidores[8]="Gabriel";
        nombresCompetidores[9]="Eduardo";
        Random random = new Random();
        int numeroAzar;
        for (int i = 0; i< 10;i++){
            numeroAzar = random.nextInt(1000-1+1)+1;
            competidores.agregar(nombresCompetidores[i],numeroAzar);
        }
        competidores.imprimeCompetidores();
        competidores.imprimeGanador();
        competidores.imprimirMejoresCompetidores();

    }
}


//Los organizadores de una maraton necesitan llevar un registro de los
// competidores y sus tiempos. para esto le solicita a usted que realice un
//programa en java que les permita resolver sus requerimientos de informacion
//para hacer este programa debe crear una clase main y una clase competidores
//los atributos de la clase competidores son, String nombre evento, String[] competidores
//con n casillas (el usuario indicara cuantos competidores se registraran), int[]tiempos , lagor del vector n
//(la misma extencion que competidores) finalmente los atributos largo y posicion que serviran
//para dimensionar el arreglo  y llevar el control de cuantas casillas se han llenado
//respectivamente

/*
* Competidores(Atributos)
* nombreEvento: String
* competidores: String[n]
* tiempos: int[n]
* largo: int
* posicion: int
*
* Competidores(metodos)
* constructor(largo)
* competidores(int largo, int posicion)
* accesadores y mutadores
* agregar(String competidor, int tiempo)
* imprimeCompetidores()
* posicionMenos():int
* imprimeGanador()
* promedio(): int
* imprimeMejoresCompetidores()
* */
//==MAIN===///
/*En la clase main cree un objeto competidores y llenelo con datos de
* 10 competidores, para llenar los datos cree un arreglo con 10 nombres
* y luego haga un ciclo en el que se vayan leyendo y agregando al objeto
* al mismo tiempo que se ingresan los tiempos
* Genere los tiempos al azar con el metodo random, el tiempo se registra
* en segundos en un rango entre 1-1000*/

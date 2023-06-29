package Ejercicio7;

import Ejercicio7.Entidades.Persona;
import Ejercicio7.Servicios.ServicePerson;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int IMC;
        int contSobrepeso = 0;
        int contPesoIdeal = 0;
        int contBajoPeso = 0;

        boolean mayorEdad ;
        int countMayorEdad = 0;
        int countMenorEdad = 0;


        //Crear una lista de personas
        List<Persona> listaPersona = new ArrayList<>();

        //Instanciar la clase servicioPersona
        ServicePerson servicePerson = new ServicePerson();

        //Crear las personas y agregarlas a la lista
        listaPersona.add(servicePerson.CrearPersona());
        listaPersona.add(servicePerson.CrearPersona());
        listaPersona.add(servicePerson.CrearPersona());
        listaPersona.add(servicePerson.CrearPersona());


        //CICLO FOR EACH PARA RECORRER LA LISTA Y LLAMAR LOS METODOS
        for (Persona persona : listaPersona) {
           mayorEdad =  servicePerson.MayorEdad(persona);
            IMC = servicePerson.CalcularIMC(persona);
            servicePerson.MostrarDatosPersona(persona);

            //Condicional que nos dira cuantas personas estan en cada una de las categorias del peso
            if (IMC == (-1)) {
                contBajoPeso++;
            } else if (IMC == (0)) {
                contPesoIdeal++;
            } else if (IMC == (1)) {
                contSobrepeso++;
            } else {
                System.out.println("Tenemos un grave error");
            }

            //Codicional que nos dara el resultado de cuantas personas mayores de edad hay
            if (mayorEdad) {
                countMayorEdad++;
            } else {
                countMenorEdad++;
            }
        }

        double personasEnLista = listaPersona.size();
        System.out.println(countMayorEdad);
        double porcentajeMayorEdad =countMayorEdad*100 /personasEnLista ;
        double porcentajeMenorEdad = countMenorEdad*100 /personasEnLista;

        System.out.println(porcentajeMayorEdad + "% son mayores de edad");
        System.out.println(porcentajeMenorEdad + "% son menores de edad");

        double porcentajeBajoPeso = contBajoPeso*100/personasEnLista;
        double porcentajePesoIdeal = contPesoIdeal*100/personasEnLista;
        double porcentajeSobrePeso = contSobrepeso*100/personasEnLista;
        System.out.println(porcentajeBajoPeso + "% estan en bajo peso");
        System.out.println(porcentajePesoIdeal + "% están en el peso ideal");
        System.out.println(porcentajeSobrePeso + "% deben ponerse a dieta");

    }
}

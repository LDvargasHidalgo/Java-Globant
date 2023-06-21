package Servicios;

import Entidades.Vehiculo;

import java.util.Scanner;

public class ServiceVehiculo {
    Scanner scan = new Scanner(System.in);

    //METODO PARA CREAR UN VEHICULO PASANDO LOS DATOS POR CONSOLA
    public Vehiculo CrearVehiculo() {
        //Creamos un objeto tipo vehiculo
        Vehiculo v1 = new Vehiculo();
        System.out.println("Ingrese la marca del vehìculo");
        v1.setMarca(scan.next());
        System.out.println("Ingrese modelo del vehículo");
        v1.setModelo(scan.nextInt());
        System.out.println("Ingrese el año del vehículo");
        v1.setAño(scan.nextInt());
        boolean tipo = false;

        //Ciclo que se repita mientras el tipo de vehiculo no corresponda
        do {
            System.out.println("Ingrese el tipo de vehiculo automovil, bicicleta o motocicleta");
            String tipoS = scan.next();
            if (tipoS.equalsIgnoreCase("automovil") || tipoS.equalsIgnoreCase("bicicleta")
                    || tipoS.equalsIgnoreCase("motocicleta")) {
                tipo = true;
                v1.setTipo(tipoS);
            } else {
                System.out.println("Ese tipo de vehiculo no se encuentra en nuestra base de datos");
            }
        } while (!tipo);
        return v1;
    }

    public void Frenar(int segundos, Vehiculo v1) {
        int distancia = 0;
        if (v1.getTipo().equalsIgnoreCase("automovil")) {
            distancia = segundos * 3 + 2;
        } else if (v1.getTipo().equalsIgnoreCase("motocicleta")) {
            distancia = segundos * 2 + 2;
        } else if (v1.getTipo().equalsIgnoreCase("bicicleta")) {
            distancia = segundos * 2;
        }
        System.out.println("La distancia recorrida por el " + v1.getTipo() + " "
                + v1.getMarca() + " en "+ segundos+ " segundos "+ " fue de: " + distancia + "metros");
    }
}

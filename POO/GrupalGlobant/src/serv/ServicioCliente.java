/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serv;

import entidades.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author "J"
 */
public class ServicioCliente {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void registrarCliente(Cliente cl, ArrayList<Cliente> ALC) {

        ALC.add(cl);

    }

    public void obtenerClientes(ArrayList<Cliente> ALC) {

        for (int i = 0; i < ALC.size(); i++) {

            System.out.println(ALC.get(i).getNombreCliente());
            System.out.println(ALC.get(i).getEdad());
            System.out.println(ALC.get(i).getAltura());
            System.out.println(ALC.get(i).getPeso());
            System.out.println(ALC.get(i).getIdCliente());
            System.out.println(ALC.get(i).getObjetivo());

        }

    }

    public void actualizarCliente(int id, String nombre,
            int edad, double altura, double peso,
            String objetivo, ArrayList<Cliente> ALC) {

        boolean encontrado = false;
        for (int i = 0; i < ALC.size(); i++) {

            if (ALC.get(i).getIdCliente() == id) {
                encontrado = true;

                ALC.get(i).setNombreCliente(nombre);
                ALC.get(i).setEdad(edad);
                ALC.get(i).setAltura(altura);
                ALC.get(i).setPeso(peso);
                ALC.get(i).setObjetivo(objetivo);

            }

        }
        if (encontrado) {
            System.out.println("Se ha modificado con éxito");
        } else {
            System.out.println("No se ha encontrado un cliente con ese ID");
        }

    }

    public void eliminarCliente(int id, ArrayList<Cliente> ALC) {

        boolean encontrado = false;
        for (int i = 0; i < ALC.size(); i++) {

            if (ALC.get(i).getIdCliente() == id) {

                encontrado = true;
                ALC.remove(i);

            }

        }

        if (encontrado) {

            System.out.println("Se ha eliminado con éxito");

        } else {
            System.out.println("No se ha encontrado ese ID");
        }

    }

}

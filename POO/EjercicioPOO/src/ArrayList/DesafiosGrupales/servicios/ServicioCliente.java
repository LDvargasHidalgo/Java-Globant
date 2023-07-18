package ArrayList.DesafiosGrupales.servicios;

import ArrayList.DesafiosGrupales.entidades.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioCliente {

    Scanner input = new Scanner(System.in).useDelimiter("\n");


    public void registrarCliente(Cliente cliente, ArrayList<Cliente> ALC) {
        ALC.add(cliente);
    }

    //devuelve una lista con todos los clientes
    public void obtenerCliente(ArrayList<Cliente> ALC) {
        System.out.println("LISTA DE CLIENTES");

        for (Cliente cliente : ALC) {
            System.out.println("ID: " + cliente.getIdCliente());
            System.out.println("Nombre: " + cliente.getNombreCliente());
            System.out.println("Edad: " + cliente.getEdad());
            System.out.println("Peso: " + cliente.getPeso());
            System.out.println("Altura: " + cliente.getAltura());
            System.out.println("Objetivo: " + cliente.getObjetivo());
            System.out.println("");
        }
    }

    //ACTUALIZAR CLIENTE
    public void actualizarCliente(int IdCliente, String nombre, int edad, double altura,
                                  double peso, String objetivo, ArrayList<Cliente> ALC) {

        boolean encontrado = false;

        for (int i = 0; i < ALC.size(); i++) {
            if (ALC.get(i).getIdCliente() == IdCliente) {
                ALC.get(i).setEdad(edad);
                ALC.get(i).setNombreCliente(nombre);
                ALC.get(i).setAltura(altura);
                ALC.get(i).setObjetivo(objetivo);
                ALC.get(i).setPeso(peso);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No tenemos un cliente con el ID " + IdCliente);
        }else {
            System.out.println("Cliente actualizado con exito");
        }
    }

    //ELEMINAR CLIENTE
    public void eliminarCliente(int IdCliente, ArrayList<Cliente> ALC) {
        boolean encontrado = false;
        for (int i = 0; i < ALC.size(); i++) {
            if (ALC.get(i).getIdCliente() == IdCliente) {
                ALC.remove(i);
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("No se ha encontrado ningun cliente con ID "+ IdCliente);
        }else{
            System.out.println("Se ha eliminado con exito el cliente con ID "+ IdCliente);
        }
    }
}




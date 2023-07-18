/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serv;

import entidades.Rutina;
import java.util.ArrayList;

/**
 *
 * @author "J"
 */
public class ServicioRutina {

    public void crearRutina(Rutina r, ArrayList<Rutina> ALR) {

        ALR.add(r);

    }

    public void obtenerRutinas(ArrayList<Rutina> ALR) {

        for (int i = 0; i < ALR.size(); i++) {

            System.out.println(ALR.get(i).getNombreRut());
            System.out.println(ALR.get(i).getDuracionRut());
            System.out.println(ALR.get(i).getDescripcion());
            System.out.println(ALR.get(i).getIdRut());
            System.out.println(ALR.get(i).getNivelDificultad());

        }

    }

    public void actualizarRutina(int id, String nombre, int duracion,
            String dificultad, String descripcion,
            ArrayList<Rutina> ALR) {
        boolean encontrado = false;

        for (int i = 0; i < ALR.size(); i++) {

            if (ALR.get(i).getIdRut() == id) {

                encontrado = true;

                ALR.get(i).setDescripcion(descripcion);
                ALR.get(i).setDuracionRut(duracion);
                ALR.get(i).setNivelDificultad(dificultad);
                ALR.get(i).setNombreRut(nombre);

            }

        }

        if (encontrado) {
            System.out.println("Se ha actualizado con éxito");
        } else {
            System.out.println("No se ha encontrado ese id");
        }

    }

    public void eliminarRutina(int id, ArrayList<Rutina> ALR) {
        boolean encontrado = false;
        for (int i = 0; i < ALR.size(); i++) {

            if (ALR.get(i).getIdRut() == id) {

                ALR.remove(i);
                encontrado = true;

            }

        }
        if (encontrado) {

            System.out.println("Se ha eliminado con éxito");

        } else {
            System.out.println("No se ha encontrado ese id");
        }
    }

}

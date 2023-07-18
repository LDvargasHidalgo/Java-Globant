package ArrayList.DesafiosGrupales.servicios;

import ArrayList.DesafiosGrupales.entidades.Rutina;

import java.security.PublicKey;
import java.util.ArrayList;

public class ServicioRutina {

    public void crearRutina(Rutina rutina, ArrayList<Rutina> ALR){
        ALR.add(rutina);
    }

    //OBTENER RUTINAS
    public void obtenerRutinas(ArrayList<Rutina>ALR){

        for (Rutina rutina:ALR) {
            System.out.println("ID rutina: "+rutina.getIdRut());
            System.out.println("Nombre rutina: "+rutina.getNombreRut());
            System.out.println("Descripción: "+rutina.getDescripcion());
            System.out.println("Duración: "+rutina.getDuracionRut());
            System.out.println("Nivel Dificultad: "+ rutina.getNivelDificultad());
            System.out.println("");
        }
    }

    //ACTUALIZAR RUTINA
    public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad,
                                 String descripcion, ArrayList<Rutina>ALR){
        boolean encontrado = false;
        for (int i = 0; i<ALR.size();i++){
            if (ALR.get(i).getIdRut() == id){
                ALR.get(i).setNombreRut(nombre);
                ALR.get(i).setDescripcion(descripcion);
                ALR.get(i).setDuracionRut(duracion);
                ALR.get(i).setNivelDificultad(nivelDificultad);
                encontrado = true;
            }
        }
        if (encontrado){
            System.out.println("Rutina actualizada con exito");
        }else {
            System.out.println("Lo sentimos no encontramos la rutina con ID"+ id);
        }
    }

    //ELIMINAR RUTINA
    public void eliminarRutina(int id, ArrayList<Rutina>ALR){

        boolean encontrado = false;
       for (int i = 0; i<ALR.size();i++){
           if (ALR.get(i).getIdRut() ==id){
               ALR.remove(i);
               encontrado = true;
           }
       }
       if (encontrado){
           System.out.println("La rutina con ID "+id+" ha sido eliminada con exito");
       }else {
           System.out.println("La rutina con ID "+id+" no se encuentra en nuesta BD");
       }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author "J"
 */
public class Rutina {
    
    private int idRut;
    private int duracionRut;
    private String nombreRut, nivelDificultad, descripcion;

    public Rutina() {
    }

    public Rutina(int idRut, String nivelDificultad, int duracionRut, String nombreRut, String descripcion) {
        this.idRut = idRut;
        this.nivelDificultad = nivelDificultad;
        this.duracionRut = duracionRut;
        this.nombreRut = nombreRut;
        this.descripcion = descripcion;
    }

    public int getIdRut() {
        return idRut;
    }

    public void setIdRut(int idRut) {
        this.idRut = idRut;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public int getDuracionRut() {
        return duracionRut;
    }

    public void setDuracionRut(int duracionRut) {
        this.duracionRut = duracionRut;
    }

    public String getNombreRut() {
        return nombreRut;
    }

    public void setNombreRut(String nombreRut) {
        this.nombreRut = nombreRut;
    }

    public void setDescripcion(String descripcion) {
        
        this.descripcion = descripcion;
        
    }
    
    public String getDescripcion() {
        
        return descripcion;
        
    }
    
    @Override
    public String toString() {
        return "Rutina{" + "idRut=" + idRut + ", nivelDificultad=" + nivelDificultad + ", duracionRut=" + duracionRut + ", nombreRut=" + nombreRut + '}';
    }
    
    
    
    
}

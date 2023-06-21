package Entidades;

import java.time.LocalDate;


public class Vendedor {

    private String nombre;
    private Integer dni;
    private Double sueldoBasico;
    private Double comisiones;
    private Double sueldoMensual;
    private LocalDate fechaInicio;

    //Constructor por defecto

    public Vendedor() {
    }

    //Constructor por parametros
    public Vendedor(String nombre, Integer dni, Double sueldoBasico, Double comisiones, Double sueldoMensual, LocalDate fechaInicio) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBasico = sueldoBasico;
        this.comisiones = comisiones;
        this.sueldoMensual = sueldoMensual;
        this.fechaInicio = fechaInicio;
    }

    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(Double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public Double getComisiones() {
        return comisiones;
    }

    public void setComisiones(Double comisiones) {
        this.comisiones = comisiones;
    }

    public Double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(Double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Vendedor{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", sueldoBasico=" + sueldoBasico +
                ", comisiones=" + comisiones +
                ", sueldoMensual=" + sueldoMensual +
                ", fechaInicio=" + fechaInicio +
                '}';
    }
}

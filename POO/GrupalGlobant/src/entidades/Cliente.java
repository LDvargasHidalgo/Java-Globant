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
public class Cliente {
    
    private int idCliente, edad;
    private double altura, peso;
    private String nombreCliente, objetivo;

    public Cliente() {
    }

    public Cliente(int idCliente, int edad, double altura, double peso, String nombreCliente, String objetivo) {
        this.idCliente = idCliente;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.nombreCliente = nombreCliente;
        this.objetivo = objetivo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", nombreCliente=" + nombreCliente + ", objetivo=" + objetivo + '}';
    }
    
    
    
    
}

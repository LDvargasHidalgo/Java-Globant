package Entidades;

public class Vehiculo {
    private String marca;
    private int modelo;
    private int  año;
    private String tipo;

    //Constructor vacio
    public Vehiculo() {
    }

    //Constructor por parametros
    public Vehiculo(String marca, int modelo, int año, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
    }

    //getter and setter

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", año=" + año +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

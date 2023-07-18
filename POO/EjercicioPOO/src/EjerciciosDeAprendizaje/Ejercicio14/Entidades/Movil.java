package EjerciciosDeAprendizaje.Ejercicio14.Entidades;

import java.util.Arrays;

public class Movil {

    private String marca;
    private int precio;
    private int modelo;
    private int memoriaRam;
    private int almacenamiento;
    private char codigo[];

    public Movil() {
    }

    public Movil(String marca, int precio, int modelo, int memoriaRam, int almacenamiento, char[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public char[] getCodigo() {
        return codigo;
    }

    public void setCodigo(char[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "CARACTERISTICAS DEL MOVIL" +
                "\n marca='" + marca + '\'' +
                "\n precio=" + precio +
                "\n modelo=" + modelo +
                "\n memoriaRam=" + memoriaRam + "gb"+
                "\n almacenamiento=" + almacenamiento +"gb"+
                "\n codigo=" + Arrays.toString(codigo)
                ;
    }
}

package EjerciciosDeAprendizaje.Ejercicio6.Entidades;

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    //Constructor predeterminado
    public Cafetera() {
    }

    //Constructor con parametros
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    //Metodos Getter y setter

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}

package Entidades;

public class Figura {
    private String nombre;
    private Double area;
    private Double perimetro;

    public Figura() {
    }

    public Figura(Double area) {
        this.area = area;
    }

    public Figura(Double perimetro, String nombre) {
        this.perimetro = perimetro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "nombre='" + nombre + '\'' +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }
}

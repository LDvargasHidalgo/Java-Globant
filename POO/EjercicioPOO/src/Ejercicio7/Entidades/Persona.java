package Ejercicio7.Entidades;

public class Persona {
    private String nombre;
    private int edad;
    private double peso;
    private String sexo;
    private int altura;


    //constructor por defecto
    public Persona() {
    }

    //Constructor con todos los parametros
    public Persona(String nombre, int edad, double peso, String sexo, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
        this.altura = altura;
    }

    //Getter & setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", sexo='" + sexo + '\'' +
                ", altura=" + altura +
                '}';
    }
}

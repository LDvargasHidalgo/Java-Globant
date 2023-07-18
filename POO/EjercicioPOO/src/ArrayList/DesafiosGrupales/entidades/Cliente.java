package ArrayList.DesafiosGrupales.entidades;

public class Cliente {

   private int idCliente, edad;
   private String nombreCliente, objetivo;
   private double altura, peso;

    public Cliente() {
    }

    public Cliente(int idCliente, int edad, String nombreCliente, String objetivo, double altura, double peso) {
        this.idCliente = idCliente;
        this.edad = edad;
        this.nombreCliente = nombreCliente;
        this.objetivo = objetivo;
        this.altura = altura;
        this.peso = peso;
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
}

package ArrayList.DesafiosGrupales.entidades;

public class Rutina {

    private int idRut;
    private int duracionRut;
    private String nombreRut, nivelDificultad, descripcion;

    public Rutina() {
    }

    public Rutina(int idRut, int duracionRut, String nombreRut, String nivelDificultad, String descripcion) {
        this.idRut = idRut;
        this.duracionRut = duracionRut;
        this.nombreRut = nombreRut;
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
    }

    public int getIdRut() {
        return idRut;
    }

    public void setIdRut(int idRut) {
        this.idRut = idRut;
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

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

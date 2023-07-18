package EjerciciosDeAprendizaje.Ejercicio13.Entidad;

import java.util.Arrays;

public class Curso {
    private String nombreCurso;
    private int cantHorasXDia;
    private int cantDiasXSemana;
    private String turno;
    private int precioXHora;
    private String[] alumnos;

    //Constructor vacio

    public Curso() {
    }

    public Curso(String nombreCurso, int cantHorasXDia, int cantDiasXSemana, String turno, int precioXHora) {
        this.nombreCurso = nombreCurso;
        this.cantHorasXDia = cantHorasXDia;
        this.cantDiasXSemana = cantDiasXSemana;
        if (turno.equals("mañana") || turno.equals("tarde")) {
            this.turno = turno;
        }
        this.precioXHora = precioXHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantHorasXDia() {
        return cantHorasXDia;
    }

    public void setCantHorasXDia(int cantHorasXDia) {
        this.cantHorasXDia = cantHorasXDia;
    }

    public int getCantDiasXSemana() {
        return cantDiasXSemana;
    }

    public void setCantDiasXSemana(int cantDiasXSemana) {
        this.cantDiasXSemana = cantDiasXSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioXHora() {
        return precioXHora;
    }

    public void setPrecioXHora(int precioXHora) {
        this.precioXHora = precioXHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {

        return "Curso de '" + nombreCurso + '\'' +
                "\nLista de alumnos: " + Arrays.toString(alumnos) +
                "\ncantHorasXDia: " + cantHorasXDia +
                "\ncantDiasXSemana: " + cantDiasXSemana +
                "\nturno: '" + turno + '\'' +
                "\nprecioXHora: " + precioXHora;
    }
}

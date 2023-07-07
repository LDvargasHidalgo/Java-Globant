package Ejercicio13;


import Ejercicio13.Entidad.Curso;
import Ejercicio13.Servicios.ServicioCurso;

public class Main {
    public static void main(String[] args) {

        ServicioCurso servicioCurso = new ServicioCurso();
        Curso curso = servicioCurso.crearCurso();
        System.out.println(curso.toString());
        servicioCurso.calcularGananciaSemanal(curso);

    }
}

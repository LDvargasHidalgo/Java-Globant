package EjerciciosDeAprendizaje.Ejercicio13.Servicios;

import EjerciciosDeAprendizaje.Ejercicio13.Entidad.Curso;

import java.util.Scanner;

public class ServicioCurso {
    Scanner scan = new Scanner(System.in);

    //METODO PARA LLENAR LA LISTA DE ALUMNOS
    public String[] cargarAlumnos() {
        System.out.println("LISTA DE ALUMNOS");
        String[] alumnos = new String[5];
        int i = 0;
        for (String alumno : alumnos) {
            System.out.println("Ingrese el nombre del alumno Nª" + (i + 1));
            alumnos[i] = scan.nextLine();
            i++;
        }
        return alumnos;
    }

    //METODO CREAR CURSO
    public Curso crearCurso() {
        Curso curso = new Curso();
        System.out.println("Ingrese el nombre del curso");
        curso.setNombreCurso(scan.nextLine());
        System.out.println("ingrese la cantidad de horas por día");
        int cantidadHorasXDia = scan.nextInt();
        while (cantidadHorasXDia < 1 || cantidadHorasXDia > 24) {
            System.out.println("Error, intentalo de nuevo");
            System.out.println("ingrese la cantidad de horas por día");
            cantidadHorasXDia = scan.nextInt();
        }
        curso.setCantHorasXDia(cantidadHorasXDia);
        System.out.println("Ingresa la cantidad de días por semana");
        int diasXSemana = scan.nextInt();
        while (diasXSemana < 1 || diasXSemana > 7) {
            System.out.println("Error, intentalo de nuevo");
            System.out.println("ingrese la cantidad de días por semana");
            diasXSemana = scan.nextInt();
        }
        curso.setCantDiasXSemana(diasXSemana);
        System.out.println("Ingrese el precio por hora");
        curso.setPrecioXHora(scan.nextInt());
        System.out.println("Ingrese el turno: Mañana / Tarde");
        String turno = scan.next();
        turno = turno.toLowerCase();
        while (!(turno.equals("mañana") || turno.equals("tarde"))) {
            System.out.println("Error, intentalo de nuevo");
            System.out.println("Ingrese el turno: Mañana / Tarde");
            turno = scan.next();
            turno = turno.toLowerCase();
        }
        curso.setTurno(turno);
        curso.setAlumnos(cargarAlumnos());
        return curso;
    }

    //METODO CALCULAR GANANCIAS
    public void calcularGananciaSemanal(Curso curso) {
        int horas = curso.getCantHorasXDia();
        int precioXhora = curso.getPrecioXHora();
        int cantidadAlumnos = curso.getAlumnos().length;
        int cantidadDiasXSemana = curso.getCantDiasXSemana();
        int gananciaSemanal;
        gananciaSemanal = horas * precioXhora * cantidadAlumnos * cantidadDiasXSemana;
        System.out.println("La ganancia semanal del curso de " + curso.getNombreCurso()
                + " es de: " + gananciaSemanal);
    }

    //imprimir alumnos
    public void imprimirAlumnos(String[] alumnos) {
        int i = 0;
        for (String alumno : alumnos) {
            System.out.println(alumnos[i]);
            i++;
        }
    }
}



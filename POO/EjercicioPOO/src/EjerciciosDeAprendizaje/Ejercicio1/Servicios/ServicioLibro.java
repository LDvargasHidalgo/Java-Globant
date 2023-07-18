package EjerciciosDeAprendizaje.Ejercicio1.Servicios;

import EjerciciosDeAprendizaje.Ejercicio1.Entidades.Libro;

import java.util.Scanner;

public class ServicioLibro {
    Scanner scan = new Scanner(System.in);
    public Libro cargarLibro(){
        Libro l1 = new Libro();
        System.out.println("Ingrese el ISBN del libro");
        l1.setISBN(scan.nextLine());
        System.out.println("Ingrese el título del libro");
        l1.setTitulo(scan.nextLine());
        System.out.println("Ingrese el autor del libro " );
        l1.setAutor(scan.nextLine());
        System.out.println("ingrese el número de paginas del libro");
        l1.setNumPaginas(scan.nextInt());
        return l1;
    }

    public void MostrarDatos(Libro libro){
        System.out.println("Título :"+ libro.getTitulo());
        System.out.println("Autor :"+libro.getAutor());
        System.out.println("ISBN :" +libro.getISBN());
        System.out.println("Número de paginas :" + libro.getNumPaginas());
    }
}

/*
* EJERCICIO
* Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
* */
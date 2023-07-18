package EjerciciosDeAprendizaje.Ejercicio14.Srvicios;

import EjerciciosDeAprendizaje.Ejercicio14.Entidades.Movil;

import java.util.Scanner;

public class ServicioMovil {
    Scanner scan = new Scanner(System.in);

    //METODO INGRESAR CODIGO
    public char[] ingresarCodigo() {
        char[] codigo = new char[7];
        System.out.println("Ingrese el codigo de su Movil (7 digitos)");
        String codigoNum = scan.next();
        while (!(codigoNum.length() == 7)) {
            System.out.println("Codigo incorrecto intente nuevamente");
            codigoNum = scan.next();
        }
        //Separa el string y pone cada letra del string en un espacio del arreglo dodigo
        codigo = codigoNum.toCharArray();
        return codigo;
    }

    //METODO CARGAR CELULAR
    public Movil cargarCelular(){
        Movil movil = new Movil();
        System.out.println("DATOS DEl MOVIL");
        System.out.println("Ingrese la marca del movil");
        movil.setMarca(scan.nextLine());
        System.out.println("Ingrese el precio del movil");
        movil.setPrecio(scan.nextInt());
        System.out.println("Ingrese el modelo del movil");
        movil.setModelo(scan.nextInt());
        System.out.println("Ingrese memoria Ram");
        movil.setMemoriaRam(scan.nextInt());
        System.out.println("Ingrese la capacidad de almacenamiento del movil");
        movil.setAlmacenamiento(scan.nextInt());
        movil.setCodigo(ingresarCodigo());
        return movil;
    }



    //imprimir codigo
    public void  imprimirCodigo(char[] codigo){
        int i = 0;
        for (char numero: codigo){
            System.out.print("["+codigo[i]+"],");
            i++;
        }
    }

    //METODO CARGAR CELULAR
}

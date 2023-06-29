package Arrays;

import java.util.Arrays;


public class MetodosArrays {
    public static void main(String[] args) {
        int arreglo1[] = {2,4,6,8,1,3};
        imprimirArreglo(arreglo1);

        //METODO FILL : Metodo para inicializar arreglos con un solo valor determinado
        int arreglo2[]= new int[5];
        Arrays.fill(arreglo2,7);// me imprime solo 7s
        imprimirArreglo(arreglo2);

        //METODO COPYOF : Método que nos permite copiar el contenido de un arreglo en otro arreglo
        int arreglo3[] = Arrays.copyOf(arreglo1,2);
        imprimirArreglo(arreglo3);

        //METODO EQUALS: Método para comparar si el contenido de dos arreglos es igual
        if (Arrays.equals(arreglo1, arreglo2)){
            System.out.println("Los arreglos son iguales");
        }else{
            System.out.println("Los arreglos son distintos");
        }

        //METODO SORT : Método para ordenar arreglos de forma ascendente
        Arrays.sort(arreglo1);
        imprimirArreglo(arreglo1);

        //METODO BINARYSEARCH: Sirve para buscar un determinado elemento en un arreglo
        //el método devuelve la posición en la cual se encuentra el elemento
        int posicion = Arrays.binarySearch(arreglo1,8);
        System.out.println("El elemento se encuentra en la posición "+ posicion);
    }

    // METODO PARA IMPRIMIR ARREGLO
    public static void imprimirArreglo(int arreglo[]){
        System.out.println("****ARREGLO****");
        for(int i = 0; i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
    }
}

//Creamos el metodo static para que no tengamos que crear un objeto de nuestra clase
// si no que lo podamos utilizar directamente
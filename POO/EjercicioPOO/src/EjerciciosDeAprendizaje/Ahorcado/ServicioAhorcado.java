package EjerciciosDeAprendizaje.Ahorcado;

import java.util.Random;

public class ServicioAhorcado {

    public String[] listaPalabras = {"carro", "moto", "perro", "gato","bicicleta","raton"};
    EntidadAhorcado entidAhorcado = new EntidadAhorcado();

    //Random random = new Random();

    //generar un numero aleatoria de la longitud del arrelglo que tiene nuestra lista
    public String palabraSeleccionada() {
        String palabraSelec;
        double numero = Math.random() * listaPalabras.length;
        int numRandom = (int)numero;
        palabraSelec = listaPalabras[numRandom];
        return palabraSelec;
    }

    //llenar mi  vectorpalabra de la entidad
    public char[] llenarArray(){
        String palabraSelec = palabraSeleccionada();
        char[] arregloPalabra = new char[palabraSelec.length()];
        System.out.println(palabraSelec);
        for (int i = 0;i<palabraSelec.length();i++){
            arregloPalabra[i] = palabraSelec.charAt(i);
        }
        entidAhorcado.setPalabra(arregloPalabra);
        return entidAhorcado.getPalabra();
    }

    //Llenar un nuevo  vector _
    public char[] llenarVector_(){
        int longitud = palabraSeleccionada().length();
        char[] newVector = new  char[longitud];
        for (int i=0;i<longitud;i++){
            newVector[i] ='_';
        }
        return newVector;
    }

    //metodo para retornar la longitud de un vector
    public int longitudVector(char[] vector){
        int longitud = vector.length;
        return longitud;
    }


    //Imprimir atributo palabra[]
   public void imprimirPalabra(){
        int longitud = longitudVector(entidAhorcado.getPalabra());
        for (int i= 0; i<13;i++){
            System.out.println();
        }
    };
}

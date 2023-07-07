package Arreglos_como_atributos;

public class Competidores {
    private String nombreEvento;
    private String[] competidores;
    private int[] tiempos;
    private int largo;
    private int posicion;


    //Inicializamos nuestros dos vectores con largo cantidad de elementos
    public Competidores(int largo) {
        this.largo = largo;
        this.posicion = 0;
        competidores = new String[largo];
        tiempos = new int[largo];

    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String[] getCompetidores() {
        return competidores;
    }

    public void setCompetidores(String[] competidores) {
        this.competidores = competidores;
    }

    public int[] getTiempos() {
        return tiempos;
    }

    public void setTiempos(int[] tiempos) {
        this.tiempos = tiempos;
    }

    public int getLargo() {
        return largo;
    }


    public int getPosicion() {
        return posicion;
    }

    //no necesito settear el largo ni la posicion de mi objeto por
    // eso no se crean setter para estos atributos
    //posicion es un atributo para llevar el registro de cuantos elementos
    //tengo por eso no debo permitir que sea modificado


    //METODOS PERSONALIZADOS
    public void agregar(String competidor, int tiempo) {
        if (posicion < largo) {
            competidores[posicion] = competidor;
            tiempos[posicion] = tiempo;
            posicion++;
            System.out.println("Elemento agregado exitosamente");
        } else {
            System.out.println("El elemento no se pudo agregar");
        }
    }


    //METODO PARA IMPRIMIR LA LISTA DE TODOS LOS COMPETIDORESç
    public void imprimeCompetidores() {
        System.out.println("===LISTA DE COMPETIDORES===");
        for (int i = 0; i < largo; i++) {
            System.out.println("Competidor " + (i + 1) + competidores[i] + " Tiempo: " + tiempos[i]);
        }
    }

    //*****METODO POSICIÓN MENOR****.
    // Busca en el arreglo de tiempos cual es el elemento menor y retorna su posición

    public int posicionMenor() {
        int menor, posicionMenor = 0;
        //Debemos tomar el numero mayor posible que este caso la guia nos decia que era 1000
        menor = 1001;
        //Debemos recorrer el arreglo solo la cantidad de elementos que tiene el objeto porque las
        // otras posiciones esstan vacias y me pueden enviar ceros
        for (int i = 0; i < posicion; i++) {
            if (tiempos[i] < menor) {
                menor = tiempos[i];
                posicionMenor = i;
            }
        }
        return posicionMenor;

    }

    //*****IMPRIME GANADOR*** Debe imprimir el nombre y el tiempo del mejor competidor
    public void imprimeGanador() {
        int i = posicionMenor();
        System.out.println("==== GANADOR ====");
        System.out.println("Competidor: " + competidores[i] + "Tiempo: " + tiempos[i]);
    }

    //***PROMEDIO***
    public int promedio() {
        int suma = 0, promedio = 0;
        for (int i = 0; i < posicion; i++) {
            suma += tiempos[i];
        }
        promedio = (int) suma / posicion;
        return promedio;
    }

    /*===IMPRIME MEJORES COMPETIDORES==== Este método imprime la lista de los competidores que estan debajo del promedio*/
    public void imprimirMejoresCompetidores() {
        System.out.println("===MEJORES COMPETIDORES====");
        for (int i = 0; i < posicion; i++) {
            if (tiempos[i] < promedio()) {
                System.out.println("Competidor" + competidores[i] + "Tiempo: " + tiempos[i]);
            }
        }
    }
}
package Date;

import java.util.Date;

public class Date_ejercicios {


    public static void main(String[] args) {

        System.out.println(" Tienes "+calcularAnios(4,7,1989)+ " años de edad");

    }

    //METODO CALCULAR AÑOS
    public static int calcularAnios(int dia, int mes, int anio) {
        int diaActual, mesActual, anioActual;

        Date fechaActual = new Date();//Objeto que nos retorna la fecha actual

        //Damos un valor a cada una de las variables
        diaActual = fechaActual.getDate();
        mesActual = fechaActual.getMonth() + 1;//por que java empieza a contar desde cero y necesitamos
        // comenzar desde el mes 1 que es enero
        anioActual = fechaActual.getYear() + 1900;// java me da el año con una diferencia de 1900
        int diferenciaAnio = anioActual - anio;

        if(mesActual<mes){
            diferenciaAnio--;
            } else if (mesActual == mes & diaActual < dia ) {
            diferenciaAnio--;
        }
        return diferenciaAnio;
        }

    }


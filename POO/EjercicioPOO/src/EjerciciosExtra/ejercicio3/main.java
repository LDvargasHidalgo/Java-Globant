package EjerciciosExtra.ejercicio3;

public class main {
    public static void main(String[] args) {

        double discriminante;
        boolean tieneRaiz;
        ServicioRaices servicioRaices = new ServicioRaices();
        Raices raices = new Raices(1,-5,6);
        discriminante = servicioRaices.getDiscriminante(raices);
        servicioRaices.calcular(raices,discriminante);
    }
}
//ejemplo para una solucion a=2, b=4, c=2 soluciòn -4
//2 soluciones a=1, b=-5, c=6 solución1 = 3, soluciòn2 =2
package EjerciciosExtra.ejercicio3;

public class ServicioRaices {

    public double getDiscriminante(Raices raices) {
        int a = raices.getA();
        int b = raices.getB();
        int c = raices.getC();
        double discriminante = (Math.pow(b, 2) - 4 * a * c);
        return discriminante;
    }

    public boolean tieneRaiz(double discriminante) {
        boolean tieneRaiz = false;
        if (discriminante == 0) {
            tieneRaiz = true;
        }
        return tieneRaiz;
    }

    public boolean tieneRaices(double discriminante) {
        boolean tieneRaices = false;
        if (discriminante > 0) {
            tieneRaices = true;
        }
        return tieneRaices;
    }

    //METODO OBTENER RAICES
    public void obtenerRaices(Raices raices, double discriminante) {
        int a = raices.getA();
        int b = raices.getB();
        int c = raices.getC();
        if (tieneRaices(discriminante)) {
            System.out.println("LA OPERACIÓN TIENE 2 SOLUCIONES");
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Raiz 1 = "+ raiz1);
            System.out.println("Raiz 2 = "+ raiz2);
        }
    }

    //METODO OBTENER RAIZ
    public void obtenerRaiz(Raices raices, double discriminante) {
        int a = raices.getA();
        int b = raices.getB();
        int c = raices.getC();
        if (tieneRaiz(discriminante)) {
            System.out.println("El resultado de la raiz: " + ((b * -1) + Math.sqrt(Math.pow(b, 2) - 4 * a * c) / 2 * a));
        }
    }

    //METODO CALCULAR RAIZ
    public void calcular(Raices raices, double discriminante) {
        if (tieneRaices(discriminante)) {
            obtenerRaices(raices, discriminante);
        } else if (tieneRaiz(discriminante)) {
            obtenerRaiz(raices, discriminante);
            System.out.println("El resultado tiene 1 solución posible");
        } else {
            System.out.println("No existe solución");
        }
    }
}

//Discriminante de la ecuación cuadrática
//si Discriminante>0, la ecución tiene dos soluciones reales distintas
//si D = 0, la ecuación tiene una solucion real
//si D<0, la ecuación no tiene solución real


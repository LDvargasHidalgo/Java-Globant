package EjerciciosDeAprendizaje.Ejercicio4.Servicios;

import EjerciciosDeAprendizaje.Ejercicio4.Entidades.Rectangulo;

import java.util.Scanner;

public class ServicioRectangulo {

    Scanner scan = new Scanner(System.in);

    //METODO PARA CREAR RECTÁNGULO
    public Rectangulo CrearRectangulo() {
        System.out.println("Digite la base del rectángulo");
        double base = scan.nextDouble();
        System.out.println("Digite la altura del rectángulo");
        double altura = scan.nextDouble();

        //Instacio mi objeto con el constructor por parametros
        Rectangulo r1 = new Rectangulo(base, altura);
        return r1;
    }

    //METODO PARA CALCULAR LA SUPERFICIE DEL RECTÁNGULO
    public double Superficie(Rectangulo r1){
        double superficie;
        superficie = r1.getBase() * r1.getAltura();
        return superficie;
    }

    //METODO PARA CALCULAR PERÍMETRO DEL RECTÁNGULO
    public double Perimetro(Rectangulo r1){
        double perimetro;
        perimetro = (r1.getBase()+ r1.getAltura())*2;
        return perimetro;
    }

    //DIBUJAR EL RECTANGULO CON ASTERISCOS
    public void DibujarRectangulo(Rectangulo r1){

      for(int i = 0; i< r1.getBase();i++){
          for (int j = 0; j< r1.getAltura();j++){
              System.out.print(" * ");
          }
          System.out.println();
      }
    }
}

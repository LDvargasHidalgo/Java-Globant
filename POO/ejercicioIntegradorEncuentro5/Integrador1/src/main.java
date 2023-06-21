import Entidades.Vehiculo;
import Servicios.ServiceVehiculo;

public class main {
    public static void main(String[] args) {
        ServiceVehiculo sV = new ServiceVehiculo();
        Vehiculo v1 = sV.CrearVehiculo();
        System.out.println( v1.toString());
        sV.Frenar(15,v1);
    }
}

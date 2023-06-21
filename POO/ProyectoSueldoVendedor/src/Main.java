import Entidades.Vendedor;
import Servicios.VendedorServicio;

public class Main {
    public static void main(String[] args) {
        VendedorServicio service1 = new VendedorServicio();
        Vendedor v1 = service1.altaVendedor();
        service1.vacaciones(v1);
        service1.SueldoMensual(v1);
    }
}

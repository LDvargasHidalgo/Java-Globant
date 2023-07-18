package EjerciciosExtra.ejercicio4;

import java.util.Scanner;

public class ServicioNIF {
    Scanner scan = new Scanner(System.in);


    //Este metodo ademas de asignar la letra tambien esta creando el objeto y asignando sus atributos
    public NIF crearNif() {
        NIF nif = new NIF();
        long DNILong;
        System.out.println("Digita tu DNI");
        String DNI = scan.nextLine();
        String letra = "";
        while (!(DNI.length() == 8)) {
            System.out.println("Tu DNI debe contener 8 caracteres, intentalo de nuevo");
            DNI = scan.nextLine();
        }
        nif.setDNI(Long.parseLong(DNI));
        DNILong = nif.getDNI();
        int modulo = (int) DNILong % 23;
        System.out.println("Este es el modulo de la division " + modulo);
        switch (modulo) {
            case 0:
                letra = "T";
                break;
            case 1:
                letra = "R";
                break;
            case 2:
                letra = "W";
                break;
            case 3:
                letra = "A";
                break;
            case 4:
                letra = "G";
                break;
            case 5:
                letra = "M";
                break;
            case 6:
                letra = "Y";
                break;
            case 7:
                letra = "F";
                break;
            case 8:
                letra = "P";
                break;
            case 9:
                letra = "D";
                break;
            case 10:
                letra = "X";
                break;
            case 11:
                letra = "B";
                break;
            case 12:
                letra = "N";
                break;
            case 13:
                letra = "J";
                break;
            case 14:
                letra = "Z";
                break;
            case 15:
                letra = "S";
                break;
            case 16:
                letra = "Q";
                break;
            case 17:
                letra = "V";
                break;
            case 18:
                letra = "H";
                break;
            case 19:
                letra = "L";
                break;
            case 20:
                letra = "C";
                break;
            case 21:
                letra = "K";
                break;
            case 22:
                letra = "E";
                break;
            default:
                System.out.println("Algo salio mal =(");
                break;
        }
        nif.setLetra(letra);
        return nif;
    }

    public void mostrar(NIF nif){
        System.out.println("NIF asignado para el usuario "+ nif.getDNI()+"-"+nif.getLetra());
    }
}



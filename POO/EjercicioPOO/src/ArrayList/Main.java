package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //List<Persona> listaPerona; = Declarar sin inicializar
        List<Persona>listaPersona = new ArrayList<Persona>();
        listaPersona.add(new Persona(1,"Daniela",30));
        listaPersona.add(new Persona(2,"Daniel",9));
        listaPersona.add(new Persona(3,"Mariana",12));
        listaPersona.add(new Persona(4,"Santiago",10));

        //Recorrer por indice
        for (int i = 0; i< listaPersona.size();i++){
            System.out.println(listaPersona.get(i).getNombre());
        }

        //---------FOR EACH---------------
        for (Persona persona : listaPersona ) {
            System.out.println(persona.getNombre());
        }
    }
}

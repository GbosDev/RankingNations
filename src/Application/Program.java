package Application;

import Entities.PaisG20;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
    public static void main(String[] Args) {

        ArrayList<PaisG20> paises = new ArrayList<>();
        paises.add(new PaisG20("Estados Unidos", 22940.0, 331002651));
        paises.add(new PaisG20("China", 17730.0, 1439323776));
        paises.add(new PaisG20("Japão", 4975.0, 126476461));
        paises.add(new PaisG20("Alemanha", 4260.0, 83783942));
        paises.add(new PaisG20("Brasil", 1830.0, 212559417));

        Collections.sort(paises);
        System.out.println("Países do G20 ordenados por PIB (decrescente) e população (crescente):");
        for (PaisG20 pais : paises) {
            System.out.println(pais);
        }

        System.out.println("\nComparação de igualdade:");
        PaisG20 brasil1 = new PaisG20("Brasil", 1830.0, 212559417);
        PaisG20 brasil2 = new PaisG20("Brasil", 1800.0, 210000000);
        System.out.println(brasil1 + " é igual a " + brasil2 + "? " + brasil1.equals(brasil2));

        System.out.println("\nTestando contains() com nova instância de Brasil:");
        System.out.println("Lista contém Brasil? " + paises.contains(new PaisG20("Brasil", 1500.0, 200000000)));
    }
}

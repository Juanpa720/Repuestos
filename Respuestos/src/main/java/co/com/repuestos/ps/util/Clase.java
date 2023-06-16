package co.com.repuestos.ps.util;

import java.util.ArrayList;
import java.util.List;

public class Clase {
    public static void main(String[] args) {
        int numero = 2;

        //Ejemplo con if-else
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        System.out.println("------------------------------------------");
        // Ejemplo con switch
        switch (numero) {
            case 1:
                System.out.println("El número es uno.");
                break;
            case 2:
                System.out.println("El número es dos.");
                break;
            case 3:
                System.out.println("El número es tres.");
                break;
            default:
                System.out.println("El número no es ni uno, dos ni tres.");
                break;
        }
        System.out.println("------------------------------------------");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("El contador es: " + contador);
            contador++;
        }
        System.out.println("------------------------------------------");
        int contador1 = 1;
        do {
            System.out.println("El contador es: " + contador1);
            contador1++;
        } while (contador1 <= 5);

        System.out.println("------------------------------------------");
        for (int i = 1; i <= 5; i++) {
            System.out.println("El contador es: " + i);
        }

        List<String> pokemons= new ArrayList<>();

        pokemons.add("Pikachu");
        pokemons.add("mew");
        pokemons.add("zapdos");
        pokemons.add("ratata");

        System.out.println(pokemons.stream().findFirst().get());



    }
}
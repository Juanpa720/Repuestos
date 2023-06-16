package co.com.repuestos.ps.util;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static void main(String[] args) {
        //TODO  Ejercio1 Hacer un menu de restaurant  switch ();

        int comida = 0;
        switch (comida) {
            case 1:
                System.out.println("frijoles.");
                break;
            case 2:
                System.out.println("lentejas.");
                break;
            case 3:
                System.out.println("arroz con pollo.");
                break;
            default:
                System.out.println("Ensalada de frutas.");
                break;
        }
    }
}


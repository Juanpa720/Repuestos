package co.com.repuestos.ps.util;

public class EjemploArreglo {

        public static void main (String[] args){



                //declaracion e inicializacion de un arreglo de entornos
                int[] numeros;

                numeros = new int [5];

                //asignacion de valores a los elementos del arreglo
                numeros [0] = 10;
                numeros [1] = 20;
                numeros [2] = 30;
                numeros [3] = 40;
                numeros [4] = 50;

                for (int i = 1; i < numeros.length; i++){
                        System.out.println("Elemento en la posicion 0: " + numeros[0]);
                }


                //acceso y lectura de los elementos del arreglo

                System.out.println("Elemento en la posicion 0: " + numeros[0]);
                System.out.println("Elemento en la posicion 0: " + numeros[2]);
                System.out.println("Elemento en la posicion 0: " + numeros[4]);

                //Declaración e inicialización de los elementos del arreglo


                //
        }
}

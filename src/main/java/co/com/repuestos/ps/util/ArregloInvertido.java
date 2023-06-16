import java.util.Arrays;

public class ArregloInvertido{
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};

        System.out.println("Arreglo organizado: " + Arrays.toString(arreglo));

        int[] arregloInvertido = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            arregloInvertido[i] = arreglo[arreglo.length - 1 - i];
        }

        System.out.println("Arreglo invertido: " + Arrays.toString(arregloInvertido));
    }
}
import java.util.HashMap;
import java.util.Map;

public class PromedioDeEstudiantes {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();


        notas.put("Nicolas", 7);
        notas.put("Sebastian", 9);
        notas.put("Dylan", 10);
        notas.put("Maria", 5);

        int notaNicolas = notas.get("Nicolas");
        System.out.println("La nota de Nicolas es: " + notaNicolas);

        int total = 0;
        int mejorNota = Integer.MIN_VALUE;
        int bajaNota = Integer.MAX_VALUE;

        for (int nota : notas.values()) {
            total += nota;

            if (nota > mejorNota) {
                mejorNota = nota;
            }

            if (nota < bajaNota) {
                bajaNota = nota;
            }
        }

        double promedio = (double) total / notas.size();
        System.out.println("El promedio de las notas es: " + promedio);
        System.out.println("La nota mas alta es: " + mejorNota);
        System.out.println("La nota más baja es: " + bajaNota);
    }
}

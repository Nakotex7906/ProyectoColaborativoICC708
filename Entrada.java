import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> calificaciones = new ArrayList<>();

        System.out.println("Ingrese las calificaciones (0 para terminar)");

        while (true) { 
            double calificacion = scanner.nextDouble();
            if(calificacion == 0) break;
            calificaciones.add(calificacion);
        }
        scanner.close();

        System.out.println("Las notas son: " + calificaciones);

    }
}

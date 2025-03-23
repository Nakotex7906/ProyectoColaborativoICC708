import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static ArrayList<Double> obtenerCalificaciones() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> calificaciones = new ArrayList<>();

        System.out.println("Ingrese las notas, 0 para terminar");

        while (true) {
            double notasIngresadas = scanner.nextDouble();
            if (notasIngresadas == 0) {
                break;
            }
            calificaciones.add(notasIngresadas);
            
        }
        scanner.close();
        return calificaciones;
    }
}

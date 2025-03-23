import java.util.ArrayList;

public class Proceso {

    public static double calcularPromedio(ArrayList<Double> calificaciones) {
        
        if (calificaciones.isEmpty()) return 0;
        
        double suma = 0;
        for (double nota : calificaciones) {
            suma += nota;
        }
        return suma / calificaciones.size();
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class Proceso{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Arraylist<Double> calificaciones = new Arraylist<>();

        System.out.println("Ingrese las calificaciones (0 para terminar)");
        
        while(true){
            double calificaciones = scanner.nextDouble();
            
            if (calificacion == 0) break;
            calificaciones.add(calificacion);
        }

        scanner.close();

        System.out.println("Las notas son: " + calificaciones);

        if(!calificaciones.is Empty()){
           
            double suma = 0;
            double promedio = 0;

            for(double c : calificaciones) {
                suma += c;
            }
            promedio = (suma / calificaciones.size())

    
        } 


    }

}
// EJERCICIO 11
import java.util.Scanner;

public class Ej11AnalisCalificaciones {
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Ej11AnalisCalificaciones m = new Ej11AnalisCalificaciones(); 
        // Llama al método para llenar la matriz de calificaciones
        Double[][] matrizCalificaciones = m.LlenarMatrizCalificaciones(); 
        // Llama al método para calcular el promedio de cada estudiante
        Double[] promedios = m.HallarPromedioEstudiantes(matrizCalificaciones);
        // Llama al método para encontrar el mejor estudiante en el examen 3
        int mejorEstudianteExamen3 = m.HallarMejorEstudianteEnExamen(matrizCalificaciones, 2);
        // Llama al método para encontrar los mejores en examen 1 y 5
        int mejorExamen1 = m.HallarMejorEstudianteEnExamen(matrizCalificaciones, 0);
        int mejorExamen5 = m.HallarMejorEstudianteEnExamen(matrizCalificaciones, 4);
        // Llama al método para encontrar el examen con promedio más alto
        int examenPromedioAlto = m.HallarExamenConMayorPromedio(matrizCalificaciones);

        // Imprime los promedios de estudiantes
        System.out.println("Promedio de cada estudiante:");
        for (int i = 0; i < promedios.length; i++){
            System.out.println("Estudiante " + i + ": " + promedios[i]);
        }
        
        System.out.println("\nMejor estudiante en examen 3 (posición 2): Estudiante " + mejorEstudianteExamen3);
        System.out.println("Mejor estudiante en examen 1 (posición 0): Estudiante " + mejorExamen1);
        System.out.println("Mejor estudiante en examen 5 (posición 4): Estudiante " + mejorExamen5);
        System.out.println("Examen con promedio más alto: Examen " + (examenPromedioAlto + 1) + " (posición " + examenPromedioAlto + ")");
    }

    // Método que crea una matriz de calificaciones con N estudiantes y 5 exámenes
    public Double[][] LlenarMatrizCalificaciones(){
        System.out.println("Ingrese el número de estudiantes:");
        int estudiantes = sc.nextInt();
        
        Double[][] matriz = new Double[estudiantes][5];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < 5; j++){
                System.out.println("Ingrese la calificación del estudiante " + i + " en el examen " + (j + 1) + ":");
                matriz[i][j] = sc.nextDouble();
            }
        }
        return matriz;
    }
    
    // Método que calcula el promedio de cada estudiante
    public Double[] HallarPromedioEstudiantes(Double[][] matriz){
        Double[] promedios = new Double[matriz.length];
        for (int i = 0; i < matriz.length; i++){
            Double suma = 0.0;
            for (int j = 0; j < matriz[i].length; j++){
                suma = suma + matriz[i][j];
            }
            promedios[i] = suma / matriz[i].length;
        }
        return promedios;
    }
    
    // Método que encuentra el mejor estudiante en un examen específico
    public int HallarMejorEstudianteEnExamen(Double[][] matriz, int numeroExamen){
        int mejorEstudiante = 0;
        Double mejorNota = matriz[0][numeroExamen];
        for (int i = 0; i < matriz.length; i++){
            if (matriz[i][numeroExamen] > mejorNota){
                mejorNota = matriz[i][numeroExamen];
                mejorEstudiante = i;
            }
        }
        return mejorEstudiante;
    }
    
    // Método que encuentra el examen con promedio más alto
    public int HallarExamenConMayorPromedio(Double[][] matriz){
        int numeroExamen = 0;
        Double mayorPromedio = 0.0;
        
        for (int j = 0; j < 5; j++){
            Double sumaExamen = 0.0;
            for (int i = 0; i < matriz.length; i++){
                sumaExamen = sumaExamen + matriz[i][j];
            }
            Double promedioExamen = sumaExamen / matriz.length;
            if (promedioExamen > mayorPromedio){
                mayorPromedio = promedioExamen;
                numeroExamen = j;
            }
        }
        return numeroExamen;
    }

}

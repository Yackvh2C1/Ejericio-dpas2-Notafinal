// EJERCICIO 4
import java.util.Scanner;

public class Ej4MaximaColumna {
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Ej4MaximaColumna m = new Ej4MaximaColumna(); 
        // Llama al método para llenar la matriz 10x10 con números
        Double[][] matriz = m.LlenarMatriz(); 
        // Llama al método para calcular la suma de cada columna
        Double[] sumaColumnas = m.HallarSumaColumnas(matriz); 
        // Llama al método para encontrar la columna con máxima suma
        int numeroColumnaMaxima = m.HallarColumnaMaxima(sumaColumnas);

        // Imprime la columna que tuvo la máxima suma
        System.out.println("La columna con máxima suma es: " + numeroColumnaMaxima);
        System.out.println("La suma de esa columna es: " + sumaColumnas[numeroColumnaMaxima]);
    }

    // Método que crea una matriz 10x10 y la llena con números ingresados por el usuario
    public Double[][] LlenarMatriz(){
        Double[][] matriz = new Double[10][10];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Ingrese el número para posición [" + i + "][" + j + "]:");
                matriz[i][j] = sc.nextDouble();
            }
        }
        return matriz;
    }
    
    // Método que calcula la suma de cada columna
    public Double[] HallarSumaColumnas(Double[][] matriz){
        Double[] sumaColumnas = new Double[matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++){
            sumaColumnas[j] = 0.0;
            for (int i = 0; i < matriz.length; i++){
                sumaColumnas[j] = sumaColumnas[j] + matriz[i][j];
            }
        }
        return sumaColumnas;
    }
    
    // Método que encuentra la columna con máxima suma
    public int HallarColumnaMaxima(Double[] sumaColumnas){
        int numeroColumnaMaxima = 0;
        Double maximaSuma = sumaColumnas[0];
        for (int i = 0; i < sumaColumnas.length; i++){
            if (sumaColumnas[i] > maximaSuma){
                maximaSuma = sumaColumnas[i];
                numeroColumnaMaxima = i;
            }
        }
        return numeroColumnaMaxima;
    }

}

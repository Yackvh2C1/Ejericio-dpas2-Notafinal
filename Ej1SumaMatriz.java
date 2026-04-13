// EJERCICIO 1
import java.util.Scanner;

public class Ej1SumaMatriz {
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Ej1SumaMatriz m = new Ej1SumaMatriz(); 
        // Llama al método para llenar la matriz 6x6 con números
        Double[][] matriz = m.LlenarMatriz(); 
        // Llama al método para calcular la suma de todos los números
        Double suma = m.HallarSuma(matriz); 

        // Imprime la suma total calculada
        System.out.println("La suma de la matriz es: " + suma);
    }

    // Método que crea una matriz 6x6 y la llena con números ingresados por el usuario
    public Double[][] LlenarMatriz(){
        Double[][] matriz = new Double[6][6];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Ingrese el número para posición [" + i + "][" + j + "]:");
                matriz[i][j] = sc.nextDouble();
            }
        }
        return matriz;
        
    }
    
    // Método que calcula la suma de todos los números almacenados en la matriz
    public Double HallarSuma(Double[][] matriz){
        Double suma = 0.0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                suma = suma + matriz[i][j];
            }
        }
        return suma;
    }

}

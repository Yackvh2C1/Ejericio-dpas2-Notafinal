// EJERCICIO 3
import java.util.Scanner;

public class Ej3SumaFilasColumnas {
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Ej3SumaFilasColumnas m = new Ej3SumaFilasColumnas(); 
        // Llama al método para llenar la matriz 5x5 con números
        Double[][] matriz = m.LlenarMatriz(); 
        // Llama al método para calcular la suma de cada fila
        Double[] sumaFilas = m.HallarSumaFilas(matriz); 
        // Llama al método para calcular la suma de cada columna
        Double[] sumaColumnas = m.HallarSumaColumnas(matriz);

        // Imprime las sumas por fila
        System.out.println("Suma de cada fila:");
        for (int i = 0; i < sumaFilas.length; i++){
            System.out.println("Fila " + i + ": " + sumaFilas[i]);
        }
        
        // Imprime las sumas por columna
        System.out.println("\nSuma de cada columna:");
        for (int i = 0; i < sumaColumnas.length; i++){
            System.out.println("Columna " + i + ": " + sumaColumnas[i]);
        }
    }

    // Método que crea una matriz 5x5 y la llena con números ingresados por el usuario
    public Double[][] LlenarMatriz(){
        Double[][] matriz = new Double[5][5];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Ingrese el número para posición [" + i + "][" + j + "]:");
                matriz[i][j] = sc.nextDouble();
            }
        }
        return matriz;
    }
    
    // Método que calcula la suma de cada fila y la almacena en un vector
    public Double[] HallarSumaFilas(Double[][] matriz){
        Double[] sumaFilas = new Double[matriz.length];
        for (int i = 0; i < matriz.length; i++){
            sumaFilas[i] = 0.0;
            for (int j = 0; j < matriz[i].length; j++){
                sumaFilas[i] = sumaFilas[i] + matriz[i][j];
            }
        }
        return sumaFilas;
    }
    
    // Método que calcula la suma de cada columna y la almacena en un vector
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

}

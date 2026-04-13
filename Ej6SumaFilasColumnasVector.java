// EJERCICIO 6
import java.util.Scanner;

public class Ej6SumaFilasColumnasVector {
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Ej6SumaFilasColumnasVector m = new Ej6SumaFilasColumnasVector(); 
        // Llama al método para llenar la matriz 8x8 con números
        Double[][] matriz = m.LlenarMatriz(); 
        // Llama al método para calcular la suma de cada fila
        Double[] sumaFilas = m.HallarSumaFilas(matriz); 
        // Llama al método para calcular la suma de cada columna
        Double[] sumaColumnas = m.HallarSumaColumnas(matriz);
        // Llama al método para combinar sumas en un vector
        Double[] vectorCombinado = m.CombinarSumas(sumaFilas, sumaColumnas);

        // Imprime el vector resultante
        System.out.println("Vector con sumas de filas y columnas:");
        for (int i = 0; i < vectorCombinado.length; i++){
            if (i < sumaFilas.length){
                System.out.println("Suma fila " + i + ": " + vectorCombinado[i]);
            } else {
                System.out.println("Suma columna " + (i - sumaFilas.length) + ": " + vectorCombinado[i]);
            }
        }
    }

    // Método que crea una matriz 8x8 y la llena con números ingresados por el usuario
    public Double[][] LlenarMatriz(){
        Double[][] matriz = new Double[8][8];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Ingrese el número para posición [" + i + "][" + j + "]:");
                matriz[i][j] = sc.nextDouble();
            }
        }
        return matriz;
    }
    
    // Método que calcula la suma de cada fila
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
    
    // Método que combina las sumas de filas y columnas en un vector
    public Double[] CombinarSumas(Double[] sumaFilas, Double[] sumaColumnas){
        Double[] vectorCombinado = new Double[sumaFilas.length + sumaColumnas.length];
        for (int i = 0; i < sumaFilas.length; i++){
            vectorCombinado[i] = sumaFilas[i];
        }
        for (int i = 0; i < sumaColumnas.length; i++){
            vectorCombinado[sumaFilas.length + i] = sumaColumnas[i];
        }
        return vectorCombinado;
    }

}

// EJERCICIO 9
import java.util.Scanner;

public class Ej9AnalisisMatriz {
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Ej9AnalisisMatriz m = new Ej9AnalisisMatriz(); 
        // Llama al método para llenar la matriz con dimensiones ingresadas por el usuario
        Double[][] matriz = m.LlenarMatriz(); 
        // Llama al método para encontrar el máximo y su posición
        int[] posicionMaximo = m.HallarPosicionMaximo(matriz);
        // Llama al método para encontrar el mínimo y su posición
        int[] posicionMinimo = m.HallarPosicionMinimo(matriz);
        // Llama al método para imprimir la columna del máximo
        Double[] columnaMaximo = m.ObtenerColumna(matriz, posicionMaximo[1]);
        // Llama al método para imprimir la fila del máximo
        Double[] filaMaximo = m.ObtenerFila(matriz, posicionMaximo[0]);

        // Imprime los resultados
        System.out.println("Máximo número: " + matriz[posicionMaximo[0]][posicionMaximo[1]] + " en posición [" + posicionMaximo[0] + "][" + posicionMaximo[1] + "]");
        System.out.println("Mínimo número: " + matriz[posicionMinimo[0]][posicionMinimo[1]] + " en posición [" + posicionMinimo[0] + "][" + posicionMinimo[1] + "]");
        
        System.out.println("\nColumna del máximo (columna " + posicionMaximo[1] + "):");
        for (int i = 0; i < columnaMaximo.length; i++){
            System.out.println(columnaMaximo[i]);
        }
        
        System.out.println("\nFila del máximo (fila " + posicionMaximo[0] + "):");
        for (int i = 0; i < filaMaximo.length; i++){
            System.out.println(filaMaximo[i]);
        }
    }

    // Método que crea una matriz con dimensiones m*n y la llena con números ingresados por el usuario
    public Double[][] LlenarMatriz(){
        System.out.println("Ingrese el número de filas:");
        int filas = sc.nextInt();
        System.out.println("Ingrese el número de columnas:");
        int columnas = sc.nextInt();
        
        Double[][] matriz = new Double[filas][columnas];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Ingrese el número para posición [" + i + "][" + j + "]:");
                matriz[i][j] = sc.nextDouble();
            }
        }
        return matriz;
    }
    
    // Método que encuentra la posición del máximo número en la matriz
    public int[] HallarPosicionMaximo(Double[][] matriz){
        int[] posicion = new int[2];
        Double maximo = matriz[0][0];
        posicion[0] = 0;
        posicion[1] = 0;
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] > maximo){
                    maximo = matriz[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }
    
    // Método que encuentra la posición del mínimo número en la matriz
    public int[] HallarPosicionMinimo(Double[][] matriz){
        int[] posicion = new int[2];
        Double minimo = matriz[0][0];
        posicion[0] = 0;
        posicion[1] = 0;
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] < minimo){
                    minimo = matriz[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }
    
    // Método que obtiene una columna de la matriz
    public Double[] ObtenerColumna(Double[][] matriz, int numeroColumna){
        Double[] columna = new Double[matriz.length];
        for (int i = 0; i < matriz.length; i++){
            columna[i] = matriz[i][numeroColumna];
        }
        return columna;
    }
    
    // Método que obtiene una fila de la matriz
    public Double[] ObtenerFila(Double[][] matriz, int numeroFila){
        Double[] fila = new Double[matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++){
            fila[j] = matriz[numeroFila][j];
        }
        return fila;
    }

}

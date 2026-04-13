// EJERCICIO 5
import java.util.Scanner;

public class Ej5MatrizAVector {
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Ej5MatrizAVector m = new Ej5MatrizAVector(); 
        // Llama al método para llenar la matriz 5x5 con números
        Double[][] matriz = m.LlenarMatriz(); 
        // Llama al método para almacenar toda la matriz en un vector
        Double[] vector = m.ConvertirMatrizAVector(matriz);

        // Imprime el vector resultante
        System.out.println("Vector resultante:");
        for (int i = 0; i < vector.length; i++){
            System.out.println("Posición " + i + ": " + vector[i]);
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
    
    // Método que almacena toda la matriz en un vector
    public Double[] ConvertirMatrizAVector(Double[][] matriz){
        Double[] vector = new Double[matriz.length * matriz[0].length];
        int indice = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                vector[indice] = matriz[i][j];
                indice++;
            }
        }
        return vector;
    }

}

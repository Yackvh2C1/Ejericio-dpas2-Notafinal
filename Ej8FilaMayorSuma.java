// EJERCICIO 8
import java.util.Scanner;

public class Ej8FilaMayorSuma {
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Ej8FilaMayorSuma m = new Ej8FilaMayorSuma(); 
        // Llama al método para llenar la matriz 5x5 con números
        Double[][] matriz = m.LlenarMatriz(); 
        // Llama al método para calcular la suma de cada fila
        Double[] sumaFilas = m.HallarSumaFilas(matriz);
        // Llama al método para encontrar la fila con mayor suma
        int numeroFila = m.HallarFilaMayorSuma(sumaFilas);

        // Imprime la fila con mayor suma
        System.out.println("La fila con mayor suma es: " + numeroFila);
        System.out.println("La suma de esa fila es: " + sumaFilas[numeroFila]);
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
    
    // Método que encuentra la fila con mayor suma
    public int HallarFilaMayorSuma(Double[] sumaFilas){
        int numeroFila = 0;
        Double mayorSuma = sumaFilas[0];
        for (int i = 0; i < sumaFilas.length; i++){
            if (sumaFilas[i] > mayorSuma){
                mayorSuma = sumaFilas[i];
                numeroFila = i;
            }
        }
        return numeroFila;
    }

}

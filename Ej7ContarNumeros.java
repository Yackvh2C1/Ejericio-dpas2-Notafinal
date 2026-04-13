// EJERCICIO 7
import java.util.Scanner;

public class Ej7ContarNumeros {
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Ej7ContarNumeros m = new Ej7ContarNumeros(); 
        // Llama al método para llenar la matriz 5x6 con números
        Double[][] matriz = m.LlenarMatriz(); 
        // Llama al método para contar ceros
        int ceros = m.ContarCeros(matriz);
        // Llama al método para contar positivos
        int positivos = m.ContarPositivos(matriz);
        // Llama al método para contar negativos
        int negativos = m.ContarNegativos(matriz);

        // Imprime los resultados
        System.out.println("Cantidad de ceros: " + ceros);
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
    }

    // Método que crea una matriz 5x6 y la llena con números ingresados por el usuario
    public Double[][] LlenarMatriz(){
        Double[][] matriz = new Double[5][6];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Ingrese el número para posición [" + i + "][" + j + "]:");
                matriz[i][j] = sc.nextDouble();
            }
        }
        return matriz;
    }
    
    // Método que cuenta la cantidad de ceros en la matriz
    public int ContarCeros(Double[][] matriz){
        int ceros = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == 0.0){
                    ceros++;
                }
            }
        }
        return ceros;
    }
    
    // Método que cuenta la cantidad de números positivos en la matriz
    public int ContarPositivos(Double[][] matriz){
        int positivos = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] > 0.0){
                    positivos++;
                }
            }
        }
        return positivos;
    }
    
    // Método que cuenta la cantidad de números negativos en la matriz
    public int ContarNegativos(Double[][] matriz){
        int negativos = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] < 0.0){
                    negativos++;
                }
            }
        }
        return negativos;
    }

}

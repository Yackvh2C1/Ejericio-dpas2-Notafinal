// EJERCICIO 2
import java.util.Scanner;

public class Ej2MayorMatriz {
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Ej2MayorMatriz m = new Ej2MayorMatriz(); 
        // Llama al método para llenar la matriz 5x5 con números
        Double[][] matriz = m.LlenarMatriz(); 
        // Llama al método para encontrar la posición del número mayor
        int[] posicion = m.HallarPosicionMayor(matriz); 

        // Imprime la posición del número mayor
        System.out.println("La posición del número mayor es fila: " + posicion[0] + ", columna: " + posicion[1]);
        System.out.println("El número mayor es: " + matriz[posicion[0]][posicion[1]]);
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
    
    // Método que encuentra la posición [fila, columna] del número mayor en la matriz
    public int[] HallarPosicionMayor(Double[][] matriz){
        int[] posicion = new int[2];
        Double mayor = matriz[0][0];
        posicion[0] = 0;
        posicion[1] = 0;
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] > mayor){
                    mayor = matriz[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }

}

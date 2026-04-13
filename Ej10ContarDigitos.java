// EJERCICIO 10
import java.util.Scanner;

public class Ej10ContarDigitos {
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Ej10ContarDigitos m = new Ej10ContarDigitos(); 
        // Llama al método para llenar la matriz de cadenas con dimensiones ingresadas
        String[][] matrizCadenas = m.LlenarMatrizCadenas(); 
        // Llama al método para contar dígitos en cada posición
        Integer[][] matrizDigitos = m.ContarDigitosEnMatriz(matrizCadenas);

        // Imprime la matriz original de cadenas
        System.out.println("Matriz de cadenas original:");
        m.ImprimirMatrizCadenas(matrizCadenas);
        
        // Imprime la matriz con cantidad de dígitos
        System.out.println("\nMatriz con cantidad de dígitos:");
        m.ImprimirMatrizNumeros(matrizDigitos);
    }

    // Método que crea una matriz de cadenas con dimensiones m*n ingresadas por el usuario
    public String[][] LlenarMatrizCadenas(){
        System.out.println("Ingrese el número de filas:");
        int filas = sc.nextInt();
        System.out.println("Ingrese el número de columnas:");
        int columnas = sc.nextInt();
        sc.nextLine(); // Limpia el buffer del scanner
        
        String[][] matriz = new String[filas][columnas];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Ingrese la cadena para posición [" + i + "][" + j + "]:");
                matriz[i][j] = sc.nextLine();
            }
        }
        return matriz;
    }
    
    // Método que cuenta la cantidad de dígitos en cada posición de la matriz
    public Integer[][] ContarDigitosEnMatriz(String[][] matrizCadenas){
        Integer[][] matrizDigitos = new Integer[matrizCadenas.length][matrizCadenas[0].length];
        for (int i = 0; i < matrizCadenas.length; i++){
            for (int j = 0; j < matrizCadenas[i].length; j++){
                matrizDigitos[i][j] = ContarDigitos(matrizCadenas[i][j]);
            }
        }
        return matrizDigitos;
    }
    
    // Método auxiliar que cuenta los dígitos en una cadena
    public int ContarDigitos(String cadena){
        int cantidad = 0;
        for (int i = 0; i < cadena.length(); i++){
            if (Character.isDigit(cadena.charAt(i))){
                cantidad++;
            }
        }
        return cantidad;
    }
    
    // Método para imprimir la matriz de cadenas
    public void ImprimirMatrizCadenas(String[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    // Método para imprimir la matriz de números
    public void ImprimirMatrizNumeros(Integer[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

}

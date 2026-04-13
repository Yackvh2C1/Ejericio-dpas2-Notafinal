import java.util.Scanner;

public class MetodosNotafinal {
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        MetodosNotafinal m = new MetodosNotafinal(); 
        // Llama al método para obtener la dimensión del arreglo
        int dimension = m.DimensionArreglo(); 
        // Llama al método para llenar el arreglo con las notas
        Double[] arreglo = m.LlenarArreglo(dimension); 
        // Llama al método para calcular la nota final
        Double notafinal = m.HallarNotafinal(arreglo); 

        // Imprime la nota final calculada
        System.out.println("La nota final es: " + notafinal);
    }

    // Método que solicita al usuario la cantidad de notas y devuelve ese número
    public int DimensionArreglo(){
        int dimension = 0;
        System.out.println("Ingrese la dimensión del arreglo");
        dimension= sc.nextInt();
        return dimension;
    }

    // Método que crea un arreglo y lo llena con notas ingresadas por el usuario
    public Double[] LlenarArreglo(int dimension){
        Double[] arreglo = new Double[dimension];
        for (int i= 0 ; i < arreglo.length; i++){
            System.out.println("Ingrese la nota: " + (i+1));
            arreglo[i] = sc.nextDouble();
        }
        return arreglo;
        
    }
    // Método que calcula la nota final (promedio) del arreglo de notas
    public Double HallarNotafinal (Double[] arreglo){
        Double notafinal = 0.0;
        Double suma = 0.0;
        for (int i= 0 ; i < arreglo.length; i++){
            suma = suma + arreglo[i];
        }
        notafinal = suma/arreglo.length;
        return notafinal;
    }


}

import java.util.Scanner;

    //clase pincipal vacia y metodos para cada proceso
public class ArregloNotafinal {
    public static void main(String[] args) {
            int dimension = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la dimensión del arreglo");
            dimension= sc.nextInt();
            Double[] arreglo = new Double[dimension];
            Double suma = 0.0, notafinal = 0.0;

            //llenar el arreglo
            for (int i= 0 ; i < arreglo.length; i++){
                System.out.println("Ingrese la nota: " + (i+1));
                arreglo[i] = sc.nextDouble();
                suma = suma + arreglo[i];
           
            }
            //calcular la nota final - promedio
            notafinal = suma/arreglo.length;
            System.out.println("La nota final es: " + notafinal);
    }

}


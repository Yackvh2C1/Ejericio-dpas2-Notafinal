import java.util.Scanner;

public class Notafinal {
        public static void main(String[]args) {
            Scanner sc = new Scanner (System.in);
            Double n1 = 0.0;
            Double n2 = 0.0;
            Double n3 = 0.0;
            Double n4 = 0.0;
            Double n5 = 0.0;
            Double n6 = 0.0;
            Double n7 = 0.0;
            Double n8 = 0.0;
            Double n9 = 0.0;
            Double n10= 0.0;
            Double NotaFinal = 0.0;
            System.out.println("Ingrese la nota 1");
            n1= sc.nextDouble();
            System.out.println("Ingrese la nota 2");
            n2= sc.nextDouble();
            System.out.println("Ingrese la nota 3");
            n3= sc.nextDouble();
            System.out.println("Ingrese la nota 4");
            n4= sc.nextDouble();
            System.out.println("Ingrese la nota 5");
            n5= sc.nextDouble();
            System.out.println("Ingrese la nota 6");
             n6= sc.nextDouble();
            System.out.println("Ingrese la nota 7");
             n7= sc.nextDouble();
            System.out.println("Ingrese la nota 8");
             n8= sc.nextDouble();
            System.out.println("Ingrese la nota 9");
             n9= sc.nextDouble();
            System.out.println( "Ingrese la nota 10");
             n10= sc.nextDouble();
             double sumar = n1+n2+n3+n4+n5+n6+n7+n8+n9+n10;
             NotaFinal = sumar/10;
                System.out.println("La nota final es: " + NotaFinal);
                
        }
}  

package context;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        //Menu
        while (opcion != 3) {

            System.out.println("\nMENU");
            System.out.println("1. Suma");
            System.out.println("2. Promedio");
            System.out.println("3. Salida");
            System.out.print("Elija una opción: ");

            opcion = sc.nextInt();

            // Switch
            switch (opcion) {

            case 1:
                int suma = 0;
                int num = -1;

                System.out.println("Digite números enteros");
                System.out.println("(Digite 0 para terminar)");

                while (num != 0) {

                    num = sc.nextInt();
                    suma += num;
                }

                System.out.println("Resultado: " + suma);
                break;

            case 2:
                System.out.println("Ingrese 10 números");

                int cantidad = 10;
                int adicion = 0;

                for (int i = 1; i <= cantidad; i++) {

                    System.out.print("Número " + i + ": ");
                    int numero = sc.nextInt();

                    adicion += numero;
                }

                double prom = (double) adicion / cantidad;
                System.out.println("Promedio: " + prom);
                break;

            case 3:
                System.out.println("Salir");
                break;
                
            default:
                System.out.println("¡ERROR!");
                System.out.println("No existe dicha opción");
                break;
            }
        }

        // Cierre Scanner
        sc.close();
    }
}
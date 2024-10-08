
package quiz1;

import java.util.Scanner;

public class Quiz1 {

    public static void main(String[] args) {
        int[] numeros = new int[20];
        ingresarNumeros(numeros);
        double promedioPares = calcularPromedioPares(numeros);
        double promedioImpares = calcularPromedioImpares(numeros);

        System.out.println("Promedio de numeros pares: " + promedioPares);
        System.out.println("Promedio de numeros impares: " + promedioImpares);
    }

    public static void ingresarNumeros(int[] numeros) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa 20 numeros enteros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        sc.close();
    }

    public static double calcularPromedioPares(int[] numeros) {
        int sumaPares = 0;
        int cantidadPares = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                sumaPares += num;
                cantidadPares++;
            }
        }
        return cantidadPares > 0 ? (double) sumaPares / cantidadPares : 0.0;
    }

    public static double calcularPromedioImpares(int[] numeros) {
        int sumaImpares = 0;
        int cantidadImpares = 0;
        for (int num : numeros) {
            if (num % 2 != 0) {
                sumaImpares += num;
                cantidadImpares++;
            }
        }
        return cantidadImpares > 0 ? (double) sumaImpares / cantidadImpares : 0.0;
    }
}

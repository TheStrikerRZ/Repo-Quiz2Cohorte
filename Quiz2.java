package quiz2;

import java.util.Scanner;

public class Quiz2 {

    public static void main(String[] args) {
        float[] alturas = new float[5];
        ingresarAlturas(alturas);
        float promedio = calcularPromedio(alturas);
        int masAltas = contarMasAltas(alturas, promedio);
        int masBajas = 5 - masAltas; // Total de personas menos las más altas

        System.out.println("El promedio de las alturas es: " + promedio);
        System.out.println("Personas mas altas que el promedio: " + masAltas);
        System.out.println("Personas mas bajas que el promedio: " + masBajas);
    }

    public static void ingresarAlturas(float[] alturas) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las alturas de 5 personas:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Persona " + (i + 1) + ": ");
            alturas[i] = sc.nextFloat();
        }
        sc.close();
    }

    public static float calcularPromedio(float[] alturas) {
        float suma = 0;
        for (float altura : alturas) {
            suma += altura;
        }
        return suma / alturas.length;
    }

    public static int contarMasAltas(float[] alturas, float promedio) {
        int contador = 0;
        for (float altura : alturas) {
            if (altura > promedio) {
                contador++;
            }
        }
        return contador;
    }
}


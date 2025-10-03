package ejercicio6;

import java.util.Scanner;

public class Factorial {
    // Método recursivo para calcular factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) { // Caso base
            return 1;
        } else {
            return n * factorial(n - 1); // Llamada recursiva
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            long resultado = factorial(num);
            System.out.println("El factorial de " + num + " es: " + resultado);
        }
    }
}

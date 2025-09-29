package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static int contarLetra(String texto, char letra, int indice) {
        if (indice == texto.length()) { // Caso base: fin de la cadena
            return 0;
        }
        // Si la letra coincide sumamos 1, si no sumamos 0
        int suma = (texto.charAt(indice) == letra) ? 1 : 0;
        return suma + contarLetra(texto, letra, indice + 1); // Recursión
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine();
        System.out.print("Ingrese la letra que desea contar: ");
        char letra = sc.next().charAt(0);

        int veces = contarLetra(texto, letra, 0);
        System.out.println("La letra '" + letra + "' aparece " + veces + " veces.");
    }
}

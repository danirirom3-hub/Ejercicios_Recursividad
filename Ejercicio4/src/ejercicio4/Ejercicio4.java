package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {
    public static int potencia(int base, int exponente) {
        if (exponente == 0) { // Caso base: cualquier número elevado a 0 = 1
            return 1;
        }
        return base * potencia(base, exponente - 1); // Llamada recursiva
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        int base = sc.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = sc.nextInt();

        int resultado = potencia(base, exponente);
        System.out.println(base + " ^ " + exponente + " = " + resultado);
    }
}

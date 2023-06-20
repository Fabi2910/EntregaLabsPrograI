/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio_1;

/**
 *
 * @author Andrey
 */
import java.util.Scanner;

public class laboratorio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        // Pedir numeros primos al usuario//
        
        System.out.print("Ingrese el limite para evaluar los numeros primos: ");
        int limit = scanner.nextInt();

        // Operacion //
        System.out.println("Numeros primos hasta el limite " + limit + ":");
        for (int number = 2; number <= limit; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

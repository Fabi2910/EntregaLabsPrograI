/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

/**
 *
 * @author tjean
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        // Solicitar al usuario el límite de evaluación
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el límite para evaluar números primos: ");
        int limit = scanner.nextInt();

        // Obtener la lista de números primos hasta el límite dado
        List<Integer> primes = getPrimesUpTo(limit);

        // Imprimir los números primos encontrados
        System.out.println("Números primos encontrados hasta " + limit + ":");
        for (int prime : primes) {
            System.out.println(prime);
        }
    }

    // Método para verificar si un número es primo
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // Verificar si el número es divisible por algún número menor que él
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Método para obtener una lista de números primos hasta el límite dado
    public static List<Integer> getPrimesUpTo(int limit) {
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        return primes;
    }
}

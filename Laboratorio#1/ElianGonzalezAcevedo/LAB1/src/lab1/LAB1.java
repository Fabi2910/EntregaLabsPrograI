/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

import java.util.Scanner;

// Clase librería para determinar si un número es primo
class PrimoUtils {
    // Método estático para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}

// Clase principal (Main)
public class LAB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el límite para evaluar los números primos: ");
        int limite = scanner.nextInt();

        System.out.println("Números primos hasta el límite " + limite + ":");

        for (int i = 2; i <= limite; i++) {
            if (PrimoUtils.esPrimo(i)) {
                System.out.println(i);
            }
        }
    }
}


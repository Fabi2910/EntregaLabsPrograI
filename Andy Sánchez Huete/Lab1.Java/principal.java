/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstapp;
import java.util.Scanner;
/**
 *
 * @author MMandysh
 */
public class principal {
    


    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el límite para la verificación de números primos
        System.out.println("Por favor, introduce el límite para verificar los números primos:");
        int limite = scanner.nextInt();

        // Iterar desde 2 hasta el límite
        for (int i = 2; i <= limite; i++) {
            // Utilizar la clase Matematicas para verificar si el número actual 'i' es primo
            if (Matematicas.esPrimo(i)) {
                // Si 'i' es primo, imprimirlo en la consola
                System.out.println(i + " es un número primo.");
            }
        }

        // Cerrar el scanner al final
        scanner.close();
    }
}

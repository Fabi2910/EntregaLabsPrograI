/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstapp;

/**
 *
 * @author MMandysh
 */
public class Matematicas {
    
    // Método estático para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        // Caso especial: los números menores a 2 no son primos
        if (numero < 2) {
            return false;
        }

        // Comprobación desde 2 hasta la raíz cuadrada del número
        for (int i = 2; i * i <= numero; i++) {
            // Si el número es divisible por 'i', entonces no es primo
            if (numero % i == 0) {
                return false;
            }
        }

        // Si no encontramos ningún divisor, entonces el número es primo
        return true;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio.pkg1;

import java.util.Scanner;

/**
 *
 * @author Anthony
 */


    /**
     */
   
    



public class Laboratorio1 {
    public static boolean esPrimo(int num) {
        //se comienza comprobando si el número es menor que 2   
        if (num < 2) {
            // Luego, se utiliza un bucle for
            return false;
        }
         // se iterara desde 2 hasta la raíz cuadrada del número
         //Si el número es divisible por algún valor dentro de ese rango, se devuelve false, lo que indica que no es primo. 
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        //Si el bucle finaliza sin encontrar ningún divisor, se devuelve true, lo que indica que el número es primo.
        return true;
    }



    public static void main(String[] args) {
         // Solicitar al usuario que ingrese el límite
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite el limite: ");
        int limit = scanner.nextInt();
        // Iterar desde 2 hasta el límite y verificar si cada número es primo
        for (int i = 2; i <= limit; i++) {
            if (Laboratorio1.esPrimo(i)) {                
                System.out.println(i);
            }
        }
    }
}   
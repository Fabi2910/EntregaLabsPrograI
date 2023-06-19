/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication25;

import java.util.Scanner;
/**
 *
 * @author Juanc
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el número límite
        System.out.print("Ingrese el límite para evaluar los números primos: ");
        int numero = scanner.nextInt();

        // Mostrar todos los números primos hasta el número ingresado
        System.out.println("Números primos hasta " + numero + ":");
        for (int i = 2; i <= numero; i++) {
            int divisor = 2;
            boolean esPrimo = true;

            while (divisor < i) {
                if (i % divisor == 0) {
                    esPrimo = false;
                }
                divisor++;
            }

         if (esPrimo) {
                System.out.println(i);
    
 }
         }
        }
    }


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

import java.util.Scanner;

public class Lab1 {
    // Método para verificar si un número es primo
    public static boolean Pri(int number) {
        
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
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //No pongo tildes ya que aparece un � en medio de las tildes
        System.out.print("Ingrese el limite de numeros que desea evaluar: ");
        int lim = scanner.nextInt();
        System.out.println("Numeros primos hasta " + lim + ":");
        
        for (int i = 2; i <= lim; i++) {
            if (Pri(i)) {
                System.out.println(i);
            }
        }
        
        scanner.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosprimos;

import java.util.Scanner;

/**
 *
 * @author minor.rojas
 */

public class NumerosPrimos {
    
    public static void main(String[] args) {
        
        //Se crea un objeto para leer el limite ingresado por el usuario
        Scanner lecturaLimite = new Scanner(System.in);
        
        //Se imprime mensaje en consola y se muestran resultados del ciclo i 
        System.out.println("Ingrese el limite de hasta donde se desea evaluar: ");
        int limite = lecturaLimite.nextInt();

        //Se imprime mensaje en consola y se muestran resultados del ciclo i 
        System.out.println("Los numeros primos hasta " + limite + " son:");

        // Se crea ciclo i para reconocer todos los numeros primos hasta el limite ingresado por el usuario
        for (int i = 2; i <= limite; i++) {
            boolean esNumPrimo = true;

            //Se crea ciclo u para reconocer numeros no primos
            for (int u = 2; u <= i / 2; u++) {
                if (i % u == 0) {
                    esNumPrimo = false;
                    break;
                }
            }
            // Se imprime en consola los numeros primos/resultados true en el ciclo i
            if (esNumPrimo) {
                System.out.println(i);
            }
        }
        //Se imprime mensaje de agradecimiento
        System.out.println("Gracias");
    }
}
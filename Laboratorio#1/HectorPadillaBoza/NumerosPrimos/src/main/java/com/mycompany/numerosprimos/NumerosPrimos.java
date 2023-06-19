/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosprimos;

import java.util.Scanner;

/**
 *
 * @author Hector Padilla Boza
 */
public class NumerosPrimos {

    public static void main(String[] args) {     
        
        Scanner lecturaTeclado = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        System.out.print("Ingrese un número: ");
        int numero = lecturaTeclado.nextInt();
        ValidarNumeroPrimo(numero);
        
        lecturaTeclado.nextLine();
        lecturaTeclado.close();
        
    }
    
    public static void ValidarNumeroPrimo(int numero){
        int i = 2; // Crea una variable int inciada en cero        
        while(i <= numero){ // Crea un bucle hasta el numero ingresado por el usuario
            boolean numPrimo = true;
            
            for(int j = 2; j < i; j++){ // Bucle que valida si un numero es primo
                if(i%j == 0)
                {
                    numPrimo = false;
                    break;
                }                
            }
            if(numPrimo)
            {
                System.out.println(i+ " "); // Imprime si hay un numero primo
            }
            i++;
           
        }
    }
}



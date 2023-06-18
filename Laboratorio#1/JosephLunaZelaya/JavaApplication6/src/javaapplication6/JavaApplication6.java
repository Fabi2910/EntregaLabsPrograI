/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;
import java.util.Scanner;
/**
 *
 * @author josep
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear un objeto Scanner para leer la entrada del usuario
            Scanner Leerdigito = new Scanner(System.in);

            // Pedir al usuario que ingrese un número 
            // Y capturarlo
            System.out.print("Ingresa un número: ");
            int ValorIngresado = Leerdigito.nextInt();
            
             // Mostrar todos los números primos hasta el número ingresado
             
            System.out.println("Los números primos desde 1 y "
                    + "hasta " + ValorIngresado + " son :");
            System.out.println("1");
               
                  for (int X = 1; X <= ValorIngresado; X++) {
                         int ContPrimos = 0;
                       for (int i = X; i >= 1; i--){
                        
                           if (X % i == 0) {
                              
                              ContPrimos = ContPrimos + 1 ;     
                            }
                       }       
                              
                   if (ContPrimos  == 2) {
                              
                       System.out.println(X);
                              
                        }    
                   }
              
                // Cerrar el objeto Scanner
            Leerdigito.nextLine();
            Leerdigito.close();  
     }
    }

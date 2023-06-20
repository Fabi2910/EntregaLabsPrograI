/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Benjamin VF
 */
public class Lab1 {

    public static void main(String[] args) {
        //Crear objeto Scanner para leer la entrada del usuario
        Scanner NumPrim = new Scanner(System.in); //Instanciar clase en un objeto
        
        // Pedir al usuario que ingrese un número
        System.out.print("Ingresa un numero: ");
        int numero = NumPrim.nextInt();
       
        // Mostrar todos los numeros primos hasta el numero ingresado
        System.out.print("Numeros primos hasta " + numero + ":");     
        System.out.println(2);
        for (int i = 1; i <= numero; i++) {
           int ContP = 0;
           
            for (int x = i; x >= 1; x--){
                if (i % x == 0) {
                ContP = ContP + 1 ;     
                }
            }       
                              
                if (ContP  == 2) {
                  System.out.println(i);
                              
                }
                
        }
                
        //Cerrar objeto Scanner
        NumPrim.nextLine();
        NumPrim.close();
    }
    
}

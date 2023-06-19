/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;

public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner (source: System. in);
    System.out.print(s:"Ingrese su nombre: ");
    int numero = scanner.nextInt();
    
    boolean esPrimo = true;
    if (numero <= 1){
        esPrimo = false;
    } else {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;                
            }
        }
    }
    if (esPrimo) {
        System.out.println(numero + "es un numero primo");
    } else {
        System.out.println(numero + "no es un numero primo");
        }
    }
}

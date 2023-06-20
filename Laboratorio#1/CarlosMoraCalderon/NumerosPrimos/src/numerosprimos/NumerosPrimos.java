/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosprimos;

import java.util.Scanner;

/**
 *
 * @author Carlos Mora
 */
public class NumerosPrimos {
    

    //se crea un proceso para verificar los numeros y si son primos o no
    public static void validacionnumerosprimos (int numero){
    //Primero se comprueba que el numero sea menor o igual que 1 ya que eso lo descartaria como numero primo
        if(numero <= 1){
            System.out.println(numero + " No es primo");
            return;
    }//despues se comprueba su divisibilidad ya que los numeros primos solo se pueden dividir entre ellos mismos o el 1
        for(int i = 2; i <= Math.sqrt(numero); i++){
            if(numero % i == 0) {
                System.out.println(numero + " no es primo");
                return;
            }
        }//Por ultimo si cumple con ser mayor que 1 y cumple con las reglas de division se solicita que se categorice como primo
        System.out.println(numero + " Es primo"); 
    }

    public static void main(String[] args) {
        
        // Se crea un objeto Scanner para leer entradas del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Se pide al usuario que ingrese el limite hasta el que desea evvaluar
        System.out.print("Ingresar limite:");
        int limite = scanner.nextInt();
        
        System.out.println("Numeros primos del 1 al " + limite + ":");
    for (int i = 1; i <= limite; i++) {
      validacionnumerosprimos(i);
    }
        
        //cerrar scanner
        scanner.close();
    }
}

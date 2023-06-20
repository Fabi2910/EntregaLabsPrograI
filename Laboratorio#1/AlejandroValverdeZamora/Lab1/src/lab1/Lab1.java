/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Alejandro Valverde
 */
public class Lab1 {

    public static void main(String[] args) {

        Scanner Lectura_Usuario = new Scanner(System.in);  // Crear objeto para almacenar el valor ingresado por el usuario 

        System.out.println("Ingrese un valor numerico : "); // Se crea un objeto para imprimir el mensaje al usuario y se le solicita un valor numerico.
        int numero = Lectura_Usuario.nextInt();

        System.out.println("Los numeros primos incluidos hasta " + numero + " son los siguientes:"); //Impresion de mensaje y resultados.

        for (int a = 2; a <= numero; a++) {
            boolean Numero_primo = true;   // Se crea un ciclo for para obtener el dato ingresado por el usuario y veirifcar si es numero primo.

            for (int b = 2; b <= a / 2; b++) {
                if (a % b == 0) {
                    Numero_primo = false;
                    break; // Break para salir del ciclo
                }
            }

            if (Numero_primo) {
                System.out.println(a); // Impresion de los resultados en consola.
            }
        }
    }
}

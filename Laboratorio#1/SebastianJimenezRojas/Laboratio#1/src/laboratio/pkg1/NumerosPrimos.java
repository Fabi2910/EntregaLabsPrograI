/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratio.pkg1;

/**
 *
 * @author 50683
 */
import java.util.Scanner;

/**
 *
 * @author 50683
 */
public class NumerosPrimos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre de usuario: ");
        String nombreUsuario = sc.nextLine();
        System.out.print("Ingrese el límite hasta donde desea evaluar: ");
        int limite = sc.nextInt();
        for (int i = 2; i <= limite; i++) {
            if (esPrimo(i)) {
                System.out.println(nombreUsuario + ", " + i + " es primo.");
            }
        }
    }

    public static boolean esPrimo(int numero) {
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            // Si es divisible por cualquiera de estos números, no es primo
            if (numero % x == 0) {
                return false;
            }
        }
        // Si no se cumple ninguna de las condiciones anteriores, el número es primo
        return true;
    }

}

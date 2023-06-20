
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Paola Brenes
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros primos que desea ver");
        int limite = sc.nextInt();
        System.out.println("Los numeros primos son:");
        int cantidad = 0;
        int numero = 2;
        while (cantidad < limite) {
            if (isPrimo(numero)) {
                System.out.println(numero);
                cantidad++;
            }
            numero++;
        }
    }
    public static boolean isPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

   

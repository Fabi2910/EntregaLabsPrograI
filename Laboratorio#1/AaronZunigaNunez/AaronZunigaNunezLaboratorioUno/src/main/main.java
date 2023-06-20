package main;

import java.util.Scanner;

/**
 *
 * @author Aar�n Z��iga N��ez
 */
public class main {

    public static void main(String[] args) {
        // Se crea objeto para la entrada de datos en la consola
        Scanner sc = new Scanner(System.in);

        // Se declaran dos variables, el l�mite y la cantidad de multiplos de un n�mero para saber si es m�ltiplo
        int limitePrimos = 0;
        int multiplos = 0;

        // Se le pide al usuario que ingrese el l�mite
        System.out.print("Digite hasta donde desea que se impriman n�meros primos:");
        limitePrimos = sc.nextInt();

        // Ciclo "i" para recorrer los n�meros hasta que sea igual l�mite ingresado
        for (int i = 0; i <= limitePrimos; i++) {
            // Se reinicia en cero los multiplos
            multiplos = 0;

            // Ciclo "j" para contar los multiplos del n�mero actual en el ciclo "i"
            for (int j = 1; j <= i; j++) {
                // Se calculo el residuo del n�mero actual del ciclo "i" por el n�mero actual del ciclo "j"
                // Si el residuo es igual a cero, el actual en el ciclo "j" ess un m�ltiplo y se agrega uno al contador
                if (i % j == 0) {
                    multiplos++;
                }
            }

            // Si el contador de multiplos es igual a dos, significa que solo se puede divir entre si y entre uno
            if (multiplos == 2) {
                System.out.println(i);
            }
        }
    }
}
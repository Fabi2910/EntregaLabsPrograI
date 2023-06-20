/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package investigacion.pkg1;

import java.util.Scanner;

/**
 *
 * @author Paola Brenes
 */
public class Investigacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, i, cant;
        int primos = 0;
        System.out.print("Ingrese el límite de la lista de numeros primos: ");
        num = leer.nextInt();
        cant = num;
        for(i=1; i<=cant; i++){
            if(EsPrimo(i))
                primos++;
        }
        System.out.println("Entre 1 y " + cant + " hay " + primos + " números primos.");
    }
    public static boolean EsPrimo(int num){
        int i;
        for(i=2; i<num; i++){
            if((num%i) == 0)
                return false;
        }
        return true;
    }
}   


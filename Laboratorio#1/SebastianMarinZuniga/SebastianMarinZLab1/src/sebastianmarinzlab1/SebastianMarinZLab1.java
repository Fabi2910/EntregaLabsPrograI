/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sebastianmarinzlab1;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class SebastianMarinZLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lecturanum = new Scanner(System.in);
        
        System.out.println("Ingrese un numero hasta el cual calular los numeros primos:");
        int NumeroaCalcular = lecturanum.nextInt();
        
        System.out.println("Estos son los numeros primos hasta "+ NumeroaCalcular + ":");
        for (int i = 1 ; i<= NumeroaCalcular; i++){//Profe lo intente hacer lo maximo, con lo aprendido en clase
                                                   //pero como aun no nos había explicado 
                                                   //el uso de el While, pense que no se podía utiliza
            if ( i % 2 !=0){
            System.out.println(i);
            }
        }
        lecturanum.nextLine();
        lecturanum.close();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author fabri
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        // numeros primos
        int limite; //limite para indicar hasta donde llegaria el for
        
        System.out.println("Ingrese un numero"); //linea de codigo donde mandamos a imprimir 
        limite = leer.nextInt();
        
        
        for(int i=1;i<limite;i++) { 
            int count=0;  // se declara una variable count
        for(int j=1;j<=i;j++) { 
        
            if(i%j==0)
                count++;
        } //se cierra el primer for
        if(count==2)
            System.out.println(i); //i es el indice del primer for
          
        
        }
        }  
    }
    

    

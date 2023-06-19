/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio1;

/**
 *
 * @author Adrián
 */

import java.util.Scanner;
 
public class Laboratorio1
        //PROCESO PARA DETECTAR NUMEROS PRIMOS
{
    public static void main(String[] ARGS)
    {
        //SE INICIA ESCANER PARA LEER LO QUE INGRESE EL USUARIO
        Scanner obtenerNumero = new Scanner(System.in);
        
        //VARIABLES
        int contador,I,numero;
 
        //IMPRESION DE PANTALLA SOLCITANDO AL USUARIO EL INGRESO DEL VALOR
        System.out.print("Ingresa un numero: ");
        numero = obtenerNumero.nextInt();
        
        //SE INICIA PROCESO PARA DETECTAR SI ES O NO NUMEROS PRIMOS
        //NUMERO PRIMO : Número entero que solamente es divisible por él mismo
        contador = 0;
 
        for(I = 1; I <= numero; I++)
        {
            if((numero % I) == 0)
            {
                contador++;
            }
        }
        //IMPRESION DE PANTALLA DEL RESULTADO FINAL SI ES PRIMO O NO EL NUMERO INGRESADO
        if(contador <= 2)
        {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
}
  
    

